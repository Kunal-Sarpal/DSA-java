import java.util.Arrays;

public class IS_5 {
    public static void main(String[] args){

        int arr[] = {33335,4,3,2,7,5,-999999999,34,3,23,875645};

        for(int i = 0; i < arr.length-1; i++){
            for(int j = i + 1; j > 0; j--){
               
                if(arr[j] <= arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j-1] = temp;
                    // j--; 

                }
                else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
