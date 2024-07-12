public class index5 {


    static double medianOfSortedarray(int arr1[], int arr2[]){
        // Make arr1 mimum length array min length array pe binary search lagani hai

        // call same function and change the param
        // if  nums1 was greater and nums2 smaller then we swap 
        //  always arr1 should be smaller
        if(arr1.length > arr2.length){
            return medianOfSortedarray(arr2, arr1);
        }

        // arr1 is smaller and arr2 is larger
        int n1 = arr1.length;
        int n2 = arr2.length;
        int start = 0;
        int end =  n1; // hamesha smaller pe binary search

        while(start <= end){
            int cut1 = start + (end - start)/2;
            int cut2 = (n1 + n2)/2 - cut1;

            int l1 = (cut1 == 0)?Integer.MIN_VALUE:arr1[cut1 - 1];
            int l2 = (cut2 == 0)?Integer.MIN_VALUE:arr2[cut2 - 1];
            int r1 = (cut1 == n1)?Integer.MAX_VALUE:arr1[cut1];
            int r2 = (cut2 == n2)?Integer.MAX_VALUE:arr2[cut2];

            if(l1 <= r2 && l2 <= r1){
                if((n1 + n2)%2 == 0){
                    return (double)(Math.max(l1,l2) + Math.min(r1,r2))/2;
                }
                else{
                    return (double) (Math.min(r1,r2));
                }
            }

            // binary Search sirf chote array pe lag rahi hai
            else if(l1 > r2){
                end = cut1 - 1;
            }
            else{
                start = cut1 + 1;
            }
         
        }
        return 0.0;
    }

    public static void main(String[] args) {
        int arr1[] = {2,3,4,5,6};
        int arr2[] = {1,2,3,4,5};
        medianOfSortedarray(arr1,arr2);
    }
}
