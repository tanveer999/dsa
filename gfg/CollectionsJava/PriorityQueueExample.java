package CollectionsJava;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(9);
        pq.add(8);
        pq.add(7);
        System.out.println(pq);
    }
}
