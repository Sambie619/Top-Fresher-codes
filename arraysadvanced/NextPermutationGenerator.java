package arraysadvanced;

import java.util.*;

// Next Permutation - Generate lexicographically next greater permutation
// Modifies input array in-place. If already largest, converts to smallest.

public class NextPermutationGenerator {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void nextPermutation(int[] nums) {

        // TIME: O(n) linear scan, SPACE: O(1) in-place modification
        int i = nums.length - 2;

        // STEP 1: Find first "dip" (i where nums[i] < nums[i+1])
        // Scan from right until find non-decreasing sequence break
        while (i >= 0 && nums[i] >= nums[i + 1]) i--;

        if (i >= 0) {  // Found dip position (permutation not in descending order)
            
            int j = nums.length - 1;

            // STEP 2: From right, find smallest number > nums[i] (successor)
            // This will be our new pivot for next permutation
            while (nums[j] <= nums[i]) j--;

            // Swap pivot with its successor
            swap(nums, i, j);
        }
        // If i < 0, array was in descending order (largest permutation)
        // No greater permutation exists, so we'll reset to sorted order

        // STEP 3: Reverse suffix after position i to make it smallest possible
        // This gives lexicographically next permutation
        reverse(nums, i + 1);
    }

    // Helper: O(1) swap two elements
    static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    // Helper: Reverse subarray from start to end - O(n/2) = O(n)
    static void reverse(int[] a, int start) {
        int end = a.length - 1;
        while (start < end) swap(a, start++, end--);
    }
}

