package Strings;
import java.util.Arrays;
public class LongestPrefixSuffixKMP {
    public static void main(String[] args) {
        String str = "ababc";
        int[] lps = findLps(str);
        System.out.println(Arrays.toString(lps));
    }

    static int[] findLps(String str) {
        int[] lps = new int[str.length()];
        String[] suffix;
        String[] prefix;
        for(int i = 1; i < str.length(); i++) {
            suffix = findSuffix(str, i);
            prefix = findPrefix(str, i);
            System.out.println("prefix: " + Arrays.toString(prefix));
            System.out.println("suffix: " + Arrays.toString(suffix));
            System.out.println("---------------");
            int prefixSuffixLength = findLength(prefix, suffix);
            lps[i] = prefixSuffixLength;
        }
        return lps;
    }

    static String[] findPrefix(String str, int i) {
        String temp = "";
        String[] prefix = new String[i];
        for(int j = 0; j < i; j++) {
            prefix[j] = temp + str.charAt(j);
            temp = prefix[j];
        }
        return prefix;
    }

    static String[] findSuffix(String str, int i) {
        String temp = "";
        String[] suffix = new String[i + 1];
        for(int j = i; j >=0; j--) {
            suffix[j] = str.charAt(j) + temp;
            temp = suffix[j];
        }
        return suffix;
    }

    static int findLength(String[] prefix, String[] suffix) {
        int max = 0;

        for(String pStr: prefix) {
            for(String sStr: suffix) {
                if(pStr.equals(sStr)) {
                    max = Math.max(max, pStr.length());
                }
            }
        }
        return max;
    }

}
