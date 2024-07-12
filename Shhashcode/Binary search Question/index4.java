public class index4 {


    static int solve(int stalls[], int n, int c){

        if(stalls.length < c){
            return -1;
        }

        int start = 0;
        int end = Integer.MIN_VALUE;

        for(int i = 0; i < stalls.length; i++){
            if(end < stalls[i]){
                end = stalls[i];
            }
        }
        int res = -1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(isAllocatioPossible(stalls,mid,c)){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return res;
    }

    static boolean isAllocatioPossible(int stalls[], int mindist, int cows){

        int cowsallo = 0;
        int lastcowdistance = stalls[0];
        for(int i = 0; i < stalls.length; i++){
            if(stalls[i] - lastcowdistance >= mindist){
                cowsallo+=1;
                lastcowdistance = stalls[i];

            }
            if(cowsallo > cows){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
    }
}
