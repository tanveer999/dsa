package Array;

public class MaximumSumSubArray {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 3};
        // int[] arr = {2, 3, -8, 7, -1, 2, 3};
        int[] arr = {5, 8, 3};
        // int[] arr = {-6, -1, -8};
        // int[] arr = {-3, 8, -2, 4, -5, 6};
        System.out.println(maximumSum1(arr, arr.length));
        System.out.println(maximumSum2(arr, arr.length));
    }

    public static int maximumSum1(int[] arr, int n) {
        int max = arr[0], sum;

        for(int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
            sum = arr[i];
            for(int j = i + 1; j < n; j++) {
                sum += arr[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    public static int maximumSum2(int[] arr, int n) {
        int sum = arr[0], max = arr[0];

        for(int i = 1; i < n; i++) {
            max = Math.max(max + arr[i], arr[i]);
            sum = Math.max(sum, max);
        }
        return sum;
    }
}
