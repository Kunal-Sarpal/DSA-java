import java.util.Arrays;

public class index11 {
    static int findMax(int arr[],int end){
        int max = 0;
        for(int i = 0; i < end ;i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
    static void swap1(int arr[],int elem1, int elem2){
        int temp = arr[elem1];
        arr[elem1] = arr[elem2];
        arr[elem2] = temp;
    }

    static void printPatter(int row,int col,int arr[]){
        if(row == 0 ){
            return;
        }
        

        if(col < row){
            int max = findMax(arr,row);
            swap1(arr,max,row);
            System.out.print("*");
            printPatter(row, col+1,arr);
        }
        else{
            System.out.println("");
            printPatter(row-1, 0,arr);
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1,1,4,5,6,20,-34,645,45-300};
        printPatter(arr.length-1,0,arr);
        System.out.println(Arrays.toString(arr));
    }
}
