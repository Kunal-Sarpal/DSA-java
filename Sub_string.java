public class Sub_string {

    static String skip(String p, String s, char c){
        if(s.isEmpty()){
            return p;
        }

        char firstChar = s.charAt(0);
        if(firstChar == c){
            return skip(p,s.substring(1),c);
        }
        else{
            return skip(p + firstChar, s.substring(1), c);
        }
        // return p;
    }
    public static void main(String[] args) {
        
        System.out.println(skip("","bfffsssssbfdfd",'sx '));
    }
}
