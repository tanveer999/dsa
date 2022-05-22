package Array;

public class MaximumDifference {
    public static void main(String[] args) {
        // int[] arr = {2, 3, 10, 6, 4, 8, 1};
        int[]  arr = {7, 9, 5, 6, 3, 2};
        // int[] arr = {10, 20, 30};
        // int[] arr = {30, 10, 8, 2};

        System.out.println("Maximum difference is(solution 1): " + maximumDifference1(arr, arr.length));
        System.out.println("Maximum difference is(solution 2): " + maximumDifference2(arr, arr.length));
    }
    
    // time complexity O(n^2)
    public static int maximumDifference1(int[] arr, int n) {
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

    // time complexity O(n)
    public static int maximumDifference2(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        int j = 0;
        for(int i = 1; i < n; i++) {
            // if(arr[i] - arr[j] > max) {
            //     max = arr[i] - arr[j];
            // }
            max = Math.max(max, arr[i] - arr[j]);
            if(arr[i] < arr[j]) {
                j = i;
            }

        }
        return max;
    }
}
