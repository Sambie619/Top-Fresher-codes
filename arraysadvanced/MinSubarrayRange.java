package arraysadvanced;

import java.util.*;

// Minimum Difference Between Largest and Smallest in Subarray of Size m
// Find smallest range containing m consecutive elements

public class MinSubarrayRange {
    //chocloate distri prob
    public static void main(String[] args) {

        int[] arr = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;  // Window/subarray size

        System.out.println("Minimum Difference = " + minDiff(arr, m));
    }

    public static int minDiff(int[] arr, int m) {

        // EDGE CASES: invalid input or impossible window
        if (arr == null || arr.length == 0 || m == 0 || m > arr.length)
            return 0;

        // TIME: O(n log n) dominated by sort, SPACE: O(1) or O(log n) for sort
        Arrays.sort(arr);  // Sort array first - O(n log n)

        int minDiff = Integer.MAX_VALUE;  // Track minimum range found

        // Sliding window: check every consecutive m elements
        // i to i+m-1 forms window of exactly m elements
        for (int i = 0; i + m - 1 < arr.length; i++) {
            
            // Range = max - min in current window = arr[i+m-1] - arr[i]
            // Since array is sorted, these are window's max and min
            int currentDiff = arr[i + m - 1] - arr[i];
            minDiff = Math.min(minDiff, currentDiff);  // Update minimum range
        }

        return minDiff;
    }
}

