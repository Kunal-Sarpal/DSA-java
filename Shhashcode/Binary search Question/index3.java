public class index3{

    public static void main(String[] args) {
        
        
    }
    static public int smallesDivisor(int arr[],int t){
        if(arr.length > t){
            return -1;
        }
        int start = 0;
        int end = Integer.MIN_VALUE;

        for(int i = start; i < arr.length; i++) {
            if(end < arr[i]){
                end = arr[i];
            }
        }

        while(start <= end) {
            int mid = start + (end - start)/2;
            int res = -1;
            if(isSmallest(arr,mid,t)){
                res = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
    }

    static boolean isSmallest(int arr[], int div, int t){

        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + (arr[i]/div);
        }
        if(sum > t){
            return false;
        }
    }
    return true;
}