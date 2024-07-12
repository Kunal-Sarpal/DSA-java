public class index2 {

    static void del(int pos1,int pos2,int arr[][]){
        if(pos1 == arr[pos1].length || pos2 == arr[pos1].length){
            System.out.println("Array index is out of bound");
            return;
        }

        del1D(arr[pos1],pos2);
    }

    static void del1D(int arr[],int pos){
        for(int i = pos; i < arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;
    }
    public static void main(String[] args) {
        
        // int arr[] = {3,4,12,9,13,2};
        // del1D(arr, 1);

        // for(int i: arr){
        //     System.out.print(i + " ");
        // }
        int arr[][] = new int[3][3];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++){
                arr[i][j] = i+j;
            }
        }

        for(int row[] : arr){
            for(int col: row){
                System.out.print(col + " ");
            }
            System.out.println();
        }

        del(3,3,arr);
        System.out.println("_______");
        for(int row[] : arr){
            for(int col: row){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
