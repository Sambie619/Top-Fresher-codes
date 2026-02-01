package arrays;

import java.util.Arrays;

public class HalfSort {
    public static void main(String[] args) {
        int[] arr = {8, 3, 1, 7, 2, 9, 5, 4};
        int n = arr.length;
        // Base case: array with 0 or 1 element
        if (n <= 1) {
            return;
        }
        // Step 1: Sort entire array
        Arrays.sort(arr);
        // Step 2: Print first half in ascending order
        System.out.println("Result:");
        for (int i = 0; i < n/2; i++) {
            System.out.print(arr[i]+" ");
        }
        // Step 3: Print second half in descending order
        for (int i = n-1; i >=n/2; i--) {
            System.out.print(arr[i]+" ");
        }
    }//tc:o(nlogn),sc:o(1)
}
