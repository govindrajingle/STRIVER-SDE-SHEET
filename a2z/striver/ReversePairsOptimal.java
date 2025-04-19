package a2z.striver;

import java.util.ArrayList;

public class ReversePairsOptimal {
    public static void main(String[] args) {
        int a[] = {4, 1, 2, 3, 1};
        int n = a.length;
        int count = pairs(a, n);
        System.out.println("The number of reverse pairs are " + count);
    }

    static int pairs(int a[], int n) {
        return mergeSort(a, 0, n - 1);
    }

    static int mergeSort(int a[], int low, int high) {
        int count = 0;
        if (low >= high) {
            return count;
        }
        int mid = low + (high - low) / 2;
        count += mergeSort(a, low, mid);
        count += mergeSort(a, mid + 1, high);
        count += countPairs(a, low, mid, high);
        merge(a, low, mid, high);
        return count;
    }

    static int countPairs(int a[], int low, int mid, int high) {
        int count = 0;
        int right = mid + 1;

        for (int i = low; i <= mid; i++) {
            while (right <= high && a[i] > 2 * a[right]) {
                right++;
            }
            count += (right - (mid + 1));
        }
        return count;
    }

    static void merge(int a[], int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (a[left] <= a[right]) {
                temp.add(a[left]);
                left++;
            } else {
                temp.add(a[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(a[left]);
            left++;
        }

        while (right <= high) {
            temp.add(a[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            a[i] = temp.get(i - low);
        }
    }
}
