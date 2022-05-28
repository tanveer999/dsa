package Array;

import java.util.Arrays;

public class NBonacciNumbers {
    public static void main(String[] args) {
        int n = 3, m = 8;
        printNBonacciNumbers(n, m);
    }

    public static void printNBonacciNumbers(int n, int m) {
        int[] arr = new int[m];
        int sum = 0;
        arr[n - 1] = 1;

        for(int i = 0; i < n; i++) {
            sum += arr[i];
        }

        for(int i = n; i < m; i++) {
            arr[i] = sum;
            sum += arr[i] - arr[i - n];
        }
        System.out.println(Arrays.toString(arr));
    }
}
