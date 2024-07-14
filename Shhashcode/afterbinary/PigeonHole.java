import java.util.Arrays;

public class PigeonHole {
    public static void main(String[] args) {
        int arr[] = {6,5,4,3,2,1,5,7,8,9};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
      
        if(max == Integer.MIN_VALUE){
            return;
        }

        int size = max - min + 1;
        int pigeon[] = new int[size];

        for(int i = 0; i < size; i++){
            int index = arr[i] - min;
            pigeon[index]++;
        }

        //fill the orignal array
        int insertindex = 0;
        for(int j = 0; j <size; j++){
            while(pigeon[j] > 0){
                arr[insertindex] = j + min;
                
                insertindex++;
                pigeon[j]--;

            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
