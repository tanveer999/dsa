package Stack;
import java.util.ArrayDeque;

public class BalancedParanthesis {
    public static void main(String[] args) {
        String str = "([)]";
        System.out.println(balanced(str));
    }

    static boolean balanced(String str) {
        // ((()), ([]), (())), ([)]
        ArrayDeque<Character> ad = new ArrayDeque<>();
        // System.out.println(ad.peek());
        Character item;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
                ad.push(str.charAt(i));
            }
            if((str.charAt(i) == ')' || str.charAt(i) == ']' || str.charAt(i) == '}') && ad.size() == 0) {
                return false;
            }
            if(str.charAt(i) == ')') {
                item = ad.pop();
                if(item != '(')
                    return false;
            }
            if(str.charAt(i) == ']') {
                item = ad.pop();
                if(item != '[')
                    return false;
            }
            if(str.charAt(i) == '}') {
                item = ad.pop();
                if(item != '{')
                    return false;
            }
        }
        if(ad.size() != 0) {
            return false;
        } else {
            return true;
        }
    }
}
