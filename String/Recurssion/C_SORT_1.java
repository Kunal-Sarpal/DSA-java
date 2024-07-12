public class C_SORT_1{

    static int Is_Sort(int arr[],int index,int target){
        if(index == arr.length - 1){
            if(arr[index] == target){
                return index;
            }
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return Is_Sort(arr, index+1,target);

    }
    public static void main(String[] args) {
        

        int arr[] = {1,2,333,4,5,6,7,8,9,1847};


        System.out.println(Is_Sort(arr,0,1847) == -1 ? "Not found" : "Found");
    }
}