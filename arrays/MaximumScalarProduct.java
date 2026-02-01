package arrays;

import java.util.Arrays;

public class MaximumScalarProduct {
    // Function to compute maximum scalar product of two arrays
    public static long maxScalarProduct(int[] arr1, int[] arr2) {

        // ---------- Edge Cases ----------
        // If either array is null, scalar product cannot be computed
        if (arr1 == null || arr2 == null) {
            throw new IllegalArgumentException("Input arrays must not be null");
        }

        // If array sizes differ, scalar product is undefined
        if (arr1.length != arr2.length) {
            throw new IllegalArgumentException("Arrays must be of same length");
        }

        int n = arr1.length;

        // If arrays are empty, scalar product is 0
        if (n == 0) {
            return 0;
        }

        // ---------- Main Logic ----------
        // Sort both arrays in ascending order
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        long result = 0;

        // Multiply corresponding elements
        for (int i = 0; i < n; i++) {
            // Use long to avoid integer overflow
            result += (long) arr1[i] * arr2[i];
        }

        return result;
    }

    // ---------- Driver Code ----------
    public static void main(String[] args) {
        int[] arr1 = {1, 3, -5};
        int[] arr2 = {-2, 4, 1};

        System.out.println(maxScalarProduct(arr1, arr2)); // Output: 23
    }//tc:o(nlogn),sc:o(1)
}
