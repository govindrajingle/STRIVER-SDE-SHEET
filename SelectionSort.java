public class SelectionSort {
    public static void main(String[] args) {
        int a [] = {2, 1, 4, 3, 6};
        int n = a.length;
        for(int i=0; i<n; i++){
            int min = i; // store the index not the value
            for(int j=i; j<n; j++){
                if(a[j] < a[min]){
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
        for(int i : a){
            System.out.print(i+" ");
        }
    }
}
