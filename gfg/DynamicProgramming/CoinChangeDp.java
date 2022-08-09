package DynamicProgramming;

public class CoinChangeDp {
    public static void main(String[] args) {
        int[] coins = {1, 2, 3};
        int sum = 5;

        System.out.println(solve(coins, coins.length, sum));
    }

    static int solve(int[] coins, int n, int sum) {

        if(sum == 0) return 1;
        if(n == 0) return 0;
        if(coins[n - 1] > sum) {
            return solve(coins, n - 1, sum);
        } else {
            return solve(coins, n, sum - coins[n - 1]) + solve(coins, n - 1, sum);
        }
    }
}
