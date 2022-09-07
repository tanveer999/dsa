public class PalindromeRecursive {
    public static void main(String[] args) {
        String str = "namannn";
        System.out.println(solve(str, 0, str.length() - 1));
    }

    static boolean solve(String str, int s, int l) {

        if(l <= s) return true;
        if(str.charAt(s) == str.charAt(l) && solve(str, ++s, --l)) {
            return true;
        } else return false;
    }
}
