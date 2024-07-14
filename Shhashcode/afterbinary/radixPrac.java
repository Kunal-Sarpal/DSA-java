public class radixPrac {

    public static void main(String[] args) {

        int arr[] = { 5, 4, 3, 2, 1 };

        radixsort(arr);
    }

    public static void radixsort(int[] arr) {
        int n = arr.length;
        int maxEle = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] > maxEle){
                maxEle = arr[i];
            }
        }

        if(n == 0){
            System.err.println("Empty array");
            return;
        }

        for(int digit = 1; maxEle / digit > 0; digit*=10){
            countingSortWithDigit(arr, digit);
        }


    }
    public static void countingSortWithDigit(int arr[], int digit){
        int n = arr.length;
        int k = 9;
        int res[] = new int[n];
        int countArr[] = new int[k + 1];

        for(int i = 0; i < n; i++){
            int index = (arr[i] / digit) %10;
            countArr[index] +=1;
        }

        for(int i = 0; i <= k; i++){
            countArr[i] += countArr[i-1];
        }

        for(int i = n - 1; i >= 0; i--){
            int val = arr[i];
            int countIndex = (arr[i] / digit) % 10;
        }
    }
}
