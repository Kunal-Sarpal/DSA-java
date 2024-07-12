public class last {

    static int findSmallestElements(int matrix[][], int assumeMedian){
        int noOfSmallestElements = 0;
        for(int i = 0; i < matrix.length; i++){
            // matrix[i] = 0,1,2;
            int start = 0;
            int end = matrix[i].length - 1;
            while(start <= end){
                int mid = start +  (end - start)/2;
                if(matrix[i][mid] <= assumeMedian){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            noOfSmallestElements += start;

        }
        return noOfSmallestElements;
    }

    static int median(int matrix[][], int r, int c){
        int N = r * c;

        int median = N/2;
        int start = 1;
        int end = 2000;
        while(start <= end){
            int assumeMedian = start + (end - start)/2;
            int k = findSmallestElements(matrix,assumeMedian);

            if(k <= median){
                start = assumeMedian + 1;
            }
            else{
                end = assumeMedian - 1;
            }

        }
        return start;

    }
    public static void main(String[] args) {
        
        int matrix[][] = {{1,4,5},{2,5,6},{8,10,18}};
        int r = 3,c= 3;
        System.out.println(median(matrix, r, c));
    }
}

