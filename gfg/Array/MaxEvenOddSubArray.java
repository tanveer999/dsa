package Array;

public class MaxEvenOddSubArray {
    public static void main(String[] args) {
        // int[] arr = {10, 12, 14, 7, 8};
        // int[] arr = {7, 10, 13, 4};
        int[] arr = {10, 12, 8, 4};
        System.out.println(maxLength(arr, arr.length));
    }

    public static int maxLength(int[] arr, int n) {
        int count = 1, max = 1;
        for(int i = 1; i < n; i++) {
            if((arr[i] % 2 == 1 && arr[i - 1] % 2 == 0) || (arr[i] % 2 == 0 && arr[i - 1] % 2 == 1)) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 1;
            }
        }
        return max;
    }
}
