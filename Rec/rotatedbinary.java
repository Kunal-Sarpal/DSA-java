public class rotatedbinary {

    static int rotatedbinary1(int arr[], int start, int end,int target){
        if(start > end){
            return -1;
        }

        int mid = start + (end - start)/2;
        if(arr[mid] == target) return mid;

        if(arr[start] <= arr[mid]){
            if(target >= arr[start] && target <= arr[mid]){
                return rotatedbinary1(arr, start, mid-1, target);
            }
            else{
                return rotatedbinary1(arr, mid+1, end, target);
            }
        }

       
        if(target > arr[mid] && target <= arr[end]){
                return rotatedbinary1(arr,mid+1, end, target);
            }
        else{

            return rotatedbinary1(arr,start, mid-1, target);
        }
            
        
    }
    public static void main(String[] args) {

        int arr[] = {7,8,9,10,1,2,3};
        int start = 0;
         int end = arr.length-1;
        System.out.println(rotatedbinary1(arr,start,end,9));
    }
}
