package recursion;

public class StringPermutation {
    public static void main(String[] args) {
        String str = "ABC";
        permutation(str, 0);
    }

    static void permutation(String str, int i) {

        if(i == str.length()) {
            System.out.println(str);
            return;
        }

        for(int j = i; j < str.length(); j++) {
            str = swap(str, i, j);
            permutation(str, i + 1);
            str = swap(str, i, j);
        }
    }

    static String swap(String str, int i, int j) {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));
        return sb.toString();
    }
}
