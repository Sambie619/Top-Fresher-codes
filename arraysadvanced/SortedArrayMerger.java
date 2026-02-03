package arraysadvanced;

// Merge Two Sorted Arrays by Inserting Smaller Elements of Second Array
// Modify first array in-place and keep second array sorted

public class SortedArrayMerger {

    public static void main(String[] args) {

        int[] a = {1, 3, 5, 7};
        int[] b = {0, 2, 6, 8, 9};

        merge(a, b);

        // Print results
        for (int x : a) System.out.print(x + " ");
        System.out.println();
        for (int x : b) System.out.print(x + " ");
    }

    public static void merge(int[] a, int[] b) {

        int n = a.length;  // Size of first array
        int m = b.length;  // Size of second array

        // TIME: O(n*m) worst case, SPACE: O(1) in-place modification
        // For each of n elements in a, may need to shift all m elements in b

        // Traverse first array from RIGHT to LEFT (end to start)
        // Why right-to-left? Preserves relative order during swaps
        for (int i = n - 1; i >= 0; i--) {

            // If current a[i] > b[0], swap because b[0] is smaller and belongs earlier
            if (a[i] > b[0]) {

                // Swap a[i] with b[0]
                int temp = a[i];
                a[i] = b[0];
                b[0] = temp;

                // Now b[0] contains larger value (original a[i]), needs to be moved right
                // Bubble it to correct sorted position in b (insertion sort step)
                int first = b[0];
                int k;

                for (k = 1; k < m && b[k] < first; k++) {
                    b[k - 1] = b[k];  // Shift smaller elements right
                }

                b[k - 1] = first;  // Place original value in correct position
            }
        }
    }
}

