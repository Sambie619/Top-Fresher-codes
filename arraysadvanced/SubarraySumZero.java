package arraysadvanced;

import java.util.HashSet;

public class SubarraySumZero {

    // Returns true if subarray with sum 0 exists
    public static boolean hasZeroSumSubarray(int[] arr) {

        // ---------- Edge Case ----------
        if (arr == null || arr.length == 0) {
            return false;
        }

        // HashSet to store prefix sums
        HashSet<Integer> set = new HashSet<>();

        int prefixSum = 0;

        for (int i = 0; i < arr.length; i++) {

            prefixSum += arr[i];

            // Case 1: prefix sum becomes 0
            if (prefixSum == 0) {
                return true;
            }

            // Case 2: prefix sum already seen before
            // means sum of elements between indices = 0
            if (set.contains(prefixSum)) {
                return true;
            }

            // Store current prefix sum
            set.add(prefixSum);
        }

        return false; // no zero sum subarray found
    }

    // Testing
    public static void main(String[] args) {

        int[] arr = {4, 2, -3, 1, 6};

        System.out.println(hasZeroSumSubarray(arr)); // true
    }
}//(O(n) time, O(n) space)
//💡 Observation,If at two different indices the prefix sum is same, then:
//Also:If prefix sum becomes 0 at any index, subarray exists from 0 → i

