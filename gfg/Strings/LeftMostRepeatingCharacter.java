package Strings;
import java.util.Arrays;
public class LeftMostRepeatingCharacter {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        str = "abcd";
        str = "abbcc";
        System.out.println(findIndex(str));
        System.out.println(findIndex1(str));
    }
    static int findIndex(String str) {
        for(int i = 0; i < str.length();i++) {
            for(int j = i + 1; j < str.length();j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    return i;
                }
            }
        }
        return -1;
    }

    static int findIndex1(String str) {
        int[] count = new int[128];

        for(int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for(int i = 0; i < str.length(); i++) {
            if(count[str.charAt(i)] > 1) {
                return i;
            }
        }
        return -1;
    }
}
