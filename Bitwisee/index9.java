import java.util.ArrayList;
import java.util.Arrays;

public class index9 {

    static ArrayList<Integer> search(int arr[],ArrayList<Integer> list,int start,int end,int target){
        if(start > end){
            return list;
        }

        if(arr[start] == target){
            list.add(start);
   
        }
        
        if(end != start){

            if(arr[end] == target){
                list.add(end);
             
            }
        }
    

        return search(arr, list, start+1, end-1, target);
    }
    public static void main(String[] args) {
        int arr[] = {1,4,4,4,2,3,4,5,4,4,46,7,4};
        System.out.println(search(arr,new ArrayList<>(),0,arr.length-1,5).toString());
    }
}
