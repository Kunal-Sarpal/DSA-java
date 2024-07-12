public class LinearSearch {

    static void findd(){
        int target = 90;
        int arr[]= {23,12,34,45,23,3,4,5,6,7,34,56,76,56,34};
        int ans = -1;
        int newarr[] = new int[arr.length];
        int k = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                newarr[k] = i;
                k++;
            }
        }
        if(k == 0){
            System.out.println("Element not found");
        }
        else{
            for(int i = 0; i < k; i++){
                System.out.print(newarr[i] + " ");
            }
        }
    }
    

    static void serach2D(){
        int arr[][] = {
            {2,3,4,5,6},
            {5,4,3,2,1},
            {7,4,5,62,2},
            {89,56,23,34,4}
        };
        int target = 4;
        int outerindex = -1;
        int innerindex = -1;
        boolean lastindex = true;

        for(int i = 0; i < arr.length; i++){
            boolean found = false;
            for(int j = 0; j < arr[i].length; j++){

                if(arr[i][j] == target){
                    outerindex = i;
                    innerindex = j;
                    if(lastindex == false){
                        found = true;
                        break;

                    }
                }
              
            }

            if(found == !false){
                break;
            }

        }

        System.out.println(outerindex + " " + innerindex + " " );
    }
    

    static void findMaxsumSubArray(){
        int arr[][] = {
            {2,3,4,5,600},
            {5,4,3,2,1},
            {7,4,5,62,2},
            {89,56,23,34,4}
        };
        int max = Integer.MIN_VALUE;
        int resindex = -1;

        for(int i = 0; i  < arr.length;i++){
            int sum = 0;
            for(int j = 0; j < arr[i].length;j++){
                sum = sum + arr[i][j];
            }
            if(sum > max){max = sum; resindex = i;}
        }
        System.out.println(resindex);
    }
    
    public static void main(String[] args) {
        
        // serach2D();
        // findMaxsumSubArray();
        int mid =  1000000000 + 1000000000 + 900000000;
        System.out.println(mid);
        
    }
}
