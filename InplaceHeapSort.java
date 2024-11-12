package Sorting;

import java.util.Arrays;

public class InplaceHeapSort {
    public static void heapify(int[] arr, int i, int n) {//堆化过程，从底部开始对于每个非叶子节点，将较小的元素下沉
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if(left<n&&arr[left]>arr[largest]) {
            largest = left;
        }
        if(right<n&&arr[right]>arr[largest]) {
            largest = right;
        }
        if(i!=largest){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, largest, n);
        }
    }
    public static void heapSort(int[] arr){
        int n = arr.length;
        for(int i=n/2-1;i>=0;i--){//构建最大堆，从最后一个非叶子节点开始
            heapify(arr, i, n);
        }
        for(int i=n-1;i>=0;i--){//将最大堆的根节点与最后一个节点交换，然后重新堆化，从而将较大值后移
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr,0,i);
        }
    }
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7, 10, 12, 31, 2, 1, 8};
        System.out.println("原始数组: " + Arrays.toString(arr));
        
        heapSort(arr);
        
        System.out.println("排序后数组: " + Arrays.toString(arr));
    }
}
