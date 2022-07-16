package CollectionsJava;

import java.util.Set;
import java.util.TreeSet;
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(4);
        ts.add(1);
        ts.add(3);
        ts.add(2);
        ts.add(10);
        ts.remove(4);

        System.out.println(ts.ceiling(5));
        System.out.println(ts);
    }
}
