public class PR_2 {
    public static int binarySearch(int arr[],int s,int e,int elem){
        if (s > e) {
            return arr[e]; // Element not found 
            // floor -> Smallest Number gretaer than or equal to target
        }
        int start = s;
        int end = e;
        int mid = start + (end - start)/2;
        if(elem == arr[mid]){
            return arr[mid-1];
        }
        else if(elem > arr[mid]){
            start = mid+1;
            return binarySearch(arr,start,end,elem);
        }
        else{
            end = mid-1;
            return binarySearch(arr,start,end,elem);

        }
    }
    public static void main(String[] args){
        int arr[] = {12,34,56,78,98,99,104,110};
        int s = 0;
        int e = arr.length;
        // int mid = s + (e - s)/2;
        System.out.println(binarySearch(arr,s,e,54));
    }
}
