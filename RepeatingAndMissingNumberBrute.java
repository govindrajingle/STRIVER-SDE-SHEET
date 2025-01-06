public class RepeatingAndMissingNumberBrute {
    public static void main(String[] args) {
        int a [] = {3, 1, 2, 5, 3};
        int rep = -1, mis = -1, n = a.length;
        int expectedSum = (n * (n + 1)) / 2, actualSum = 0;
        for (int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(a[i] == a[j]){
                    rep = a[i];
                }
            }
        }
        for(int i : a){
            actualSum += i;
        }
        System.out.println("repeating number is " + rep);
        System.out.println("missing number is " + (expectedSum - actualSum + rep));
    }
}
