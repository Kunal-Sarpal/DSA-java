import java.util.Arrays;

public class Merge_1 {

    public static void merge(int arr[] ,int mid, int s, int e){
        int mergedarr[] = new int[e-s + 1];

        int start1 = s;
        int start2 = mid+1;
        int merindex = 0;
        while(start1 <= mid && start2 <= e){
            if(arr[start1] <= arr[start2]){
                mergedarr[merindex++] = arr[start1++];
            }else{
                mergedarr[merindex++] = arr[start2++];
            }
        }
        while(start1 <= mid){
            mergedarr[merindex++] = arr[start1++];
        
        }
        while(start2 <= e){
            mergedarr[merindex++] = arr[start2++];
        
        }
        for(int i = 0 ,j = s; i < mergedarr.length; i++,j++){
            arr[j] = mergedarr[i];
        }

    
        
    }
    public static void mergesort(int arr[],int s,int e){

        if(s >= e){
            return;
        }
        int mid = s + (e - s)/2;

        mergesort(arr,s,mid);
        mergesort(arr,mid+1,e);
        merge(arr,mid,s,e);

    }
     public static void main(String[] args) {
        int arr[] = {5,4,3,2,1,4,3,5,7,78,7989};
        mergesort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
