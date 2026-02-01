package arrays;

import java.util.Arrays;

public class MinimumScalarProduct {
  
    // Function to compute minimum scalar product of two arrays
    public static long minScalarProduct(int[] arr1, int[] arr2) {
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
        Arrays.sort(arr1);
        Arrays.sort(arr2);//sort both asc
        int res=0;
        // Multiply smallest of arr1 with largest of arr2
        for (int i = 0; i < n; i++) {
            res+=(long)arr1[i]*arr2[n-1-i];
        }
        return res;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1, 3, -5};
        int[] arr2 = {-2, 4, 1};

        System.out.println(minScalarProduct(arr1, arr2)); // Output: -25
    }//tc:o(nlogn),sc:o(1)
}
