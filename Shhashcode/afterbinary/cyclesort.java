import java.util.Arrays;

public class cyclesort {
    static void swap(int arr[],int i, int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        

        int arr[] = {5,4,3,2,1};
        int index = 0;
        while(index < arr.length){
            int el = arr[index];
            int ai = el - 1;

            if(arr[index] < arr.length && arr[index] != arr[ai] ){
                swap(arr,index,ai);
            }
            else{
                index++;

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
