package CollectionsJava;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();

        // q.add(1);
        // q.add(2);
        // q.offer(3);
        System.out.println(q.peek());
        System.out.println(q);
        // System.out.println("q.remove()" + q.remove()); // if q is empty throws noSuchElementException
        System.out.println("q.poll() " + q.poll());
        // q.remove();
        System.out.println(q);
        System.out.println(q.isEmpty());
        System.out.println(q.size());

    }
}
