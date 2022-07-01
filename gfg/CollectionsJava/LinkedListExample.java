package CollectionsJava;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        for(int i = 1; i<=5; i++)
            ll.add(i);
        System.out.println(ll);

        ll.remove((Integer)2);
        System.out.println(ll);
    }
}
