package matrix;

import java.util.*;

public class Rowwithmax1s {
    // Find row index with maximum number of 1s (rows sorted)
    // TC: O(R + C)
    // SC: O(1)
    public static int rowWithMax1s(int[][] mat) {
        if (mat == null || mat.length == 0 || mat[0].length == 0) return -1;

        int r = mat.length, c = mat[0].length;
        int j = c - 1; // start from top-right
        int ansRow = -1;

        for (int i = 0; i < r; i++) {
            // keep moving left while you see 1
            while (j >= 0 && mat[i][j] == 1) {
                ansRow = i;
                j--;
            }
        }
        return ansRow;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {0, 0, 0, 1},
                {0, 1, 1, 1},
                {0, 0, 1, 1},
                {0, 0, 0, 0}
        };

        System.out.println(rowWithMax1s(mat)); // 1
    }
}

