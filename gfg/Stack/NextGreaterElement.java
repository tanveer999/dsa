package Stack;

import java.util.ArrayDeque;
import java.util.Arrays;

public class NextGreaterElement {
    public static void main(String[] args) {
        // int[] arr = {1,2,3};
        int[] arr = {5, 15, 10, 8, 6, 12, 9, 18};
        span(arr);
    }

    static void span(int[] arr) {
        reverse(arr);
        int spanArr[] = new int[arr.length];
        spanArr[0] = -1;
        ArrayDeque<Integer> s = new ArrayDeque<>();
        for(int i = 0 ; i < arr.length; i++) {
            while(s.isEmpty() == false && arr[i] >= arr[s.peek()]) {
                s.pop();
            }
            int span = s.isEmpty() ? -1 : arr[s.peek()];
            spanArr[i] = span;
            s.push(i);
        }
        reverse(spanArr);
        System.out.println(Arrays.toString(spanArr));
    }

    static void reverse(int[] arr) {
        int start = 0, end = arr.length - 1;
        int temp;

        while(start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
