import java.util.Arrays;

public class index2 {
    static int check(int arr[]){
        int unique = 0;
        // int i = 0;
        
        for(int i: arr){
            unique^= i;
        }
        return unique;
    }

    static void getithbit(int num,int i){

        int bit = num ^ (1 << (i - 1));

        // if(bit == 0){
        //     System.out.println("0");
        // }
        // else{
        //     System.out.println("1");
        // }
        System.out.println(bit);
    }

    static void posRightBit(int num){
        
        int count = 0;

        while((num & 1) != 1){
            count++;
            num = num >> 1;
        }
        System.out.println(count+1);
    }

    
    

    public static void main(String[] args) {
        int arr[] = {6,1,1,1,2,2,9,9,3,3,3,2    };
        // Arrays.sort(arr);
        // System.out.println(check(arr));

        // getithbit(16,1);

        posRightBit(182);
    }
}
