public class PAT_1 {
    static public void  diamond(){
        int n = 5;
        for(int i = 0; i < 2*n; i++){
            int query =  i > n ? 2 * n - i:i;
            int noofspaces = n - query;
            for(int s = 0; s < noofspaces;s++){
                System.out.print(" ");
            }
            for(int j = 0; j < query; j++){
                System.out.print(j);
                
            }  
            System.err.println("");

        }
    }

    static void pattern23(int size){
        
        for(int row = 1; row <= 2*size; row++){


            int c = row > size ? 2 * size - row : row;

            for(int i = 0; i < size-c; i++){
                System.out.print("  ");
            }
            for(int col = c; col >= 1; col--){
                System.out.print((col + "+"));
            }
            for(int col1 = 2; col1 <= c; col1++){
                System.out.print((col1 + "-"));
            }
            System.out.println();
            
        }

    }

    static public void patetrn25(int n){
        int ros = 2 * n;
        for(int i = 1; i < ros; i++){
            for(int j = 1; j < ros; j++){

             int val = ros/2 - Math.min(Math.min(i,j), Math.min(ros - i, ros - j)) + 1;
             
             System.out.print(val + " ");
            
        }
        System.out.println("");
    }
}
    public static void main(String[] args) {
        
        // pattern23(5);
        patetrn25(4);
        
    }
}


