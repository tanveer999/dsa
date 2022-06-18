package Strings;

import java.util.Arrays;

public class KMP {
    public static void main(String[] args) {
        String str = "ababaababaad";
        String pattern = "ababa";

        findMatch(str, pattern);
    }


    static void findMatch(String str, String pat) {
        int[] lps = findLps(pat);
        int n = str.length();
        int j = 0;
        int i = 0;
        while( i < n) {
            if(str.charAt(i) == pat.charAt(j)) {
                i++;
                j++;
            }

            if(j == pat.length()) {
                System.out.println(i - j);
                j = lps[j - 1];
            } else if(i < n && str.charAt(i) != pat.charAt(j)){
                if(j == 0)
                    i++;
                else
                    j = lps[j - 1];
            }
        }
    }

    static int[] findLps(String str) {
        int len = 0;
        int[] lps = new int[str.length()];
        int i = 1;

        while(i < str.length()) {
            if(str.charAt(i) == str.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if(len == 0) {
                    lps[i] = 0;
                    i++;
                } else {
                    len = lps[len - 1];
                }
            }
        }
        return lps;
    }
}
