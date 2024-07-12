import java.util.Arrays;

public class index3 {

    static void countBits(int i, int[] arr) {
        int bitPosition = 0;
        while (i > 0) {
            if ((i & 1) == 1) {
                arr[bitPosition]++;
            }
            bitPosition++;
            i = i >> 1;
        }
    }

    static int[] countUnknown(int[] arr) {
        int max = 0;
        for (int value : arr) {
            max = Math.max(max, Integer.toBinaryString(value).length());
        }

        int[] countBit = new int[max];

        for (int i : arr) {
            countBits(i, countBit);
        }
        return countBit;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 2, 2, 2, 4 ,256};
        System.out.println(Arrays.toString((countUnknown(arr))));
    }
}
