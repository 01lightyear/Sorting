package Sorting;

public class QuickSort {
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low + 1, j = high;
        while (i <= j) {
            while (i <= high && arr[i] < pivot && i <= j) {
                i++;
            }
            while (j >= low && arr[j] > pivot && i <= j) {
                j--;
            }
            if (i <= j) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }
        int tmp = arr[low];
        arr[low] = arr[i - 1];
        arr[i - 1] = tmp;
        return i - 1;
    }

    public static void QuickSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = partition(arr, low, high);
            QuickSort(arr, low, mid - 1);
            QuickSort(arr, mid + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] a = { 1, 3, 2, 3, 6, -1, 9, 10, 13, -2, 5, 3 };
        QuickSort(a, 0, a.length - 1);
        for (int i : a)
            System.out.print(i + " ");
    }
}
