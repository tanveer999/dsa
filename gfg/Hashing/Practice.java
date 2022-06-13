package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

class Point implements Comparable<Point>{
    int x;
    int y;

    public int compareTo(Point a) {
        return this.x - a.x;
    }

    public String toString() {
        return this.x + " " + this.y;
    }
}

public class Practice {
    public static void main(String[] args) {
        Random rand = new Random();
        Point[] p = new Point[5];

        for(int i = 0; i < p.length; i++) {
            p[i] = new Point();
            p[i].x = rand.nextInt(0, 10);
            p[i].y = rand.nextInt(10, 20);
        }

        for(Point point : p) {
            System.out.println(point);
        }

        Arrays.sort(p);

        for(Point point : p) {
            System.out.println(point);
        }
        
        System.out.println("------------------------------------");
        Integer i = 103424234;
        System.out.println(i.SIZE + " " + i.BYTES + " " + i.TYPE);

        System.out.println("-----------------------------------------");

        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(1, 1);
        hm.put(1,2);
        System.out.println(hm);
    }
}
