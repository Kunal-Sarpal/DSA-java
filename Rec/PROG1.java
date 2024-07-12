import java.util.Arrays;

public class PROG1{
    // static void printn(int col){
        
    //     if(col == 0) return;

       
    //     System.out.print("*");

    //     printn(col-1);
    // }
    // static void printPattern(int row){
    //     if( row == 0){
    //         return;
    //     }
    //     // System.out.println("* ");
    //     printPattern(row-1);
    //     System.out.println("");
    //     printn(row);

    // }


    
        static void printPattern(int arr[],int row, int col){
            if(row == 0){
                return;
            }
            if(col < row){
                if(arr[col-1] > arr[col]){
                    int temp = arr[col-1];
                    arr[col-1] = arr[col];
                    arr[col] = temp; 
                }
                System.out.print("* ");
                printPattern(arr,row, col+1);
            }else{
                System.out.println("s");
                printPattern(arr,row-1, 1);
            }
        }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        printPattern(arr,arr.length,1);
        System.out.println(Arrays.toString(arr));
    }
}