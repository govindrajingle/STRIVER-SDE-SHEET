package a2z.striver;

public class PowerXtoNOptimal {
    public static void main(String[] args) {
        int x = 3, n = -4;
        long binaryForm = Math.abs(n);
        double ans = 1;
        while(binaryForm > 0){
            if(binaryForm % 2 == 1){
                ans *= x;
            }
            x *= x;
            binaryForm /= 2;
        }
        if(n < 0){
            System.out.println("answer is " + 1/ans);
        } else {
            System.out.println("answer is " + ans);
        }
    }
}
