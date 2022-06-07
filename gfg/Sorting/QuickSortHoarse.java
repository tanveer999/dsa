package Sorting;

import java.util.Arrays;

public class QuickSortHoarse {
    public static void main(String[] args) {
        int[] arr = {8, 4, 7, 9, 3, 10, 5};
        // int[] arr = {1};
        int low = 0, high = arr.length - 1;
        quickSort(arr, low, high);
        System.out.println(Arrays.toString(arr));
        // System.out.println(partition(arr, low, high));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if(low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot);
            quickSort(arr, pivot + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low - 1, j = high + 1;

        while(true) {
            do{
                i++;
            } while(arr[i] < pivot);

            do{
                j--;
            } while(arr[j] > pivot);

            if(i >= j) return j;

            swap(arr, i, j);
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
