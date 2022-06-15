package Strings;
import java.util.HashMap;
public class Anagram {
    public static void main(String[] args) {
        // String str1 = "listen";
        // String str2 = "silent";
        
        String str1 = "aab";
        String str2 = "bab";
        System.out.println(ifAnagram(str1, str2));
    }

    static boolean ifAnagram(String str1, String str2) {
        HashMap<Character,Integer> hm = new HashMap<>();
        
        if(str1.length() != str2.length()) {
            return false;
        }
        for(int i = 0; i < str1.length(); i++) {
            hm.put(str1.charAt(i), hm.getOrDefault(str1.charAt(i), 0) + 1);
        }

        for(int i = 0; i < str2.length(); i++) {
            if(hm.containsKey(str2.charAt(i))) {
                hm.put(str2.charAt(i), hm.get(str2.charAt(i)) - 1);
                if(hm.get(str2.charAt(i)) == 0) {
                    hm.remove(str2.charAt(i));
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
