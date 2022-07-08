package Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaximumsOfSubarrayOfSizeK {
    public static void main(String[] args) {
        int arr[] = {10, 8, 5, 12, 15, 7, 6};
        int k =3;
        solve(arr ,k);
        System.out.println();
        solveNaive(arr, k);
        System.out.println();
    }

    static void solve(int[] arr, int k) {
        Deque<Integer> dq = new ArrayDeque<>();

        for(int i = 0 ; i < arr.length; i++) {
            if(dq.size() == 0){
                dq.addFirst(i);
                continue;
            }

            if(dq.getFirst() <= i - k) {
                dq.removeFirst();
            }
            
            if(arr[i] < arr[dq.getLast()]) {
               dq.addLast(i); 
            } else {
                while(!dq.isEmpty() && arr[i] > arr[dq.getLast()] ) {
                    dq.removeLast();
                }
                dq.addLast(i);
            }

            if(i >= k - 1) {
                System.out.print(arr[dq.getFirst()] + " ");
            }
        }
    }

    static void solveNaive(int[] arr, int k) {
        for(int i = 0; i <= arr.length - k; i++) {
            int max = arr[i];
            for(int j = i+1; j < i + k; j++) {
                max = Math.max(max, arr[j]);
            }
            System.out.print(max + " ");
        }
    }
}
