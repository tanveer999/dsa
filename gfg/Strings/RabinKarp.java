package Strings;

public class RabinKarp {
    public static void main(String[] args) {
        String str = "ccabcdefabc";
        String pattern = "abc";

        new RabinKarp().findIndex(str, pattern);
    }

    void findIndex(String str, String pattern) {
        int m = pattern.length();
        int n = str.length();
        int p = 0, t = 0, d = 256, q = 101, h = 1;

        for(int i = 1; i <= m - 1; i++) {
            h = (h * d) % q;
        }

        for(int i = 0; i < m; i++) {
            p = (p * d + pattern.charAt(i)) % q;
            t = (t * d + str.charAt(i)) % q;
        }
        for(int i = 0; i < n - m + 1; i++) {
            int j;
            if(p == t) {
                for(j = 0; j < m; j++) {
                    // System.out.println(j);
                    if(pattern.charAt(j) != str.charAt(i + j))
                        break;
                }
                // System.out.println(j);
                if(j == m) {
                    System.out.print(i + " ");
                }
            }
            if(i < n - m) {
                t = (d * (t - (h * str.charAt(i))) + str.charAt(i + m)) % q;
                if(t < 0)
                    t += q;
            }
        }
        System.out.println();

    }
}
