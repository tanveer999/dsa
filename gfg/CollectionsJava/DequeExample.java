package CollectionsJava;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        dq.addLast(1);
        // dq.addLast(null); // cannot add null throws null pointer exception
        dq.addLast(2);

        // dq.addLast(null);
        // System.out.println(dq);

    }
}
