import java.util.Arrays;

public class mergerSort {

    static void merge(int start,int end, int arr[],int mid){
        int temp[] = new int[end - start + 1];

        int s1 = start;
        int s2 = mid+1;
        int k = 0;

       while(s1 <= mid && s2 <= end){
          if(arr[s1] <= arr[s2]){
            temp[k++] = arr[s1++];
          }
          else{
            temp[k++] = arr[s2++];
          }
       }

       while(s1 <= mid){
        temp[k++] = arr[s1++];
       }
       while(s2 <= end){
        temp[k++] = arr[s2++];
       }

       for(int i = 0; i < temp.length; i++){
            arr[start + i] = temp[i];
       }
    }

    static void mergersort(int arr[], int start, int end){
        if(start >= end) return;

        int mid = start + (end - start) /2;
        mergersort(arr, start, mid);
        mergersort(arr, mid+1, end);

        merge(start,end,arr,mid);
    }



    public static void main(String[] args) {

        int arr[] = {5,4,3,2,1};

        mergersort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        
    }
}
