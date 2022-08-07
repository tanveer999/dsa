package recursion;

public class test {
    public static void main(String[] args) {
        String str = "abc";
        solve(str, "", str.length());
    }

    static void solve(String str, String curr, int n) {

        if(n == 0) {
            System.out.print(curr + " ");
            return;
        }
        solve(str, curr, n - 1);
        solve(str, curr + str.charAt(n - 1), n -1);
    }
}
