package Stack;

import java.util.ArrayDeque;

public class InfixToPostfix {
    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(convert(exp));
    }

    static int prec(char ch) {
        switch(ch){
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
            case '^': return 3;
            default: return -1;
        }
    }

    static String convert(String str) {
        ArrayDeque<Character> st = new ArrayDeque<>();
        String result = "";
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(Character.isLetterOrDigit(ch))
                result += ch;
            
            else if (ch == '(')
                st.push(ch);
            else if (ch == ')') {
                while(!st.isEmpty() && st.peek() != '(') {
                    result += st.pop();
                }
                st.pop();
            } else {
                while(!st.isEmpty() && prec(ch) <= prec(st.peek())) {
                    result+= st.pop();
                }
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            if(st.peek() == '(')
                return "invalid expression";
            result += st.pop();
        }
        return result;
    }
}
