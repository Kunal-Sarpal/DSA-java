public class PR_4 { 
    public static void ans(int arr[],int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int newstart = end + 1;
            end = 2 * (start + 1);
            start = newstart;


        }
        int res;
        if(arr[end] < target){
            res = -1;
        }
        else{
            res = binarySearch(arr, target, start, end);

        }
        if(res != -1){
            System.out.println("Element found at index : "  +  res);
        }
        else{
            System.out.println("Element Not Found: ");
        };
    }

    public static int binarySearch(int arr[], int target, int start, int end){
        
        int s = start;
        int e = end;
        while(s <= e){
            int mid = s + (e - s)/2;
            
            if(arr[mid] == target){
                return mid;
            }
            else if(target > arr[mid]){
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {5, 11, 16, 27, 30, 33, 46, 54, 58, 61, 66, 78, 82, 94, 105, 110, 120, 128, 137, 140, 
            145, 156, 162, 171, 184, 193, 200, 205, 214, 225, 234, 239, 247, 258, 261, 274, 283, 
    
       };
        int target = 283;

        ans(arr,target);
    }
}
