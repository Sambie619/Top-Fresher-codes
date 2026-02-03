package arraysadvanced;

// Three Way Partitioning (Dutch National Flag Algorithm)
// Partition array into 3 parts: <low, between low-high, >high

public class ThreeWayPartitioner {

    public static void main(String[] args) {

        int[] arr = {1,4,3,2,5,2,3};
        threeWayPartition(arr, 2, 3);  // Partition around [2,3]

        for (int x : arr) System.out.print(x + " ");
    }

    public static void threeWayPartition(int[] arr, int low, int high) {

        // TIME: O(n) single pass, SPACE: O(1) in-place partitioning
        int start = 0;     // Next position for <low elements
        int mid = 0;       // Current element being processed
        int end = arr.length - 1;  // Next position for >high elements

        // Continue until mid pointer reaches/exceeds end pointer
        while (mid <= end) {

            if (arr[mid] < low) {
                // Current element belongs to left partition (<low)
                swap(arr, start++, mid++);
            }
            else if (arr[mid] > high) {
                // Current element belongs to right partition (>high)
                // Don't increment mid - recheck same position after swap
                swap(arr, mid, end--);
            }
            else {
                // Current element in range [low, high] - middle partition
                mid++;  // Skip to next unprocessed element
            }
        }
        // Result: [0..start-1] = <low, [start..end+1] = [low,high], [end+1..n-1] = >high
    }

    // O(1) helper swap
    static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}

