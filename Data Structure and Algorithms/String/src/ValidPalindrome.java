public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(new ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama"));
    }

    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while(i < j) {
            if(!isAlphaNumeric(s.charAt(i))) {
                i++;
                continue;
            }
            if(!isAlphaNumeric(s.charAt(j))) {
                j--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j))) {
                i++;
                j--;
                continue;
            }
            return false;
        }
        return true;
    }

    public static boolean isAlphaNumeric(char ch) {
        if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch >= '0' && ch <= '9') {
            return true;
        }
        return false;
    }
}
