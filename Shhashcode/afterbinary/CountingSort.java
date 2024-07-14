import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 2, 0, 7, 3, 4, 3, 2 };
        int n = arr.length;

        // Find max
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Handle empty array case
        if (n == 0) {
            return;
        }

        // Create count array
        int countArr[] = new int[max + 1];

        // Find the frequency of each element
        for (int i = 0; i < n; i++) {
            int index = arr[i];
            countArr[index]++;
        }

        // Find cumulative frequency
        for (int i = 1; i <= max; i++) {
            countArr[i] += countArr[i - 1];
        }

        // Create result array to store sorted elements
        int res[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int val = arr[i];
            int countVal = --countArr[val]; // Decrement count and get the index
            res[countVal] = val;
        }

        // Print sorted array
        System.out.println(Arrays.toString(res));
    }
}
