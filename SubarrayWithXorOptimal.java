import java.util.HashMap;

public class SubarrayWithXorOptimal {
    public static void main(String[] args) {
        int[] a = {4, 2, 2, 6, 4, 7};
        int k = 6;
//        4 in binary  =  100
//        2 in binary  =  010
//        -----------------
//        XOR result   =  110  (which is 6 in decimal)
        int n = a.length, count = 0, xor = 0;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        hmap.put(xor, 1);
        for(int i=0; i<n; i++){
            xor = xor ^ a[i];
            int x = xor ^ k; // x = xor ^ k
            if(hmap.containsKey(x)){
                count += hmap.get(x);
            }
            if(hmap.containsKey(xor)){
                hmap.put(xor, hmap.get(xor) + 1);
            } else {
                hmap.put(xor, 1);
            }
        }
        System.out.println("Length is "+count);
    }
}