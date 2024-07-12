public class index23 {

    static ArrayList<ArrayList<Integer>> permut(int arr[], int start, int end){
        if(arr.length == 0){
            return;
        }

        int arr1[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            int com = arr[i];
            for(int j = 0; j < arr.length; j++){

                int index1 = (0 + i);
                int index2 = Math.abs(i - arr.length);
                
                arr1[index1] = arr[index1];
                arr1[index1] = arr[index2];
                arr[rest] = com;
                
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};

        permut(arr,0,arr.length-1);
    }
}