public class index{

    static int fact(int n){
        if(n  <= 1){
            return 1;
        }
        return  fact(n-2) + fact(n-1);
    }
    public static void main(String[] args) {
        System.out.println(fact(30));
    }
}