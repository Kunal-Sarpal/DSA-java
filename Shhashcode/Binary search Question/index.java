public class index{


    static int bookAllocation(int arr[], int students){
        if(students > arr.length){
            return -1;
        }
        int start = Integer.MIN_VALUE;
        int end = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > start){
                start = arr[i];
            }
            
            end+=arr[i];
        }
        int res = -1;
        while(start <= end){
            // max number of
            int mid = start + (end - start)/2;

            // if allocation is possible mimize the number of pages;

            if(allocationPossible(arr,mid,students)){
                res = mid;
                end = mid-1;
            }
            else{
                start = mid+1;

            }
        }

        return res;
    }

    static boolean allocationPossible(int arr[], int maxpage,int students){
        int currentStudent = 0;
        int pages = 0;

        for(int i=0;i<arr.length;i++){
            pages+=arr[i];
            //  pages exceeded maxpage
            if(pages>maxpage){
                currentStudent++;
                // allocate to next student
                pages = arr[i];

            }
            if(currentStudent > students){
                return false;
            }
        }
         
        return true;
    }

    static boolean isAllocatioPossible(int stalls[], int mindist, int cows){

        int cowsallo = 0;
        int lastcowdistance = stalls[0];
        for(int i = 0; i < stalls.length; i++){
            if(stalls[i] - lastcowdistance >= mindist){
                cowsallo+=1;
                lastcowdistance = stalls[i];

            }
            if(cowsallo > cows){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args){

        int arr[] = {34,56,234,78};
        int students = 2;
        bookAllocation(arr,students);
    }
}