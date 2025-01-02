import java.util.Arrays;

public class NextPermutaion {
    public static void main(String[] args) {
        int arr [] = {1, 2, 3};
        int dup [] = Arrays.copyOf(arr, arr.length);
        int pivot = -1, n = arr.length;
        for(int i=n-2; i>=0; i++){
            if(arr[i] < arr[i+1]) {
                pivot = i;
                break;
            }
        }
        for(int i=n-1; i>pivot; i--){
            swap(arr, pivot, i);
            break;
        }
        reverse(arr, pivot+1, n-1);
        if(pivot == -1){
            System.out.println(dup);
        } else {
            for(int i : arr){
                System.out.print(i + " ");
            }
        }
    }
    public static void reverse(int [] arr, int left, int right){
        while(right > left){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
