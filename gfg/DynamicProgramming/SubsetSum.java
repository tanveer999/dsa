package DynamicProgramming;

import java.util.Arrays;

public class SubsetSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 7};
        int sum = 10;
        

        long start, end;

        start = System.nanoTime();
        System.out.println(findSum(arr, sum, 0, arr.length));
        end = System.nanoTime();
        System.out.println("time " + (end - start));

        start = System.nanoTime();
        System.out.println(findSumDp(arr, sum, arr.length));
        end = System.nanoTime();
        System.out.println("time " + (end - start));


        start = System.nanoTime();
        System.out.println(isSum(arr, sum, arr.length));
        end = System.nanoTime();
        System.out.println("time " + (end - start));

        start = System.nanoTime();
        System.out.println(isSumDP(arr, sum, arr.length));
        end = System.nanoTime();
        System.out.println("time " + (end - start));
    }

    static boolean isSumDP(int[] arr, int sum, int n) {
        boolean[][] dp = new boolean[n + 1][sum + 1];

        for(int i = 0; i <= sum; i++) {
            dp[0][i] = false;
        }

        for(int i = 0; i < n + 1; i++) {
            dp[i][0] = true;
        }

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= sum; j++) {

                if(arr[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                }
            }
        }

        System.out.println(Arrays.toString(dp[n]));
        return dp[n][sum];
    }

    static boolean isSum(int[] arr, int sum, int n) {

        if(sum == 0) return true;
        if(n == 0) return false;

        if(arr[n - 1] > sum) {
            return isSum(arr, sum, n - 1);
        } else {
            return (isSum(arr, sum, n -1 ) || isSum(arr, sum - arr[n - 1], n - 1));
        }
    }

    static int findSumDp(int[] arr, int sum, int n) {
        int[][] dp = new int[arr.length + 1][sum + 1];

        for(int i = 0; i <= arr.length; i++) {
            dp[i][0] = 1;
        }

        for(int j = 1; j <= sum; j++) {
            dp[0][j] = 0;
        }

        for(int i = 1; i < arr.length + 1; i++) {
            for(int j = 1; j < sum + 1; j++) {
                if(j < arr[i - 1]) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - arr[i - 1]];
                }
            }
        }


        return dp[arr.length][sum];
    }

    static int findSum(int[] arr, int sum, int tempSum, int n) {

        if(n == 0) {
            return tempSum == sum ? 1 : 0;
        }

        return findSum(arr, sum, tempSum, n - 1) + findSum(arr, sum, tempSum + arr[n - 1], n - 1);
    }
}
