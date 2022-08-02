package DynamicProgramming;

public class MinimumCoinsToMakeAValue {
    public static void main(String[] args) {
        int[] coins = {25, 10, 5};
        int value = 30;

        System.out.println(solve(coins, value));
        System.out.println(solveDp(coins, value));
    }

    static int solveDp(int[] coins, int value) {
        int[] dp = new int[value + 1];
        dp[0] = 0;

        for(int i = 1; i <= value; i++) {
            dp[i] = Integer.MAX_VALUE;
            for(int j = 0; j < coins.length; j++) {
                if(i >= coins[j]) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]]);
                }
            }
            if(dp[i] != Integer.MAX_VALUE) {
                dp[i]++;
            }
        }
        return dp[value];
    }

    static int solve(int[] coins, int value) {

        if(value == 0) return 0;
        if(value < 0) return -1;

        int res = Integer.MAX_VALUE;
        for(int i = 0; i < coins.length; i++) {
            int temp = solve(coins, value - coins[i]);
            if(temp !=  -1) {
                res = Math.min(res, temp);
            }
        }

        if(res == Integer.MAX_VALUE) return -1;

        return res + 1;
    }
}
