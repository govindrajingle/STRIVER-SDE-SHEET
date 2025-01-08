public class PowerXtoNBrute {
    public static void main(String[] args) {
        int x = 3, n = -4; // You can test with both positive and negative values of n
        int number = Math.abs(n);
        double ans = 1; // Use a double to handle both positive and negative exponents correctly

        // Loop to calculate power of x to |n|
        for (int i = 1; i <= number; i++) {
            ans *= x;
        }

        // If n is negative, take the reciprocal
        if (n < 0) {
            ans = 1 / ans;
        }

        System.out.println("Power of " + x + " to " + n + " is " + ans);
    }
}
