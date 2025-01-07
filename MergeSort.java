public class MergeSort {
    public static void main(String[] args) {
        int a [] = {4, 1, 2, 7, 5};
        mergeSort(a, a.length);
        for(int ele : a){
            System.out.print(ele + " ");
        }
    }
    public static void mergeSort(int a[], int n){
        if(n > 1) {
            int mid = n / 2;
            int left[] = new int[mid];
            int right[] = new int[n - mid];
            for (int i = 0; i < mid; i++) {
                left[i] = a[i];
            }
            for (int i = 0; i < n - mid; i++) {
                right[i] = a[mid + i];
            }
            mergeSort(left, left.length);
            mergeSort(right, right.length);
            merge(left, right, a);
        }
    }
    public static void merge(int left[], int right[], int a[]){
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length){
            if(left[i] <= right[j]){
                a[k] = left[i];
                i++;
            } else {
                a[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < left.length){
            a[k] = left[i];
            k++;
            i++;
        }
        while (j < right.length){
            a[k] = right[j];
            j++;
            k++;
        }
    }
}
