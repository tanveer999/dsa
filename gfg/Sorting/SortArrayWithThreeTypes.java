package Sorting;

import java.util.Arrays;

public class SortArrayWithThreeTypes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 2};
        partition(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void partition(int[] arr) {
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                swap(arr, i, index);
                index++;
            }
        }

        for(int i = index; i < arr.length; i++) {
            if(arr[i] == 1) {
                swap(arr, i, index);
                index++;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
