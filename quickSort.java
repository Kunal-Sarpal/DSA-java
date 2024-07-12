import java.util.Arrays;

public class quickSort{


    public static void Quick_Sort(int arr[], int low, int high){
        if(low >= high){
            return;
        }
        int start = low;
        int end = high;
        int mid = start  + (end - start)/2;
        int pivot = arr[mid];


        while(start <= end){

            while(arr[start] < pivot){
                start++;
            }
            while(arr[end] > pivot){
                end--;
            }

            if(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

            Quick_Sort(arr,low,end);
            Quick_Sort(arr,start,high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {34,56,23,45,779,3,54,56,78,342,1,2,435};

        Quick_Sort(arr,0,arr.length - 1);


        System.out.println(Arrays.toString(arr));       
    }
}