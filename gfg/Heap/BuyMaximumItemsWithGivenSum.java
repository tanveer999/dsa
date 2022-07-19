package Heap;

import java.util.PriorityQueue;

public class BuyMaximumItemsWithGivenSum {
    public static void main(String[] args) {
        // int[] arr = {1, 12, 5, 111, 200};
        // int sum = 10;
        int[] arr = {20, 10, 5, 30, 100};
        int sum = 35;
        System.out.println(findMaxItems(arr, sum));
    }

    static int findMaxItems(int[] arr,int sum) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int count = 0;
        for(int i = 0; i < arr.length;i++) {
            pq.add(arr[i]);
        }

        while(!pq.isEmpty()) {
            int item = pq.poll();
            if(item <= sum) {
                sum = sum - item;
                count++;
            }
            if(item > sum) {
                break;
            }
        }
        return count;
    }
}
