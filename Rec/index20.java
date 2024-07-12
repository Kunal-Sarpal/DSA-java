import java.util.ArrayList;

public class index20 {

    static ArrayList<String> subset(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

    
        ArrayList<String> left = subset(p+ch, up.substring(1));
        ArrayList<String> mid = subset(p, up.substring(1));
        ArrayList<String> right = subset(p + (ch + 0), up.substring(1));

        left.addAll(mid);
        left.addAll(right);
        return left;
        
    }
    public static void main(String[] args) {
        
        String str = "abc";
        System.out.println(subset("",str).toString());
    }
}
