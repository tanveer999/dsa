package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class GenerateNumberFromDigit {
    public static void main(String[] args) {
        int n = 10;
        generateNumberFromDigit(5, 6, 10);
    }

    static void  generateNumberFromDigit(long d1, long d2, long n) {
        Queue<String> q = new ArrayDeque<>();
        String s1 = Long.toString(d1);
        String s2 = Long.toString(d2);

        q.add(s1);
        q.add(s2);
        // System.out.println(s1 + " " + s2 + " ");

        // long count = 2;

        for(int i = 0; i < n; i++) {
            String num = q.remove();
            System.out.println(num + " ");
            q.add(num+"5");
            q.add(num+"6");
        }
    }
}
