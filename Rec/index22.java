import java.lang.reflect.Array;
import java.util.ArrayList;

public class index22 {

    static ArrayList<String> permut(String p ,String up){
    if(up.isEmpty()){
        ArrayList<String> list = new ArrayList<>();
        list.add(p);
        return list;
    }
    char ch = up.charAt(0);
    ArrayList<String> ans = new ArrayList<>();
    for(int i = 0; i <= p.length(); i++){
        String f = p.substring(0,i);
        String s = p.substring(i,p.length());
        ArrayList<String> listnew = permut(f + ch + s, up.substring(1));
        ans.addAll(listnew);
    }
    return ans;
}
    public static void main(String[] args) {
        String arr = "abc";
        System.err.println(permut("",arr).toString());
      
    }
}
