package recursion;

public class PrintAllPermuofString {
    // Print all permutations of a string using recursion
    // TC: O(n! * n)  (n! permutations, each takes O(n) to build/print)
    // SC: O(n) recursion stack + char array
    public static void permute(char[] arr, int idx) {
        // base case: permutation formed
        if (idx == arr.length) {
            System.out.println(new String(arr));
            return;
        }

        for (int i = idx; i < arr.length; i++) {
            // swap current index with i
            swap(arr, idx, i);

            // recurse for next index
            permute(arr, idx + 1);

            // backtrack: undo swap
            swap(arr, idx, i);
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        String s = "ABC";
        if (s == null || s.length() == 0) return; // edge case

        permute(s.toCharArray(), 0);
    }
}
