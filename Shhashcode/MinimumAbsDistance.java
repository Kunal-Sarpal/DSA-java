import java.util.Arrays;

public class MinimumAbsDistance {

    static void minAbsDistance(int arr[], int target) {
        // Ensure the array is sorted
        Arrays.sort(arr);

        // Initialize variables for binary search
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        // Perform binary search
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid;
                break;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // Determine the minimum absolute difference
        int res = -1;
        if (ans == -1) {
            if (end == -1) {
                res = Math.abs(arr[start] - target);
                System.out.println(res);
            } else if (start == arr.length) {
                res = Math.abs(arr[end] - target);
                System.out.println(res);
            } else {
                int ans1 = Math.abs(arr[end] - target);
                int ans2 = Math.abs(arr[start] - target);
                System.out.println(Math.min(ans1, ans2));
            }
        } else {
            System.out.println(0);
        }
    }

    static void binarySearch(int arr[], int target){
        
        int range[] = range(arr,target);
        int start = range[0];
        int end = range[1];
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                ans = mid;
                end = mid-1;
                
            }
            if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        if(ans == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println(ans);
        }


    }
    static int[] range(int arr[], int target){
        int range[] = new int[2];
        int start = 0;
        int end = 1;

        
            
            while(arr[end] < target){
                start = end;
                end = 2*end;
            }
            range[0] = start;
            range[1] = end;
            return range;
        
       


        
    }
    public static void main(String[] args) {
        int arr[] = {0,0,0,0,0,1,1,1,1,1,1};
        // minAbsDistance(arr, 367);
        // System.out.println(Arrays.toString(range(arr, 355)));

        binarySearch(arr, 1);
    }
}
