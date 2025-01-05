// we have approach by creating new array and copying elements but that is not in-place so we have to use in-place swapping and its
// best approach is of first take the transpose of matrix and interchange rows.
public class RotateMatrixOptimal {
    public static void main(String[] args) {
        int matrix [] [] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int row = matrix.length, col = matrix[0].length;
        //1. Transpose the matrix
        for(int i=0; i<row; i++){
            for(int j=i; j<col; j++){
                transpose(matrix, i, j);
            }

        }
        //2. Interchange columns
        for(int j=0; j<col/2; j++){
            int i = 0;
            while(i < row){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][col-j-1];
                matrix[i][col-j-1] = temp;
                i++;
            }
        }
        // print matrix
        for(int i=0; i<row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void transpose(int matrix [] [], int i, int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
}
