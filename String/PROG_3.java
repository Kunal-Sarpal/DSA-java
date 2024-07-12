import java.util.Arrays;

public class PROG_3 {
    

    static int helper(int n, int c){
        if(n == 0){
            return c;
        }
        
        int rem = n%10;
        if(rem == 0){
            return helper(n/10, c+1);
        }
        return helper(n/10,c);
    }
    static void Count_S(int n){
        
        int res = helper(n, 0);
        System.out.println(res);
    }
    public static void main(String[] args) {
      
        Count_S(100003400);
      
    }
}