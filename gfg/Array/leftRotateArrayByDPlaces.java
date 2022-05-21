package Array;

import java.util.Arrays;

public class leftRotateArrayByDPlaces {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        // int[] arr = {1};
        // int[] arr = {};
        int n = arr.length, d = 5;

        if(d > n) {
            d = d % n;
        }

        System.out.println("Original array: " + Arrays.toString(arr));

        // leftRotateByDPlaces1(arr, n, d);
        leftRotateByDPlaces2(arr, n, d);

        System.out.println("Array after left rotatation by one: " + Arrays.toString(arr));
    
    }

    // solution 1
    // time complexity - O(n * d)
    public static void leftRotateByOne(int[] arr, int n) {
        int temp = arr[0]; 

        for(int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
    }

    public static void leftRotateByDPlaces1(int[] arr, int n, int d) {
        for(int i = 0; i < d; i++) {
            leftRotateByOne(arr, n);
        }
    }

    // Solution 2
    // time complexity O(n) and Auxillary space O(d)
    public static void leftRotateByDPlaces2(int[] arr, int n, int d) {
        int[] temp = new int[d];
        int j = 0;

        for(int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        for(int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        for(int i = n - d; i < n; i++) {
            arr[i] = temp[j++];
        }
    }
}
