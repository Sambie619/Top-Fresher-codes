package arraysadvanced;

// Jump Game II - Minimum Jumps to Reach Last Index
// Greedy approach using current end and farthest reachable

public class MinimumJumpsCalculator {

    public static void main(String[] args) {

        int[] arr = {2,3,1,1,4};
        System.out.println("Minimum Jumps = " + minJumps(arr));
    }

    public static int minJumps(int[] arr) {

        // EDGE CASES
        if (arr == null || arr.length <= 1) return 0;
        if (arr[0] == 0) return -1;  // Cannot even make first jump

        // TIME: O(n) single pass, SPACE: O(1) constant variables
        int jumps = 1;              // Current jump count (start with 1st jump range)
        int maxReach = arr[0];      // Farthest index reachable with current jumps
        int steps = arr[0];         // Steps remaining in current jump range

        for (int i = 1; i < arr.length; i++) {

            // Already reached end
            if (i == arr.length - 1) return jumps;

            // Update farthest we can reach from current position
            maxReach = Math.max(maxReach, i + arr[i]);
            
            // Used up all steps in current jump range
            steps--;

            if (steps == 0) {
                jumps++;  // Need new jump to continue

                // Cannot reach further - impossible
                if (i >= maxReach) return -1;

                // Steps available for next jump range
                steps = maxReach - i;
            }
        }

        return -1;  // Should not reach here if logic is correct
    }
}

