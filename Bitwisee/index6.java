public class index6 {

    static int sumofdigit(int num){
        if(num == 0){
            return 0;
        }
        
        return (num%10) +  sumofdigit(num/10);
        // System.out.println(sum);
        
    }
    public static void main(String[] args) {
        int num = 1243;
        System.out.println(sumofdigit(num));
    }
}