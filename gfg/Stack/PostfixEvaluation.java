package Stack;

import java.util.ArrayDeque;
import java.util.Arrays;

public class PostfixEvaluation {
    public static void main(String[] args) {
        String[] arr = "10 2 * 3 5 * + 9 -".split(" ");
        System.out.println(arr[2] == "*");
        System.out.println(Arrays.toString(arr));
        int output = evaluate(arr);
        System.out.println(output);
    }

    static int evaluate(String[] arr) {
        ArrayDeque<Integer> st = new ArrayDeque<>();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("*") == false && arr[i].equals("/") == false && arr[i].equals("+") == false && arr[i].equals("-") == false) {
                st.push(Integer.parseInt(arr[i]));
            } else {
                int op2 = st.pop();
                int op1 = st.pop();
                int result = calculate(op1, op2, arr[i]);
                st.push(result);
            }
        }
        return st.pop();
    }
    static int calculate(int op1, int op2, String operator) {
        switch(operator){
            case "*": return op1 * op2;
            case "/": return op2 / op2;
            case "+": return op1 + op2;
            case "-": return op1 - op2;
            default: return -1; 
        }
    }
}
