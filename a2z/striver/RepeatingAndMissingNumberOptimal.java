package a2z.striver;

public class RepeatingAndMissingNumberOptimal {
    public static void main(String[] args) {
        int a [] = {3, 1, 2, 5, 3};
        int x = 0, y = 0, n = a.length;
        long sum = (n * (n + 1)) / 2;
        long squares = (n * (n + 1) * (2 * n + 1)) / 6;
        int actualSum = 0, actualSquares = 0;
        for(int i : a){
            actualSum += i;
            actualSquares += (i * i);
        }
        int val1 = (int) (sum - actualSum);
        int val2 = (int) squares - actualSquares;
        val2 /= val1;
        x = (int) (val1 + val2) / 2;
        y = x -val1;
        System.out.println("missing number is " + x + " repeating number is " + y);
    }
}
