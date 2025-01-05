public class MergeTwoSortedArraysBrute {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 0, 0}; // arr has extra space (zeroes) for merging
        int brr[] = {8, 9}; // brr is the second array

        int m = arr.length - 2; // m is the number of valid elements in arr (excluding extra space)
        int n = brr.length;     // n is the length of brr

        int ia = m - 1; // index for arr (valid elements)
        int ib = n - 1; // index for brr
        int index = m + n - 1; // index for placing merged elements in arr (starting from the end)

        // Merge arrays from the back
        while (ia >= 0 && ib >= 0) {
            if (arr[ia] > brr[ib]) {
                arr[index] = arr[ia];
                ia--;
            } else {
                arr[index] = brr[ib];
                ib--;
            }
            index--;
        }

        // If there are remaining elements in brr, copy them to arr
        while (ib >= 0) {
            arr[index] = brr[ib];
            ib--;
            index--;
        }

        // No need to move remaining elements in arr, they are already in place.

        // Print the merged array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
