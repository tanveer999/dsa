package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Reverse {
    public static void main(String[] args) {
        Queue<Integer> q= new ArrayDeque<>();
        for(int i = 1 ; i < 5; i++) {
            q.add(i);
        }
        System.out.println(q);

        reverse(q);
        System.out.println(q);
    }

    static void reverse(Queue<Integer> q) {
        if(q.isEmpty()){
            return;
        }

        int element = q.remove();

        reverse(q);

        q.add(element);
    }

}
