package Sorting;

public class QuickSort {
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        for (int j = low + 1; j <= high; j++) {
            if (arr[j] < pivot) {
                i++;
                int tmp = arr[j];
                arr[j] = arr[i];
                arr[i] = tmp;
            }
        }
        int tmp = arr[low];
        arr[low] = arr[i];
        arr[i] = tmp;
        return i;
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
