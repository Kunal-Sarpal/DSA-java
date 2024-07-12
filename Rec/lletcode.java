public class lletcode {
    public static void main(String[] args) {
        String s = Integer.toBinaryString(128);

        // System.out.println(Integer.parseInt(s));
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                count++;
            }
        }
        System.out.println(count);
    }
}
