import java.util.Arrays;

public class index5 {
    public static void main(String[] args) {
        
        String s = "";
        for(int i = 0; i < 1; i++){
            // char ch = 'a';
           char ch = (char) ('a' - '0');

            s+=ch;
        }
        System.out.println(s);
        System.out.println('a' - '0');

        String name = "Kunal           kunal sarpal              jatt mehkma chmara mehkam    chuchamki";

        name = name.replaceAll("\\s+"," ");
        System.out.println(name);
        // System.out.println(Arrays.toString(newname));
    }
}
