public class index{


    static String skipApple(String s){
        if(s.isEmpty()){
            return ""; //
        }
        char c = s.charAt(0);
        if(!s.startsWith("apple") && s.startsWith("app")){
            return skipApple(s.substring(3));
        }
        else{
            return c + skipApple(s.substring(1));
        }
        
    }
    public static void main(String[] args) {
        
        String s = "applepieApplejuiceappbananaapplegrapeApplemangoappleredappappleAppleapp"
;
        System.out.println(skipApple(s));
    }
}