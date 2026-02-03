package arraysadvanced;

import java.util.*;

public class Pairswgivensum {

    public static void main(String[] args) {

        // Input array
        int[] arr = {1, 5, 7, -1, 5};
        //o(n),o(1)
        // Target sum for which we want to find pairs
        int target = 6;

        // Call the function to find and print all pairs with the given sum
        findPairs(arr, target);
    }

    public static void findPairs(int[] arr, int target) {

        // EDGE CASE: Need at least 2 numbers to form a pair
        if (arr == null || arr.length < 2) {
            System.out.println("No pairs possible");
            return; // Exit the method early
        }

        // HashSet to store numbers we have already seen while scanning the array
        // We use HashSet because add() and contains() are on average O(1) time [web:10][web:6]
        Set<Integer> seen = new HashSet<>();

        // Enhanced for-loop to iterate through each element in the array
        for (int num : arr) {

            // Calculate the number needed to reach the target with current 'num'
            int needed = target - num;

            // If 'needed' is already in the set, then (needed, num) makes a valid pair
            if (seen.contains(needed)) {
                System.out.println("Pair found: " + needed + " , " + num);
            }

            // Add the current number to the set so it can be used as 'needed' for future elements
            seen.add(num);
        }
    }
}

