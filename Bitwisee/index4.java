public class index4 {


    static void nthmagic(int num){
        int base = 5;
        int ans = 0;

        while(num > 0){
            int last = num & 1;
            num=num>>1;
            ans+=last*base;
            base=base*5;

        }

        System.out.println(ans);
    }
    public static void main(String[] args) {
        int num = 10;
        nthmagic(num);
    }
}
