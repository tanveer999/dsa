package Sorting;

import java.util.Arrays;

public class MInimumDifference {
    public static void main(String[] args) {
        // int[] arr = {1, 8, 12, 5, 18};
        // int[] arr = {8 ,15};
        int[] arr = {8, -1, 0, 3};
        System.out.println(findMinimumDifference(arr));
    }

    public static int findMinimumDifference(int[] arr) {
        Arrays.sort(arr);
        if(arr.length == 1) 
            return Integer.MAX_VALUE;
        int min = arr[1] - arr[0];
        for(int i = 2; i < arr.length; i++) {
            min = Math.min(min, arr[i] - arr[i - 1]);
        }
        return min;
    }
}
