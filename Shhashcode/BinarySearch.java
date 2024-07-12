public class BinarySearch {

    static void binarySearch(int arr[],int target){

        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                ans = mid;
            }
            if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        if(ans == -1){
            System.out.println("Answer not found");
        }
        else{
            System.out.println("Answer found: At index ::  " + ans);
        }
    }
    static void binarySearchReverse(int arr[],int target){

        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                ans = mid;
            }
            if(arr[mid] < target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        if(ans == -1){
            System.out.println("Answer not found");
        }
        else{
            System.out.println("Answer found: At index ::  " + ans);
        }
    }
   
   
    static void findfloor(int arr[],int target){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                ans = arr[mid];
                break;
                
            }
            if(arr[mid] < target){
                start = mid + 1;
                ans = arr[mid];
            }
            else{
                end = mid - 1;
            }
        }
       
            System.out.println("Floor Value of " + target + " : " + ans);
        
    }
    public static void main(String[] args) {
        
        int arr[] = {34,56,78,234,6777};
        // int arr[] = {9,8,7,5,4,3,2,1};
        int target = 10000;
        // if(arr[arr.length-1]  > arr[0]){
            // binarySearch(arr,target);
            findfloor(arr, target);
        // }
        // else{
        //     binarySearchReverse(arr, target);

        // }
    }
}
