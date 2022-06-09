package Sorting;

import java.util.Arrays;

public class SortArrayWithThreeTypes {
    public static void main(String[] args) {
        int[] arr = {4, 7, 4, 5, 3, 2};
        // partition(arr);
        hoareModifiedPartition(arr);
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

    public static void hoareModifiedPartition(int[] arr) {
        int i = -1, j = arr.length;
        int pivot = arr[0];

        while(true) {
            if(i >= 0 && arr[i] == pivot) {
                swap(arr, i, i + 1);
            }
            if(j < arr.length && arr[j] == pivot) {
                swap(arr, j, j - 1);
            }
            do{
                i++;
            } while(arr[i] < pivot);
            do{
                j--;
            }while(arr[j] > pivot);
            if(i >= j) return;
            swap(arr, i, j);
            if(i >= 0 && arr[i] == pivot) {
                swap(arr, i, i + 1);
            }
            if(j < arr.length && arr[j] == pivot) {
                swap(arr, j, j - 1);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
