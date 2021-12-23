import java.util.ArrayDeque;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));
    }

    public static boolean isValid(String s) {
        ArrayDeque<Character> ad = new ArrayDeque<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{') {
                ad.push(ch);
                continue;
            }
            if(ad.size() == 0 && (ch == ')' || ch == ']' || ch == '}')) {
                return false;
            }
            if(ad.peek() == '(' && ch == ')') {
                ad.pop();
            } else if (ad.peek() == '[' && ch == ']') {
                ad.pop();
            } else if (ad.peek() == '{' && ch == '}') {
                ad.pop();
            } else {
                return false;
            }
        }
        return (ad.size() == 0);
    }


}
