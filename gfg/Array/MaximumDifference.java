package Array;

public class MaximumDifference {
    public static void main(String[] args) {
        // int[] arr = {2, 3, 10, 6, 4, 8, 1};
        // int[]  arr = {7, 9, 5, 6, 3, 2};
        // int[] arr = {10, 20, 30};
        int[] arr = {30, 10, 8, 2};

        System.out.println("Maximum difference is: " + maximumDifference(arr, arr.length));
    }

    public static int maximumDifference(int[] arr, int n) {
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr[j] - arr[i] > max) {
                    max = arr[j] - arr[i];
                }
            }
        }
        return max;
    }
}
