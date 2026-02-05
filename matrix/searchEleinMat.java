package matrix;

public class searchEleinMat {
    // Search in row-wise & column-wise sorted matrix
    // Start from top-right corner
    // TC: O(R + C)
    // SC: O(1)
    public static boolean search(int[][] mat, int target) {
        if (mat == null || mat.length == 0 || mat[0].length == 0) return false; // edge case

        int r = mat.length, c = mat[0].length;
        int i = 0, j = c - 1;

        while (i < r && j >= 0) {
            if (mat[i][j] == target) return true;
            else if (mat[i][j] > target) j--; // move left
            else i++; // move down
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1, 4, 7, 11},
                {2, 5, 8, 12},
                {3, 6, 9, 16},
                {10, 13, 14, 17}
        };

        System.out.println(search(mat, 9));  // true
        System.out.println(search(mat, 15)); // false
    }
}

