package Sorting;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 6, 7};
        int[] arr2 = {2, 3, 3, 3, 4};

        int[] mergedArray = mergeArray(arr1, arr2);

        System.out.println(Arrays.toString(mergedArray));
    }

    public static int[] mergeArray(int[] arr1, int[] arr2) {
        int m = arr1.length, n = arr2.length;
        int i = 0, j = 0, k = 0;
        int[] temp = new int[m+n];
        while(i<m && j<n) {
            if(arr1[i] < arr2[j]) {
                temp[k++] = arr1[i++];
            } else {
                temp[k++] = arr2[j++];
            }
        }
        while(i < m) {
            temp[k++] = arr1[i++];
        }
        while(j<n) {
            temp[k++] = arr2[j++];
        }
        return temp;
    }
}
