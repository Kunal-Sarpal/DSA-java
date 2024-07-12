class index{

    static int jumpSearch(int arr[], int t){
        int s = 0;
        int n = arr.length;
        int bs = (int)Math.sqrt(n);
        int e = bs;

        while(e < n && arr[e] <= t){
            s = e;
            e+=bs;

            if(e > n){
                e = n;
            }
        }
        int res = -1;
        for(int i = s; i < e; i++){
            if(arr[i] == t){
                res = i;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        //  JUMP SEARCH 
        // int arr[] = {2,4,5,6,8,9,12,34,56,78,90};

        // int ans = jumpSearch(arr,56);

        // if(ans == -1){
        //     System.err.println("Not found");
        // }
        // else{
        //     System.err.println(ans);
        // }
    }
}


