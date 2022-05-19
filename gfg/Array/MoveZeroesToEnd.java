package Array;

import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1, 2, 0, 0, 5, 0, 0, 3, 4};
        int n = arr.length;

        System.out.println("Original array: " + Arrays.toString(arr));

        arr = moveZeroesToEnd1(arr, n);

        System.out.println("Array after moving zeroes to the end: " + Arrays.toString(arr));

    }

    // Auxillary space O(n)
    public static int[] moveZeroesToEnd1(int[] arr, int n) {
        int[] newArr = new int[n];
        int j = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] != 0) {
                newArr[j++] = arr[i];
            }
        }

        return newArr;
    }
}
