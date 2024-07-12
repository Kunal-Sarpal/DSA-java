public class PROG1_java {

    static boolean isPalindrome(String s){
        int p = 0;
        for(int i = 0 ; i < s.length()/2; i++){
            char a = s.charAt(i);
            char b = s.charAt(s.length()-i-1);
            p++;
            if(a != b){
                System.out.println((s.length()-1 -p)  + " Total Palindromes");
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        String s = "ssssasbcdcfbsassss";
        if(isPalindrome(s)){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
}