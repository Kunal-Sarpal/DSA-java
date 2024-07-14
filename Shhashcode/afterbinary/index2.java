import java.util.Arrays;

public class index2 {
    public static void swap(int arr[], int st, int ed) {
        int tem = arr[st];
        arr[st] = arr[ed];
        arr[ed] = tem;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };

        for (int i = 0; i < arr.length; i++) {

            int minEle = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < minEle) {
                    minEle = arr[j];
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }

        System.out.println(Arrays.toString(arr));
    }
}