package a2z.striver;

public class MergeTwoSortedArraysOptimal {
    public static void main(String[] args) {
        int a[] = {1, 3, 6, 0, 0, 0};  // Array a
        int b[] = {2, 5, 7};           // Array b
        int m = a.length - 1, n = b.length;
        int i = m - 1, j = n - 1, k = m + n - 1;
        while(j >= 0) {
            if(i >= 0 &&  a[i] > b[j]){
                a[k--] = b[i--];
            } else {
                a[k--] = b[j--];
            }
        }
    }
}
