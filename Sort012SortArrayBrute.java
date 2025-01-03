public class Sort012SortArrayBrute {
    public static void main(String[] args) {
        int arr [] = {1, 0, 2, 1, 2, 0};
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    //swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
