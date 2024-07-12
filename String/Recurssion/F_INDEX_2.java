import java.util.ArrayList;

public class F_INDEX_2 {

    static ArrayList<Integer> findindex(int arr[], ArrayList<Integer> list, int index,int target){
        if(index == arr.length - 1){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findindex(arr, list, index+1, target);

        
    }
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<Integer>();
        
        int arr[] = {1,2,3,4,5,6,7,2,2,3,7,8,9,2,3,4,5};

        System.out.println(findindex(arr,new ArrayList<>(),0,78).toString());
    }
}
