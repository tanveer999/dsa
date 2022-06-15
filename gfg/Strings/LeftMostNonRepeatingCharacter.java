package Strings;
import java.util.Arrays;
public class LeftMostNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        // str = "abcabc";
        str = "fabcabcf";
        // str = "apple";
        System.out.println(findCharacter(str));
    }

    static int findCharacter(String str) {
        boolean[] visited = new boolean[256];
        int res = -1;
        for(int i = str.length() - 1; i >= 0; i--) {
            if(visited[str.charAt(i)] == false) {
                res = i;
                visited[str.charAt(i)] = true;
            } else {
                if(res != -1 && str.charAt(res) == str.charAt(i)) {
                    res = -1;
                }
            }
        }
        return res;
    }
}
