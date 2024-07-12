public class index2 {

    static int  solve(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int left = solve(r-1,c);
        int right = solve(r,c-1);
        return left + right;
    }

    static void path(String p, int r, int c){
        if(r == 1 && c == 1){
            System.err.println(p);
        }
        if(r > 1 && c > 1){
            path(p + 'D', r-1, c-1);

        }
        if(r > 1){
            path(p + 'V', r-1, c);
        }
        if(c > 1){
            path(p + 'H', r, c-1);
        }
    }
    public static void main(String[] args) {
        // System.out.println(solve(3,3));
        path("",500000,5);
    }
}
