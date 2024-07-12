import java.util.ArrayList;

public class index10 {

    static  ArrayList<Integer> skip(int arr[] ,int target, int index){

        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> comlist = skip(arr, target, index+1);
        list.addAll(comlist);
        
        return list;
    }
    public static void main(String[] args) {
        int arr[] = {4,4,3,2,12,34,56,4};
        int target = 4;
        int index = 0;
        System.out.println(skip(arr,target,index).toString());
    }
}
