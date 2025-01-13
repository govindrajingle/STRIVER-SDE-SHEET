public class GridUniquePathsOptimal {
    public static void main(String[] args) {
        int m = 3, n = 3;
        int dp [] [] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        int ans = uniquePaths(m, n, dp);
        System.out.println("unique paths are " + ans);
    }
    static int uniquePaths(int m, int n, int [] [] dp){
        if(m == 1 || n == 1) {
            return 1;
        }
        if(dp[m-1][n-1] != -1){
            return dp[m-1][n-1];
        }
        int up = uniquePaths(m-1, n, dp);
        int left = uniquePaths(m, n-1, dp);
        //memorization of the recurring parameter's answer
        dp[m-1][n-1] = up + left;
        return dp [m-1] [n-1];
    }
}
