package Stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NextSmallerElement {
    public static void main(String[] args) {
        int[] arr = {4, 8, 5, 2, 25};
        solve(arr);
    }

    static void solve(int[] arr) {
        List<Integer> al = new ArrayList<>();
        ArrayDeque<Integer> st = new ArrayDeque<>();

        al.add(-1);
        st.push(arr[arr.length - 1]);
        for(int i = arr.length - 2; i >=0; i--) {
            while(!st.isEmpty() && arr[i] <= st.peek()) {
                st.pop();
            }
            int smallest = st.isEmpty() ? -1 : st.peek();
            al.add(smallest);
            st.push(arr[i]);
        }
        Collections.reverse(al);
        System.out.println(al);

    }
}
