public class index1{

    static void solve(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

    

        int digit = up.charAt(0) - '0';
        for(int i = (digit-1)*3; i < (digit*3); i++){
                char newch = (char)('a' + i);
                solve(p + newch, up.substring(1));
        }
    }
    public static void main(String[] args) {
        
        String c = "";
        solve("",c);
    }

}