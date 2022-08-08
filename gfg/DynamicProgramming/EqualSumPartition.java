package DynamicProgramming;


public class EqualSumPartition {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 4};

        int sum = 0;
        for(int i : arr) {
            sum += i;
        }

        System.out.println(solve(arr));
    }

    static boolean solve(int[] arr) {
        int sum = 0;

        for(int i : arr) {
            sum += i;
        }

        if(sum % 2 != 0) {
            return false;
        } else {
            return subsetSum(arr, sum / 2);
        }
    }

    static boolean subsetSum(int[] arr, int sum) {
        int n = arr.length;
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
        return dp[n][sum];
    }


}
