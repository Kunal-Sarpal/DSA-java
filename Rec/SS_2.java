import java.util.Arrays;

public class SS_2 {
    static int   findMax(int arr[],int length,int max){
        for(int i=0;i<length;i++){
            if(arr[i] > max){
                max = i;
            }
        }
        return max;
    }
    static void swap12(int i, int j,int arr[]) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void check(int arr[],int row,int col,int max){
        if(row == 0){
            return;
        }

        if(col < row){
            if(arr[col] > arr[max]){
                max = col;
            }
            check(arr,row,col+1,max);
        }
        else{
            swap12(max,row-1, arr);
            // max = 0;
            check(arr,row-1,0,0);

        }
    }
    public static void main(String[] args) {
        
        int arr[] = {4,3,53,23,42,21,33,45,6};
        int row = arr.length;
        int col = 0;
        int max = arr[0];
        check(arr,row,col,max);
        System.out.println(Arrays.toString(arr));
    }
}
