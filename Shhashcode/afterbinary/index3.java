import java.util.Arrays;

public class index3 {

    public static void swap(int arr[], int st, int ed) {
        int tem = arr[st];
        arr[st] = arr[ed];
        arr[ed] = tem;
    }
    public static void main(String[] args) {
        int arr[] = {6,5,4,3,2,1};
        boolean flag = false;
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                    flag = true;
                    System.out.print(arr[j]);
                    // System.out.print(i);
                }
                
            }
            System.out.println("");
            if(!flag){
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
        
    }
}
