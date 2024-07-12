import java.util.ArrayList;

public class index30 {

    static ArrayList<String> pad(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }

        int digit1 = up.charAt(0) - '0';
        ArrayList<String> ans = new ArrayList<>();
        int digit = digit1-1;


        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            ans.addAll(pad(p + ch, up.substring(1)));
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<String> results = pad("", "12");
        System.out.println(results);
    }
}
