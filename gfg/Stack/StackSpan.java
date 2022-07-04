package Stack;

import java.util.ArrayDeque;

public class StackSpan {
    public static void main(String[] args) {
        int[] arr = {60, 10, 20, 15, 35, 50};
        stackSpan(arr);
    }

    public static void stackSpan(int[] arr) {
        ArrayDeque<Integer> s = new ArrayDeque<>();

        System.out.print(1 + " ");
        s.push(0);

        for(int i = 1; i < arr.length; i++) {
            while(s.isEmpty() == false && arr[i] >= arr[s.peek()]) {
                s.pop();
            }
            int span =  s.isEmpty() == true ? i + 1 : i - s.peek();
            System.out.print(span + " ");
            s.push(i);
        }

    }
}
