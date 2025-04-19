package a2z.striver;

public class FourSumBrute {
    public static void main(String[] args) {
        int a [] = {1,0,-1,0,-2,2};
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    for (int l = k+1; l < n; l++) {
                        if(a[i] + a[j] + a[k] + a[l] == 0){
                            System.out.println("indices are "+a[i]+", "+a[j]+" ,"+a[k]+" ,"+a[l]);
                        }
                    }
                }
            }
        }
    }
}
