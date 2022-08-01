package DynamicProgramming;

public class CoinChangeCount {
    public static void main(String[] args) {
        int[] coins = {1, 2, 3};
        int sum = 4;
        System.out.println(getCount(coins, coins.length, sum));
    }

    static int getCount(int[] coins, int n, int sum) {

        if(sum == 0) {
            return 1;
        }
        if(n == 0) {
            return 0;
        }

        int res = getCount(coins, n - 1, sum);

        if(sum >= coins[n - 1]) {
            res = res + getCount(coins, n, sum - coins[n - 1]);
        }
        return res;
    }
}
