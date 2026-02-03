package arraysadvanced;

import java.util.*;

public class Longestcs {

    public static void main(String[] args) {

        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest length = " + longestConsecutive(arr));
    }

    public static int longestConsecutive(int[] arr) {

        // EDGE CASE: empty array returns 0
        if (arr == null || arr.length == 0) return 0;

        // TIME: O(n) to build set, SPACE: O(n) for storing all unique elements
        // HashSet gives O(1) average lookup time for contains()
        Set<Integer> set = new HashSet<>();
        for (int num : arr) set.add(num);

        int longest = 0;  // Track maximum sequence length found

        // Iterate through each number - O(n) total time
        for (int num : arr) {

            // Start counting ONLY from sequence beginning (if num-1 not present)
            // This avoids double-counting sequences from middle/end
            if (!set.contains(num - 1)) {

                int current = num;
                int count = 1;

                // Extend sequence forward while next number exists - O(k) where k is sequence length
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}

