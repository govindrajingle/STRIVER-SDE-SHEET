public class InversionArrayBrute {
    public static void main(String[] args) {
        int a [] = {2, 5, 1, 3, 4};
        int pairs = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if(i < j && a[i] > a[j]){
                    pairs++;
                }
            }
        }
        System.out.println("number of pairs are " + pairs);
    }
}
