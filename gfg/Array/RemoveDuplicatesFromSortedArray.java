package Array;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 4, 5};
        // int[] arr = {1, 2, 3, 4, 4, 4, 5, 6, 6, 6, 7};
        // int[] arr = {1};
        int[] arr = {};
        int n = arr.length;
        System.out.println("Original array: " + Arrays.toString(arr));
        // removeDuplicate1(arr, n);

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

        System.out.print("Array after removing duplicates: " );
        for(i = 0; i < newLength; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
    }
}
