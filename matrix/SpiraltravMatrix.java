package matrix;

import java.util.*;

public class SpiraltravMatrix{
    // Spiral traversal of matrix
    // TC: O(R*C)  (every element visited once)
    // SC: O(1) extra (excluding output)
    public static List<Integer> spiralOrder(int[][] mat) {
        List<Integer> ans = new ArrayList<>();
        if (mat == null || mat.length == 0 || mat[0].length == 0) return ans; // edge case

        int top = 0, bottom = mat.length - 1;
        int left = 0, right = mat[0].length - 1;

        while (top <= bottom && left <= right) {
            // left -> right
            for (int j = left; j <= right; j++) ans.add(mat[top][j]);
            top++;

            // top -> bottom
            for (int i = top; i <= bottom; i++) ans.add(mat[i][right]);
            right--;

            // right -> left (check needed to avoid duplicate row)
            if (top <= bottom) {
                for (int j = right; j >= left; j--) ans.add(mat[bottom][j]);
                bottom--;
            }

            // bottom -> top (check needed to avoid duplicate column)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) ans.add(mat[i][left]);
                left++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(spiralOrder(mat));
    }
}

