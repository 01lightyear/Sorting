package Sorting;

public class MergeSort {
    public static void merge(int[] array, int left, int mid, int right) {
        int[] array1 = new int[mid - left + 1];
        int[] array2 = new int[right - mid];
        System.arraycopy(array, left, array1, 0, array1.length);
        System.arraycopy(array, mid + 1, array2, 0, array2.length);
        int i = 0, j = 0, k = left;
        while (i < array1.length && j < array2.length) {
            if (array1[i] <= array2[j]) {
                array[k] = array1[i];
                i++;
                k++;
            } else {
                array[k] = array2[j];
                j++;
                k++;
            }
        }
        while (i < array1.length) {
            array[k] = array1[i];
            i++;
            k++;
        }
        while (j < array2.length) {
            array[k] = array2[j];
            j++;
            k++;
        }

    }

    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = left + (-left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    public static void Mergesort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        mergeSort(array, 0, array.length - 1);
    }

    public static void main(String[] args) {
        int[] array = { 38, 27, 43, 3, 9, 82, 10, 11, 3, -1, 100, 9 };
        Mergesort(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
