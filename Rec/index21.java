import java.util.ArrayList;
import java.util.Arrays;

public class index21 {

    static ArrayList<ArrayList<Integer>> subArray(int arr[]){
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<Integer>());

        int start = 0;
        int end = 0;
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            start = 0;
            if(i > 0 && arr[i] == arr[i-1]){
                start = end+1;
            }
            end = outer.size();
            // int size = outer.size();
            for(int j = start; j < end; j++ ){
                ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2};
        System.out.println(subArray(arr).toString());
    }
}
