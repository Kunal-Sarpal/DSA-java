public class reversestring {
    public static void main(String[] args) {
        // String str = "abcdef";
        // String str1 = "";

        // for(int i = str.length()-1; i >= 0; i--){
        //     str1+=str.charAt(i);
        // }
        // System.out.println(str1);

        StringBuilder str = new StringBuilder("KunalSarpal");

        for(int i = 0; i < str.length()/2; i++){
            char firstindex = str.charAt(i);
            char lastindex = str.charAt(str.length() - i - 1);
            str.setCharAt(i, lastindex);
            str.setCharAt(str.length() - i - 1, firstindex);
        }
        System.out.println(str);
    }
}
