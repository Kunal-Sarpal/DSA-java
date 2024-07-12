public class PROG_2 {

    static int fibonacci(int n){

        if(n == 0 || n == 1){
            return n;
        }
        
        return fibonacci(n-2) + fibonacci(n-1);
        // System.out.print(n + " ");
    }
    public static void main(String[] args) {
        for(int i = 0 ; i <=10; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }
}
