package Strings;

public class Swap {
    public static void main(String[] args) {
        String str = "abcde";
        str = swap(str, 1, 3);
        System.out.println(str);
    }

    static String swap(String str, int i, int j) {
        StringBuilder sb = new StringBuilder(str);

        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));

        return sb.toString();
    }
}
