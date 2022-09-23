package DP;

public class CoinChange {
    public static void main(String[] args) {
        int[] steps = {1,2};
        int sum = 3;
        System.out.println(solve(steps, sum, 2));
    }

    static int solve(int[] steps, int sum, int n) {
        if(sum == 0) return 1;
        if(n == 0) return 0;

        if(steps[n - 1] > sum) {
            return solve(steps, sum, n - 1);
        } else {
            return solve(steps, sum, n -1) + solve(steps, sum - steps[n - 1], n);
        }
    }
}
