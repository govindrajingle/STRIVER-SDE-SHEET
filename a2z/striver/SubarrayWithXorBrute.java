package a2z.striver;

public class SubarrayWithXorBrute {
    public static void main(String[] args) {
        int[] a = {4, 2, 2, 6, 4, 8};
        int k = 6;
//        4 in binary  =  100
//        2 in binary  =  010
//        -----------------
//        XOR result   =  110  (which is 6 in decimal)
        int n = a.length, count = 0;
        for(int i=0; i<n; i++){
            int xor = 0;
            for(int j=i; j<n; j++){
                xor = xor ^ a[j];
                if(xor == k){
                    count++;
                }
            }
        }
        System.out.println("Length is " + count);
    }
}
