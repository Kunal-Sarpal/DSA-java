import java.util.Arrays;

public class index12 {


    static void quick_sort(int arr[], int low, int high){

        if(low >= high){
            return;
        }
        int s = low;
        int e = high;
        int pivot = arr[s + (e-s)/2];
        
        while(s <= e){
            while(arr[s] < pivot){
                s++;
            }
            while(arr[e] > pivot){
                e--;
            }
            // if(s <= e){

                int tem = arr[s];
                arr[s] = arr[e];
                arr[e] = tem;
                s++;
                e--;
            // }

        }
        quick_sort(arr, low, e);
        quick_sort(arr, s, high);
      
    }
    public static void main(String[] args) {
        int arr[] = {10,20,1,4,9,6,8,20};
        quick_sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
