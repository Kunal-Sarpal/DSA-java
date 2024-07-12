public class index{

    static void gcd(int num1, int num2){
        int min = (num1 > num2)?(num2):(num1);

        while(min > 0){
            if(num1%min == 0 && num2%min == 0){
                System.err.println(min);
                break;
            }
            min--;
        }
    }
    static void gcdEuclid(int num1,int num2){
        
        while(num1 != 0 && num2 != 0){
            if(num1 > num2){
                num1-=num2;
            }
            else{
                num2-=num1;
            }

        }
        int res = num1;
        if(num1 == 0){
            res = num2;
        }

        System.out.println(res);
    
    }
    static int EfficientgcdEuclid(int num1,int num2){
        
        while(num1 != 0 && num2 != 0){
            if(num1 > num2){
                num1%=num2;
            }
            else{
                num2%=num1;
            }

        }
        int res = num1;
        if(num1 == 0){
            res = num2;
        }

        return res;
    
    }

    static void lcm(int num1, int num2){
        int l = (num1*num2)/EfficientgcdEuclid(num1,num2);
        System.out.println(l);
    }
    static void printBits(int num){

        for(int i = 7; i >= 0;i--){
            
            System.out.print((num >> i) & 1);
        }
        System.out.println();
    }
    
    static void isOddEven(int num){
        if((num & 1) == 1) System.out.println("odd");
        else System.out.println("Even");
    }
    

    static void toogle(int num){
        int i = 1;
        printBits(num);

        num = (num & (~(1 << i-1)));

        printBits(num);
    }
   
    static char toLowerCaseChar(char ch){
        

        int num = (int)ch | (1<<5);

       return (char)num;
    }
    static char toUpperCaseChar(char ch){
        

        int num = (int)ch ^ (1<<5);

       return (char)num;
    }
    static void toLowerCase(String s){
        
        String news = "";
       for(int i = 0; i < s.length(); i++){
            news+=toLowerCaseChar(s.charAt(i));
       }
       
       System.out.println(news);
    }
    static void toUpperCase(String s){
        
        String news = "";
       for(int i = 0; i < s.length(); i++){
            news+=toUpperCaseChar(s.charAt(i));
       }
       
       System.out.println(news);
    }

    sttaic void check(){
        int newarr[] = new int[sizeof(int)];
        while(i < arr.length){
            while( j != 0){
                j=j>>1;
                if(j == 1){
                    newar[[arr.lengt0 ]++]
                }
            }
        }
    }


    public static void main(String[] args) {
        // gcd(24,100);
        // gcdEuclid(24,36);
        // lcm(24, 36);
        // printBits(35);
        // isOddEven(99);
        // toogle(126);
        // toLowerCaseChar('A');
        toLowerCase("KUNAL");
        toUpperCase("kUnal");
    }
}