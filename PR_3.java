public class PR_3 {
    public static char binarySearch(char arr[], int s, int e, char elem) {

        // if((int)elem >= (int)arr[e-1]){
        // return arr[0];
        // }
        if (s > e) {
            return arr[s]; // aElement not found
            // floor -> Smallest Number gretaer than or equal to target
        }
        int start = s;
        int end = e;
        int mid = start + (end - start) / 2; 
        if ((int) elem == (int) arr[mid]) {
            return arr[mid + 1];
        } else if ((int) elem > (int) arr[mid]) {
            start = mid + 1;
            return binarySearch(arr, start, end, elem);
        } else {
            end = mid - 1;
            return binarySearch(arr, start, end, elem);

        }
    }

    public static void main(String[] args) {
        char arr[] = {'x','x','y','y'};
        int s = 0;
        int e = arr.length;
        // int mid = s + (e - s)/2;
        char target = 'g';
        if ((int) target >= (int) arr[e - 1]) {
            System.out.println(arr[0]); 
        } else {

            System.out.println(binarySearch(arr, s, e, target));
        }
    }
}

// public class PR_3{
// public static void main(String[] args) {
// char arr[] = {'c','f','j'};
// int s = 0;
// int e = arr.length;
// char elem = 'k';
// // int mid = s + (e - s)/2;

// System.out.println((int)arr[e-1] < (int)elem);
// System.err.println((int)(arr[e-1]));
// System.out.println((int)elem);
// }
// }
