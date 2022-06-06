package Sorting;

import java.util.Arrays;

public class LomutoPartition {
    public static void main(String[] args) {
        int[] arr = {10, 80, 30, 90, 40, 50, 70};
        // int[] arr = {10,20,30,40, 80};
        // int[] arr = {20,30,40,50,10};
        int low = 0, high = arr.length-1;
        int index = lPartition(arr, low, high);
        System.out.println(Arrays.toString(arr));
        System.out.println(index);
    }

    public static int lPartition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;
        for(int j = low; j < high; j++) {
            if(arr[j] <= pivot) {
                // temp = arr[j];
                // arr[j] = arr[i];
                // arr[i] = temp;
                swap(arr, i, j);

                i++;
            }
        }
        // arr[high] = arr[i];
        // arr[i] = pivot;
        swap(arr, i, high);
        return i;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
