package Sorting;

import java.util.Arrays;
public class ChocolateDistributionProblem {
    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;
        System.out.println(findMinimumDifference(arr, m));
    }

    public static int findMinimumDifference(int[] arr, int m) {
        Arrays.sort(arr);
        int n = arr.length;

        int min = arr[m - 1] - arr[0];

        for(int i = 1; i < n - m; i++) {
            min = Math.min(min, arr[i+m-1] - arr[i]);
        }
        return min;
    }
}
