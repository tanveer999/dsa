package Strings;

import java.util.HashMap;

public class LongestSubstringWithDistinctCharacter {
    public static void main(String[] args) {
        String str = "abaacdbab";
        System.out.println(findSubstring(str));
        System.out.println(findSubstring1(str));
    }
    static int findSubstring(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int i = 0, max = 0;

        for(int j = 0; j < str.length(); j++) {
            if(!hm.containsKey(str.charAt(j))) {
                hm.put(str.charAt(j), j);
                max = Math.max(max, j - i + 1);
            } else {
                i = hm.get(str.charAt(j)) + 1;
                hm.put(str.charAt(j), j);
            }
        }
        return max;
    }
    // O(n2)
    static int findSubstring1(String str) {
        int max = 0;

        for(int i = 0;i < str.length(); i++) {
            boolean[] visited = new boolean[256];
            for(int j = i; j < str.length(); j++) {
                if(!visited[str.charAt(j)]) {
                    visited[str.charAt(j)] = true;
                } else {
                    max = Math.max(max, j - i);
                    break;
                }
            }
        }
        return max;
    }
}
