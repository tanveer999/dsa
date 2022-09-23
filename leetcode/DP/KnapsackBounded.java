package DP;

import java.util.Arrays;

public class KnapsackBounded {
    static int dp[][];
    public static void main(String[] args) {
        int[] wt = {1,3,4,5};
        int[] val = {1,4,5,7};
        int w = 7;
        dp = new int[wt.length + 1][w + 1];
        for(int i = 0; i <= wt.length; i++) {
            for(int j = 0; j <= w; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(solve(wt, val, w, wt.length));
        System.out.println(solve1(wt, val, w, wt.length));
    }

    static int solve(int[] wt, int val[], int w, int n) {
        if(n == 0 || w == 0) {
            dp[n][w] = 0;
        }

        if(dp[n][w] != -1) 
            return dp[n][w];
        else {

            if(wt[n - 1] > w) {
                dp[n][w] = solve(wt, val, w, n - 1);
            } else {
                dp[n][w] = Math.max(solve(wt, val, w,  n - 1), val[n - 1] + solve(wt, val, w - wt[n - 1], n - 1));
            }
            return dp[n][w];
        }

    }

    static int solve1(int[] wt, int val[], int w, int n) {
        // int n = wt.length;
        int[][] t = new int[n + 1][w + 1];
        // for(int i = 1; i <= n; i++) {
        //     for(int j = 1; j <= w; j++) {
        //         t[i][j] = -1;
        //     }
        // }

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= w; j++) {
                if(wt[i - 1] > j) {
                    t[i][j] = t[i - 1][j];
                } else {
                    t[i][j] = Math.max(t[i - 1][j], val[i - 1] + t[i - 1][j - wt[i - 1]]);
                }
            }
        }
        // for(int i = 0; i < n + 1; i++) {
        //     System.out.println(Arrays.toString(t[i]));
        // }
        return dp[n][w];
    }
}
