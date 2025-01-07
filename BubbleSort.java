public class BubbleSort {
    public static void main(String[] args) {
        int a [] = {5, 6, 1, 4, 3};
        int n = a.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-1; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for(int ele : a){
            System.out.print(ele + " ");
        }
    }
}
