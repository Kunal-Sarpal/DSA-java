public class BitonicArray {

    static int findPeakElement(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int prev = (mid - 1 >= 0) ? mid - 1 : mid;
            int next = (mid + 1 < arr.length) ? mid + 1 : mid;

            if (arr[mid] > arr[prev] && arr[mid] > arr[next]) {
                return mid;
            } else if (arr[mid] < arr[next]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static void searchInBitonicArray(int arr[], int target) {
        int peakIndex = findPeakElement(arr);
        if (peakIndex == -1 || target > arr[peakIndex]) {
            System.err.println("Not Found");
            return;
        } else {
            if(target == arr[peakIndex]){
                System.err.println(peakIndex);
                return;
            }
            int ans = binarySearch(arr, 0, peakIndex, target, true);
            if (ans == -1) {
                ans = binarySearch(arr, peakIndex + 1, arr.length - 1, target, false);
            }
            if (ans == -1) {
                System.err.println("Not Found");
            } else {
                System.out.println("Found " + target + " at index: " + ans);
            }
        }
    }

    static int binarySearch(int arr[], int start, int end, int target, boolean ascending) {
        int s = start;
        int e = end;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (ascending) {
                if (arr[mid] < target) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            } else {
                if (arr[mid] < target) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6, 7, 8, 4, 3, 2, 1};
        searchInBitonicArray(arr, 6);
    }
}
