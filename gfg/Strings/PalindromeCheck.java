package Strings;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "ABCDCBA";
        // String str = "geeks";
        System.out.println(check(str));
        System.out.println(check1(str));
    }

    static boolean check(String str) {
        int i = 0, j = str.length() - 1;

        while(i <= j) {
            if(str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    static boolean check1(String str) {
        StringBuilder reverse = new StringBuilder(str);
        reverse.reverse();

        if(str.equals(reverse.toString())) {
            return true;
        } else {
            return false;
        }
    }
}
