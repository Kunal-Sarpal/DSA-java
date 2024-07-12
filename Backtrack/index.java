public class index{

    static void maze(int r,int c,String p){

        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
    
            if(r > 1) maze(r-1,c ,p + 'V');

            if(r == c)  maze(r-1,c-1, p + 'D');
     
            if(c > 1) maze(r,c-1,p + 'H');
        
        
    }
    public static void main(String[] args) {
        maze(3,3,"");
}
}