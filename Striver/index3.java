import java.util.ArrayList;
import java.util.List;

public class index3 {

    // Function to generate all permutations of an array
    static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }

    // Helper function to perform backtracking
    private static void backtrack(List<List<Integer>> resultList, List<Integer> tempList, int[] nums) {
        // Print current state of tempList and resultList
        System.out.println("tempList: " + tempList + ", resultList: " + resultList);

        // If the tempList size equals the nums length, we have a complete permutation
        if (tempList.size() == nums.length) {
            resultList.add(new ArrayList<>(tempList)); // Add the current permutation to the result list
            System.out.println("Added to resultList: " + tempList);
        } else {
            for (int number : nums) {
                // Skip if the element is already in the tempList (to avoid duplicates in the permutation)
                if (tempList.contains(number)) {
                    continue;
                }

                // Add the new element
                tempList.add(number);
                System.out.println("Added " + number + " to tempList: " + tempList);

                // Recursively generate permutations with the new element added
                backtrack(resultList, tempList, nums);

                // Remove the last element to backtrack and try other possibilities
                tempList.remove(tempList.size() - 1);
                System.out.println("Removed last element from tempList: " + tempList);
            }
        }
    }

    // Main method for testing the permute function
    public static void main(String[] args) {
        List<List<Integer>> result = permute(new int[]{1, 2, 3});
        System.out.println("Final Result: " + result); // Output: [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]
    }
}
