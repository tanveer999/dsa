package Array;

public class MaximumSumOfKConsecutiveElements {
    public static void main(String[] args) {
        int[] arr = {1, 8, 30, -5, 20, 7};
        int k = 3;
        System.out.println(maximumSum(arr, arr.length, k));
    }

    public static int maximumSum(int[] arr, int n, int k) {
        int sum = 0, maximumSum;

        for(int i = 0; i < k; i++) {
            sum += arr[i];
        }
        maximumSum = sum;
        for(int i = k; i < n; i++) {
            sum += arr[i] - arr[i - k];
            maximumSum = Math.max(maximumSum, sum);
        }
        return maximumSum;

    }
}
