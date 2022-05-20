package Array;

import java.util.Arrays;

public class LeftRotateArrayByOne {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 5};
        // int[] arr = {1};
        int[] arr = {};
        int n = arr.length;

        System.out.println("Original array: " + Arrays.toString(arr));

        leftRotateByOne(arr, n);

        System.out.println("Array after left rotatation by one: " + Arrays.toString(arr));
    }

    public static void leftRotateByOne(int[] arr, int n) {
        if(arr.length == 0) return;
        int temp = arr[0];

        for(int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }

        arr[n - 1] = temp;
    } 
}
