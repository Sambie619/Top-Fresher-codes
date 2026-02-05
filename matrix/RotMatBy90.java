package matrix;

public class RotMatBy90 {
    // Rotate NxN matrix 90 degree clockwise (in-place)
    // TC: O(N^2)
    // SC: O(1)
    public static void rotate90(int[][] mat) {
        if (mat == null || mat.length == 0) return;
        int n = mat.length;

        // edge case: must be square matrix for in-place rotation
        for (int[] row : mat) {
            if (row.length != n) {
                System.out.println("Rotation in-place only works for NxN matrix.");
                return;
            }
        }

        // Step 1: transpose (swap mat[i][j] with mat[j][i])
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // Step 2: reverse each row
        for (int i = 0; i < n; i++) {
            int l = 0, r = n - 1;
            while (l < r) {
                int temp = mat[i][l];
                mat[i][l] = mat[i][r];
                mat[i][r] = temp;
                l++;
                r--;
            }
        }
    }

    public static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        rotate90(mat);
        printMatrix(mat);
    }
}


