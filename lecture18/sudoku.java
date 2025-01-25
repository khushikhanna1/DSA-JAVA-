package lecture18;

public class sudoku {
    static boolean sudokuSolver(int[][] mat, int i, int j, int n) {
        // Base case: If we have reached the end of the matrix
        if (i == n) {
            return true;
        }

        // Move to the next row if we have reached the end of a row
        if (j == n) {
            return sudokuSolver(mat, i + 1, 0, n);
        }

        // Skip already filled cells
        if (mat[i][j] != 0) {
            return sudokuSolver(mat, i, j + 1, n);
        }

        // Try placing numbers from 1 to 9
        for (int num = 1; num <= 9; num++) {
            if (canPlace(mat, i, j, n, num)) {
                mat[i][j] = num; // Place the number
                if (sudokuSolver(mat, i, j + 1, n)) {
                    return true; // If the solution is found, return true
                }
                mat[i][j] = 0; // Backtrack
            }
        }

        return false; // If no solution, return false 
    }
}
