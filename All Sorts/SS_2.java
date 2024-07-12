import java.util.Arrays;

public class SS_2 {
    static int findmax(int arr[],int start,int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
    static void swapp(int arr[],int max,int end) {
        int temp = arr[max];
        arr[max] = arr[end];
        arr[end] = temp;

    }

    public static void main(String[] args) {
        int arr[] = {863, 991, 785, 301, 456, 602, 946, 125, 273, -1000, 789, 588, 7, 942, 398, 74, 382, 134, 590, 856, 944, 314, 462, 617, 313, 949, 25, 791, 687, 422, 470, 842, 33, 533, 49, 145, 868, 210, 739, 522, 195, 89, 673, 920, 276, 943, 269, 27, 759, 688,34,45,67,78,8,89,23,23,23,1,-1,2,90,-2,4,34,45,56,67};

        for(int i = 0; i < arr.length; i++){

            int end = arr.length - i - 1;
            int max = findmax(arr,0,end);
            swapp(arr, max, end);
        }

        System.out.println(Arrays.toString(arr));

        // int arr1[] = {1,2,3,4,5};
        // for(int i = 1; i < arr1.length; i++){
        //     for(int j = 0; j < arr1.length-i; j++){
        //         System.out.print(arr1[j]);
        //     }
        //     System.out.println();
        // }
        // System.out.println(arr1.length);
        
        // System.out.println(max);
    }
}
