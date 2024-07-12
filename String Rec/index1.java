public class index1{

    static void subseq(String s1, String s2){
        if(s2.isEmpty()){
            System.out.println(s1);
            return;
        }
        
        char ch = s2.charAt(0);

        subseq(s1+ch, s2.substring(1));
        subseq(s1, s2.substring(1));
    }
    public static void main(String[] args) {
        

        subseq("","#Kunal%");
    }


}
