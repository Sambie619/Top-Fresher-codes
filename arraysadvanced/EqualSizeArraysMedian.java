package arraysadvanced;

// Median of Two Sorted Arrays (Equal Length)
// Merge both arrays and find median of combined sorted array

public class EqualSizeArraysMedian {

    public static void main(String[] args) {

        int[] a = {1, 12, 15, 26, 38};
        int[] b = {2, 13, 17, 30, 45};

        System.out.println("Median = " + median(a, b));
    }

    public static double median(int[] a, int[] b) {

        int n = a.length;  // Both arrays have same length n
        // TIME: O(n), SPACE: O(1) - no extra space needed
        
        int i = 0, j = 0;  // Pointers for array a and b
        int m1 = -1, m2 = -1;  // Previous and current median candidates

        // Merge both arrays until we get n+1 elements (enough for median)
        // Since total 2n elements, median is average of nth and (n+1)th elements
        for (int count = 0; count <= n; count++) {

            // Store previous median candidate
            m1 = m2;

            // Pick smaller of current heads (merge sorted arrays)
            if (i < n && (j >= n || a[i] <= b[j])) {
                // Take from array a
                m2 = a[i++];
            } else {
                // Take from array b
                m2 = b[j++];
            }
        }

        // Median = average of nth and (n+1)th elements (m1 and m2)
        return (m1 + m2) / 2.0;
    }
}

