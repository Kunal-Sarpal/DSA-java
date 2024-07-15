public class substring {
    public static void main(String[] args) {
        String str = "abc";
        int n = str.length();
        for(int startindex = 0; startindex < n; startindex++){
            for(int endIndex = startindex + 1; endIndex <= n; endIndex++){
                System.out.println(str.substring(startindex, endIndex));
            }
        }
    }   
}
