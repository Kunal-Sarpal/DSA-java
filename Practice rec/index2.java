import java.util.ArrayList;

public class index2 {

    static ArrayList<ArrayList<Integer>> subseq(int arr[]) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        // outer.add(); // Start with an empty subsequence

        solve(arr, outer, 0, new ArrayList<>()); // Start solving from index 0 with an empty current list
        return outer;
    }

    static void solve(int arr[], ArrayList<ArrayList<Integer>> outer, int index, ArrayList<Integer> current) {
        if (index == arr.length) {
            outer.add(new ArrayList<>(current)); // Add a new copy of current to outer
            return;
        }

        // Include the current element arr[index] in the subsequence
        current.add(arr[index]);
        solve(arr, outer, index + 1, current);

        // Exclude the current element arr[index] from the subsequence
        current.remove(current.size() - 1); // Backtrack by removing the last added element
        solve(arr, outer, index + 1, current);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        System.out.println(subseq(arr).toString());
    }
}
