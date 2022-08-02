package DynamicProgramming;

public class EditDistance {
    public static void main(String[] args) {
        String str1 = "saturday";
        String str2 = "sunday";
        System.out.println(findChanges(str1, str2, str1.length(), str2.length()));
        System.out.println(findChangesDp(str1, str2, str1.length(), str2.length()));
    }

    static int findChangesDp(String str1, String str2, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];

        for(int i = 0; i <=m; i++) {
            dp[i][0] = i;
        }

        for(int i = 0; i <=n ; i++) {
            dp[0][i] = i;
        }

        for(int i = 1; i <=m; i++) {
            for(int j = 1; j <= n; j++) {
                if(str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1]));
                }
            }   
        }
        return dp[m][n];
    }

    static int findChanges(String str1, String str2, int m, int n) {

        if(m == 0) {
            return n;
        }

        if(n == 0) {
            return m;
        }

        if(str1.charAt(m - 1) == str2.charAt(n - 1)) {
            return findChanges(str1, str2,  m - 1, n - 1);
        } else {
            return 1 + Math.min(findChanges(str1, str2, m, n-1), Math.min(findChanges(str1, str2, m - 1, n), findChanges(str1, str2, m - 1, n - 1)));
        }
    }
}
