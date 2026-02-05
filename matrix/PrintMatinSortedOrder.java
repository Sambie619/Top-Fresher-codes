package matrix;

import java.util.*;

public class PrintMatinSortedOrder {
    static class Node {
        int val, r, c;
        Node(int val, int r, int c) {
            this.val = val;
            this.r = r;
            this.c = c;
        }
    }

    // Print all elements in sorted order (row & column sorted matrix)
    // TC: O(R*C * log(R))  (heap size at most R)
    // SC: O(R) (heap)
    public static List<Integer> sortedPrint(int[][] mat) {
        List<Integer> ans = new ArrayList<>();
        if (mat == null || mat.length == 0 || mat[0].length == 0) return ans;

        int r = mat.length, c = mat[0].length;

        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.val));

        // push first element of every row
        for (int i = 0; i < r; i++) {
            pq.add(new Node(mat[i][0], i, 0));
        }

        while (!pq.isEmpty()) {
            Node cur = pq.poll();
            ans.add(cur.val);

            // push next element from same row
            if (cur.c + 1 < c) {
                pq.add(new Node(mat[cur.r][cur.c + 1], cur.r, cur.c + 1));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };

        System.out.println(sortedPrint(mat));
    }
}
/*Meaning:

Matrix is sorted in every row and every column.
We must print all elements in increasing order.

Best approach:

Use Min-Heap (like merging sorted lists) */
