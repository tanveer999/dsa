import java.util.HashMap;
public class ValidAnagram {
    
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "naram"));
    }

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        if(s == null || t == null || s.length() != t.length()) {
            return false;
        }

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        for(int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if(charCount.get(ch) == null) {
                return false;
            }
            if(charCount.get(ch) == 1) {
                charCount.remove(ch);
            } else {
                charCount.put(ch, charCount.get(ch) - 1);
            }
        }
        return true;
    }
}
