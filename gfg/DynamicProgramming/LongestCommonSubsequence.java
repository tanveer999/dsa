package DynamicProgramming;

import java.util.Arrays;

public class LongestCommonSubsequence {
    static String str1 = "abcdgh";
    static String str2 = "aedfhr";
    static int memo[][] = new int[str1.length() + 1][str2.length() + 1];
    
    public static void main(String[] args) {
        for(int i = 0; i < str1.length() + 1; i++) {
            for(int j = 0; j < str2.length() + 1; j++) {
                memo[i][j] = -1;
            }
        }
        System.out.println(find(str1, str2, str1.length(), str2.length()));
    }

    static int find(String str1, String str2, int m, int n) {

        if(memo[m][n] != -1) {
            return memo[m][n];
        }

        if (m == 0 || n == 0) {
            memo[m][n] = 0;
        } else {
            if (str1.charAt(m - 1) == str2.charAt(n - 1)) {
                memo[m][n] = 1 + find(str1, str2, m - 1, n - 1);
            } else {
                memo[m][n] = Math.max(find(str1, str2, m, n - 1), find(str1, str2, m - 1, n));
            }
        }
    
        return memo[m][n];
    }
}
