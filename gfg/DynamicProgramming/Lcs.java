package DynamicProgramming;

public class Lcs {
    public static void main(String[] args) {
        String str1 = "abcdgh";
        String str2 = "abedfhr";

        System.out.println(solve(str1, str2, str1.length(), str2.length()));
        System.out.println(solveDp(str1, str2, str1.length(), str2.length()));
    }


    static int solveDp(String str1, String str2, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];

        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                if(str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }

    static int solve(String str1, String str2, int m, int n) {

        if(m == 0 || n == 0) {
            return 0;
        }

        if(str1.charAt(m - 1) == str2.charAt(n - 1)) {
            return 1 + solve(str1, str2, m - 1, n - 1);
        } else {
            return Math.max(solve(str1, str2, m - 1, n), solve(str1, str2, m, n - 1));
        }
    }
}
