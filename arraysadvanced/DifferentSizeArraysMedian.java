package arraysadvanced;

// Median of Two Sorted Arrays (Different Lengths) - Binary Search
// O(log(min(m,n))) time by finding optimal partition points

public class DifferentSizeArraysMedian {

    public static void main(String[] args) {

        int[] a = {1, 3};
        int[] b = {2};

        System.out.println("Median = " + findMedian(a, b));
    }

    public static double findMedian(int[] a, int[] b) {

        // Ensure a is smaller array - O(log(min(m,n))) becomes more efficient
        if (a.length > b.length) return findMedian(b, a);

        // TIME: O(log(min(m,n))), SPACE: O(1)
        int low = 0, high = a.length;  // Binary search on partition position in smaller array

        while (low <= high) {

            // cut1 = partition position in array a
            int cut1 = (low + high) / 2;
            
            // cut2 = corresponding partition in array b to balance halves
            // Total elements left = total elements right
            int cut2 = (a.length + b.length + 1) / 2 - cut1;

            // Get left/right values at partition boundaries (handle edges)
            int l1 = (cut1 == 0) ? Integer.MIN_VALUE : a[cut1 - 1];  // Left of cut1 in a
            int l2 = (cut2 == 0) ? Integer.MIN_VALUE : b[cut2 - 1];  // Left of cut2 in b
            int r1 = (cut1 == a.length) ? Integer.MAX_VALUE : a[cut1];  // Right of cut1 in a
            int r2 = (cut2 == b.length) ? Integer.MAX_VALUE : b[cut2];  // Right of cut2 in b

            // Check if this is correct partition (no cross violations)
            if (l1 <= r2 && l2 <= r1) {

                // Correct partition found!
                if ((a.length + b.length) % 2 == 0) {
                    // Even total: average of 2 medians
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                } else {
                    // Odd total: maximum of left halves
                    return Math.max(l1, l2);
                }
            }
            else if (l1 > r2) {
                // Too many large elements on left → move cut1 left
                high = cut1 - 1;
            }
            else {
                // Too many small elements on left → move cut1 right
                low = cut1 + 1;
            }
        }

        return 0.0;  // Should not reach here
    }
}

