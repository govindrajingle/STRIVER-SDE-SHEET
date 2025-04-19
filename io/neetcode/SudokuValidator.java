package io.neetcode;

public class SudokuValidator {

    // Sample Sudoku board to validate
    char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
    };

    // Method to check if the current Sudoku board is valid
    public boolean isValidSudoku(char[][] board) {
        // Create boolean arrays to track digits in rows, columns, and boxes
        boolean[][] rows = new boolean[9][9];   // rows[i][num] = true if num exists in row i
        boolean[][] cols = new boolean[9][9];   // cols[j][num] = true if num exists in column j
        boolean[][] boxes = new boolean[9][9];  // boxes[k][num] = true if num exists in box k

        // Loop through every cell in the 9x9 board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];  // current character

                if (c == '.') continue;  // skip empty cells

                int num = c - '1';  // convert char '1'-'9' to index 0-8
                int boxIndex = (i / 3) * 3 + (j / 3);  // calculate index of the 3x3 box (0-8)

                // Check if the number already exists in current row, column, or box
                if (rows[i][num] || cols[j][num] || boxes[boxIndex][num]) {
                    return false;  // invalid if duplicate found
                }

                // Mark the number as seen in the row, column, and box
                rows[i][num] = true;
                cols[j][num] = true;
                boxes[boxIndex][num] = true;
            }
            //   printMat(rows);
        }

        return true;  // if no duplicates found, the board is valid
    }

    public static void printMat(boolean mat[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Example usage
    public static void main(String[] args) {
        SudokuValidator validator = new SudokuValidator();
        boolean result = validator.isValidSudoku(validator.board);
        System.out.println("Is the Sudoku board valid? " + result);
    }
}
