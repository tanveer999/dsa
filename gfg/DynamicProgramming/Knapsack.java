package DynamicProgramming;

import java.util.Arrays;

public class Knapsack {
    public static void main(String[] args) {
        int[] wt = {5, 4, 6, 3};
        int[] val = {10, 40, 30, 50};
        int w  = 10;

        int[][] dp = new int[w + 1][wt.length + 1];

        for(int i = 0; i < w + 1; i++) {
            for(int j = 0; j < wt.length + 1; j++) {
                dp[i][j] = -1;
            }
        }
        long startTime, endTime;
        startTime = System.nanoTime();
        System.out.println(knapsack(w, wt, val, wt.length));
        endTime = System.nanoTime();
        System.out.println("Total time without dp: " + (endTime - startTime));

        startTime = System.nanoTime();
        System.out.println(knapsackDP(w, wt, val, wt.length, dp));
        endTime = System.nanoTime();
        System.out.println("Total time with dp: " + (endTime - startTime));

        startTime = System.nanoTime();
        System.out.println(knapsackDPTabulation(w, wt, val));
        endTime = System.nanoTime();
        System.out.println("Total time with dp tabulation: " + (endTime - startTime));
    }

    static int knapsackDPTabulation(int w, int[] wt, int[] val) {
        int n = wt.length;
        int[][] dp = new int[n + 1][w + 1];

        for(int i = 0; i <=n ; i++) {
            for(int j = 0; j <= w; j++) {
                dp[i][j] = -1;
            }
        }

        for(int i = 0; i <=n; i++) {
            dp[i][0] = 0;
        }

        for(int j = 0; j <= w; j++) {
            dp[0][j] = 0;
        }

        for(int i = 1; i<= n; i++) {
            for(int j = 1; j<= w; j++) {
                if(wt[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], val[i - 1] + dp[i - 1][j - wt[i - 1]]);
                }
            }
        }
        return dp[n][w];
    }

    static int knapsackDP(int w, int[] wt, int[] val, int n, int[][] dp) {
        
        if(w == 0 || n == 0) {
            dp[w][n] = 0;
        }

        if(dp[w][n] != -1) {
            return dp[w][n];
        } else {
            if(wt[n - 1] > w) {
                dp[w][n] =  knapsackDP(w, wt, val, n - 1, dp);
            } else {
                dp[w][n] =  Math.max(knapsackDP(w, wt, val, n - 1, dp), val[n - 1] + knapsackDP(w - wt[n - 1], wt, val, n - 1, dp));
            }
        }
        return dp[w][n];
    }

    static int knapsack(int w, int[] wt, int[] val, int n) {

        if(n == 0 || w == 0) {
            return 0;
        }

        if(wt[n - 1] > w) {
            return knapsack(w, wt, val, n - 1);
        } else {
            return Math.max(knapsack(w, wt, val, n - 1), val[n - 1] + knapsack(w - wt[n - 1], wt, val, n - 1));
        }
    }
}
