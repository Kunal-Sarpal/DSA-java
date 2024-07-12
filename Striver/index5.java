public class index5 {

    static void callg(int n){
        if(n==2){
            return;
        }
        callg(n-1);
        System.out.println("Before/t/t"  + n);
    }

    static void check(int n){
        for(int i = 0; i < 5;i++){
            if(i == 2){
                continue;
            }
            callg(5);
            System.out.println("After "  + i);
        }
    }
    public static void main(String[] args) {
        check(5);
    }
}
