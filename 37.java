
class Solution {
    public void solveSudoku(char[][] board) {
        Print(board, 0, 0);
    }

    public static boolean Print(char[][] board, int row, int col) {

        // Base case
        if (col == 9) {
            col = 0;
            row++;
        }

        if (row == 9) {
            return true;
        }

        // If cell is already filled
        if (board[row][col] != '.') {
            return Print(board, row, col + 1);
        }

        // Try values from 1 to 9
        for (char val = '1'; val <= '9'; val++) {

            if (issafe(board, row, col, val)) {

                board[row][col] = val;

                boolean ans = Print(board, row, col + 1);

                if (ans) {
                    return true;
                }

                // Backtracking
                board[row][col] = '.';
            }
        }

        return false;
    }

    private static boolean issafe(char[][] board, int row, int col, char val) {

        // Check row
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == val) {
                return false;
            }
        }

        // Check column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == val) {
                return false;
            }
        }

        // Check 3x3 box
        int r = row - row % 3;
        int c = col - col % 3;

        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {

                if (board[i][j] == val) {
                    return false;
                }
            }
        }

        return true;
    }
}
