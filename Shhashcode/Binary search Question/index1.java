public class index1 {

    static int  minEatingspeed(int arr[],int h){

        if(h > arr.length){
            return -1;
        }
        int start = 1;
        int end = Integer.MIN_VALUE;

        for(int i = 0; i< arr.length; i++){
            if(end < arr[i]){
                end = arr[i];
            }
        }
        int ans = -1;

    

        while(start <= end){
            int mid = start + (end - start)/2;

            if(iseatingspped(arr,mid,h)){
                ans = mid;
                end = mid - 1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }

    boolean iseatingspped(int arr[],int eatingspeed,int h  ){
        int hoursspend = 0;

        for(int i=0;i<arr.length;i++){
            hoursspend = arr[i]/eatingspeed;
            if(arr[i]%eatingspeed != 0){
                hoursspend++;

            }
            if(hoursspend > h){
                return false;
            }
        }
        return true;
    }
        
    public static void main(String[] args) {
        
        int arr[] = {3,6,7,11};
        int h = 8;
        minEatingspeed(arr,h);
        
    }
}
