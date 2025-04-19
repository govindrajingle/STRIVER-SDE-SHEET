package a2z.striver;

public class RotateMatrixBrute {
    public static void main(String[] args) {
        int matrix [] [] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("--------------");
        //create an empty matrix of same size
        int clone [] [] = new int[matrix.length][matrix[0].length];
        int r = matrix.length-1, c = matrix[0].length-1;
        //pick up each row from matrix and fill it to clone by column from last
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                clone[j][matrix.length-1-i] = matrix[i][j];
            }
        }
        //print the clone elements
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(clone[i][j]+" ");
            }
            System.out.println();
        }
    }
}
