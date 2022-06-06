package Sorting;

import java.util.Arrays;

public class HoaresPartition {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2, 7, 1, 10};
        int low = 0, high = arr.length-1;
        System.out.println(hPartition(arr, low, high));
        System.out.println(Arrays.toString(arr));
    }

    public static int hPartition(int[] arr, int low, int high) {
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
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
