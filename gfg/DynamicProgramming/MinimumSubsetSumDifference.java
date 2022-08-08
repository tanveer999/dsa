package DynamicProgramming;

import java.util.Arrays;

public class MinimumSubsetSumDifference {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, 2, 1};
        System.out.println(solve(arr, arr.length));
    }

    static int solve(int[] arr,int n) {
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }
        boolean[][] dp = new boolean[n + 1][sum + 1];

        for(int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j<= sum; j++) {
                if(arr[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                }
            }
        }

        int minDiff = Integer.MAX_VALUE;
        for(int i = 1; i <= sum / 2; i++) {
            if(dp[n][i] == true) {

                minDiff = Math.min(minDiff, sum - 2 * i);
            }
        }

        // System.out.println(Arrays.toString(dp[n]));


        return minDiff;
    }
}
