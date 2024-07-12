import java.util.Arrays;

public class PR_1{
    public static void swap(int i, int j,int arr[]){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void bubbleSort(int arr[]){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[i] >= arr[j]){
                    swap(i, j,arr);
                }
            }
        }
    }
    public static void main(String[] args){
        int arr[] = {2,3,4,5,7,8,9,0};

        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));


    }
}