public class SearchMatrixOptimal {
    public static void main(String[] args) {
        int matrix [] [] = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int m = matrix.length, n = matrix[0].length, target = 10;
        //Binary search on rows to get element's row
        int start = 0, end = m-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target >= matrix[mid][0] && target <= matrix[mid][n-1]){
                //Binary search on given row
                search(matrix, mid, target);
            } else if(target > matrix[mid][0]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
    }
    static void search(int matrix[][], int row, int target){
        int n = matrix[0].length;
        int start = 0, end = n-1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(target == matrix[row][mid]){
                System.out.println("element found");
                break;
            } else if(target < matrix[row][mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }
}
