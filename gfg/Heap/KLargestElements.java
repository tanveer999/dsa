package Heap;

import java.util.PriorityQueue;
import java.util.Collections;
public class KLargestElements {
    public static void main(String[] args) {
        // int[] arr = {5, 15, 10, 20, 8};
        // int k = 2;

        int[] arr = {8, 6, 4, 10, 9};
        int k = 3;
        findElements(arr, k);
        findElements1(arr, k);
    }

    //min heap

    static void findElements1(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0 ; i < k; i++) {
            pq.add(arr[i]);
        }

        for(int i = k ; i < arr.length; i++ ){
            if(pq.peek() < arr[i])
                pq.poll();
            pq.add(arr[i]);
        }

        System.out.println(pq);
    }
    // max heap
    static void findElements(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }

        for(int i = 0 ; i < k; i++) {
            System.out.println(pq.poll());
        }
    }
}
