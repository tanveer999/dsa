package recursion;

public class StringSubsequence {
    public static void main(String[] args) {
        String str = "abc";
        findSubSequence(str, "");
    }

    static void findSubSequence(String str, String ans) {

        if(str.equals("")) {
            System.out.println(ans);
            return;
        }

        findSubSequence(str.substring(1), ans);
        findSubSequence(str.substring(1),  ans + str.charAt(0));
    }
}
