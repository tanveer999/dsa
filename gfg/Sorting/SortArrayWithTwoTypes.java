package Sorting;

import java.util.Arrays;

public class SortArrayWithTwoTypes {
    public static void main(String[] args) {
        int[] arr = {15,14,13,12};
        partition(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void partition(int[] arr) {
        int i = 0;

        for(int j = 0; j < arr.length; j++) {
            if(arr[j] % 2 == 0) {
                swap(arr, i, j);
                i++;
            }
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
