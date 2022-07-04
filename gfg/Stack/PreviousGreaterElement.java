package Stack;

import java.util.ArrayDeque;

public class PreviousGreaterElement {
    public static void main(String[] args) {
        // int[] arr = {15, 10, 18, 12, 4, 6, 2, 8};
        // int[] arr = {8, 10, 12};
        int[] arr = {30, 20, 10};
        span(arr);
    }

    static void span(int[] arr) {
        ArrayDeque<Integer> s = new ArrayDeque<>();

        System.out.print(-1  + " ");
        s.push(0);

        for(int i = 1; i < arr.length; i++) {
            while(s.isEmpty() == false && arr[i] >= arr[s.peek()])
                s.pop();
            
            int greatest = s.isEmpty() ? -1 : arr[s.peek()];

            System.out.print(greatest + " ");
            s.push(i);
        }
    }
}
