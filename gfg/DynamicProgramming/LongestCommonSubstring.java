package DynamicProgramming;

public class LongestCommonSubstring {
    public static void main(String[] args) {
        String str1 = "abcdfe";
        String str2 = "acdzxe";

        System.out.println(solve(str1, str2, str1.length(), str2.length()));
    }

    static int solve(String str1, String str2, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];

        for(int i = 1; i <=m ; i++) {
            for(int j = 1; j <= n; j++) {
                if(str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        
        int len = 0;

        for(int i = 1; i <=m ; i++) {
            for(int j = 1; j <= n; j++) {
                len = Math.max(len, dp[i][j]);
            }
        }

        return len;
    }
}
