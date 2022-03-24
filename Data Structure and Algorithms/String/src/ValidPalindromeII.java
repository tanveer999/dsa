public class ValidPalindromeII {

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(validPalindrome(s));
    }
    public static boolean validPalindrome(String s) {
        int first = 0, last = s.length() - 1;

        while(first <= last) {
            if(s.charAt(first) == s.charAt(last)) {
                first++;
                last--;
            } else {
                return isPalindrome(s, first + 1, last) || isPalindrome(s, first, last - 1);
            }
        }
        return true;
    }

    public static boolean isPalindrome(String s, int first, int last) {
        while(first < last) {
            if (s.charAt(first) == s.charAt(last)) {
                first++;
                last--;
            } else {
                return false;
            }
        }
        return true;
    }
}


