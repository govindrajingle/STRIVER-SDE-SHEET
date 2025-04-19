package io.neetcode;

public class SudokuSolver {
    public static void main(String[] args) {
        char[][] board = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}, {'6', '.', '.', '1', '9', '5', '.', '.', '.'}, {'.', '9', '8', '.', '.', '.', '.', '6', '.'}, {'8', '.', '.', '.', '6', '.', '.', '.', '3'}, {'4', '.', '.', '8', '.', '3', '.', '.', '1'}, {'7', '.', '.', '.', '2', '.', '.', '.', '6'}, {'.', '6', '.', '.', '.', '.', '2', '8', '.'}, {'.', '.', '.', '4', '1', '9', '.', '.', '5'}, {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        boolean filledBoard = solveSudoku(board);
        printBoard(board);
    }

    public static boolean validDigit(char[][] board, int row, int col, char digit) {
        for (int k = 0; k < 9; k++) {
            if (board[row][k] == digit || board[k][col] == digit) {
                return false;
            }
        }

        // ✅ Now correctly placed outside the loop
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }


    public static boolean solveSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    for (char digit = '1'; digit <= '9'; digit++) {
                        if (validDigit(board, i, j, digit)) {
                            board[i][j] = digit;

                            if (solveSudoku(board)) {
                                return true;
                            }

                            board[i][j] = '.'; // backtrack
                        }
                    }
                    return false; // no digit works here
                }
            }
        }
        return true; // board is fully filled
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }
    }
}