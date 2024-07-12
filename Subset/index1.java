import java.util.ArrayList;
import java.util.Arrays;

public class index1{


    static ArrayList<String> subSeq(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> l = new ArrayList<String>();
            l.add(p);
            return l;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subSeq(p+ch, up.substring(1));
        ArrayList<String> right = subSeq(p, up.substring(1));

        left.addAll(right);

        return left;
    }
    public static void main(String[] args) {
        System.out.println(subSeq("","ABCDEFGHIJKL").toString());
    }
}