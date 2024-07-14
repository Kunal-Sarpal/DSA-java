import java.util.Arrays;

public class count2 {
    
    static void countingSort(int arr[], int digit){

         int k = 9; // k will always nine

        int countArr[] = new int[k + 1];
        for (int i = 0; i < k; i++) {
            int ind = (arr[i]/digit) % 10;
            countArr[ind] += 1;
        }
        System.out.println("countArr: " + Arrays.toString(countArr));

        // find cumilative frequency
        for (int i = 1; i <= k; i++) {
            countArr[i] += countArr[i - 1];
        }
        System.out.println("cummulative arr: " + Arrays.toString(countArr));

        int sArr[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            int val = arr[i];
            int countInd = (arr[i] / digit) % 10;

            int countval = --countArr[countInd];
            sArr[countval] = val;

        }
        for(int i = 0; i < sArr.length; i++){
            arr[i] = sArr[i];
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr));
       
    }
    public static void main(String[] args) {
        int arr[] = { 6, 5, 3, 4, 2, 1, 4, 8, 7 };
        int  max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) max = arr[i];
        }

        for(int digit = 1; max / digit > 0 ; digit *=10){
            countingSort(arr, digit);

        }
        // System.out.println(Arrays.toString(arr));
    }

}
