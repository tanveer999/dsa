package Array;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 4, 5};
        int[] arr = {1, 2, 3, 4, 4, 4, 5, 6, 6, 6, 7};
        // int[] arr = {1};
        // int[] arr = {};
        // int[] arr = {10, 10, 10};
        int n = arr.length;
        System.out.println("Original array: " + Arrays.toString(arr));
        // removeDuplicate1(arr, n);

        System.out.print("Array after removing duplicate elements: ");
        int size = removeDuplicate2(arr, n);
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    // auxillary space - O(n) 
    public static void removeDuplicate1(int[] arr, int n) {
        int[] newArr = new int[n];
        int j = 0, i, newLength = n, count=0;

        if(n != 0)
            newArr[0] = arr[0];

        for(i = 1; i < n; i++) {
            if(arr[i] != arr[j]) {
                newArr[++count] = arr[i];
                j = i;
                // count++;
            } else {
                newLength--;
            }
        }
        if(n > 1)
            newArr[++count] = arr[--i]; // for last element

        System.out.print("Array after removing duplicate elements: " );
        for(i = 0; i < newLength; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
    }

    // auxillary space O(1)
    public static int removeDuplicate2(int[] arr, int n) {
        int i = 1;

        for(int j = 1; j < n; j++) {
            if(arr[j] != arr[i - 1]) {
                arr[i] = arr[j];
                i++;
            }
        }
        return i;
    }
}
