package Heap;

import java.util.PriorityQueue;
import java.util.Collections;

class Pair implements Comparable<Pair> {
    int diff;
    int index;
    Pair(int diff, int index) {
        this.diff = diff;
        this.index = index;
    }

    public int compareTo(Pair p) {
        return this.diff - p.diff;
    }
}

public class KClosestElement {
    public static void main(String[] args) {
        int[] arr = {30, 40, 32,33,36,37};
        int k = 3, item = 38;
        closestElements(arr, k, item);
        closestElements1(arr, k, item);
    }

    static void closestElements1(int[] arr, int k, int item) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < k; i++) {
            pq.add(new Pair(item - arr[i], i));
        }

        for(int i = k;i < arr.length; i++) {
            int diff = item - arr[i];

            if(pq.peek().diff > diff) {
                pq.poll();
                pq.add(new Pair(diff, i));
            }
        }

        for(Pair p : pq) {
            System.out.print(arr[p.index] + " ");
        }
    }

    static void closestElements(int[] arr, int k, int item) {
        boolean[] visited = new boolean[arr.length];
        int minValue = Integer.MAX_VALUE, minIndex=0;

        for(int i = 0 ; i < k; i++) {
            minValue = Integer.MAX_VALUE;

            for(int j = 0; j < arr.length; j++) {
                if(visited[j]) continue;

                if(Math.abs(item - arr[j]) <= minValue) {
                    minValue = Math.abs(item - arr[j]);
                    minIndex = j;
                }
            }
            visited[minIndex] = true;
            System.out.println(arr[minIndex]);
        }

    }
}
