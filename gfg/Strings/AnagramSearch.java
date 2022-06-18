package Strings;

public class AnagramSearch {

    static final int CHAR = 256;
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        String pat = "abc";

        System.out.println(new AnagramSearch().searchAnagram(str, pat));
    }

    boolean searchAnagram(String str, String pat) {
        int[] ct = new int[CHAR];
        int[] cp = new int[CHAR];

        for(int i = 0; i < pat.length(); i++) {
            ct[str.charAt(i)] += 1;
            cp[pat.charAt(i)] += 1;
        }

        for(int i = pat.length(); i < str.length(); i++) {
            if(isEqual(ct,cp))
                return true;
            ct[str.charAt(i)] += 1;
            ct[str.charAt(i - pat.length())] -= 1;
        }
        return false;
    }

    static boolean isEqual(int[] ct, int[] cp) {
        for(int i = 0; i < CHAR; i++) {
            if(ct[i] != cp[i])
                return false;
        }
        return true;
    }
}
