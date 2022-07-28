package Greedy;

import java.util.ArrayList;
import java.util.Arrays;

class Pair implements Comparable<Pair>{
    int x;
    int y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Pair p) {
        return this.y - p.y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

}

public class ActivitySelection {
    public static void main(String[] args) {
        Pair[] p = new Pair[4];
        p[0] = new Pair(2, 4);
        p[1] = new Pair(1, 3);
        p[2] = new Pair(3, 8);
        p[3] = new Pair(10, 11);
        

        System.out.println(findOptimal(p));
    }

    static int findOptimal(Pair[] p) {
        Arrays.sort(p);
        ArrayList<Pair> temp = new ArrayList<>();

        temp.add(p[0]);

        for(int i = 1; i < p.length; i++) {
            if(temp.get(temp.size() - 1).y <= p[i].x) {
                temp.add(p[i]);
            }
        }

        return temp.size();
    }
}
