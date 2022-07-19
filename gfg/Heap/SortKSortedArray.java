package Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SortKSortedArray {
    public static void main(String[] args) {
        // int[] arr = {9, 8, 7, 18, 19, 17};
        // int k = 2;
        int[] arr = {10, 9, 7, 8, 4, 70, 50, 60};
        int k = 4;
        sort(arr, k);
    }

    static void sort(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // for(int i = 0; i < arr.length; i++) {
        //     pq.add(arr[i]);
        // }
        int index = 0;

        for(int i = 0; i <=k; ++i) {
            pq.add(arr[i]);
        }

        for(int i = k + 1; i < arr.length; i++) {
            arr[index++] = pq.poll();
            pq.add(arr[i]);
        }

        while(!pq.isEmpty()) {
            arr[index++] = pq.poll();
        }

        System.out.println(Arrays.toString(arr));
    }
}
