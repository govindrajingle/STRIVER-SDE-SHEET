public class GridUniquePathsBrute {
    public static void main(String[] args) {
        int m = 3, n = 3; // m is rows and n is columns, find the ways from [0,0] to [m-1, n-1] by moving 1 unit to right or down
        int ans = uniquePaths(m, n);
        System.out.println("Unique paths: " + ans);
    }

    static int uniquePaths(int m, int n){
        System.out.println("Entering uniquePaths(" + m + ", " + n + ")");

        // Base case: If we are at the first row or first column, return 1
        if(m == 1 || n == 1) {
            System.out.println("Base case reached: uniquePaths(" + m + ", " + n + ") = 1 by moving up or left");
            return 1;
        }

        // Recursive call to move up
        System.out.println("performing up with m " + m +" and "+ n);
        int up = uniquePaths(m - 1, n);
        System.out.println("Returned from uniquePaths(" + (m - 1) + ", " + n + ") = " + up + " (moving up)");

        // Recursive call to move left
        System.out.println("performing left with m " + m +" and "+ n);
        int left = uniquePaths(m, n - 1);
        System.out.println("Returned from uniquePaths(" + m + ", " + (n - 1) + ") = " + left + " (moving left)");

        // Sum up both results and return the total paths
        int result = up + left;
        System.out.println("Returning from uniquePaths(" + m + ", " + n + ") = " + result);

        return result;
    }
}
