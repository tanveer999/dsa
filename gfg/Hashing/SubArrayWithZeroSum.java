package Hashing;

import java.util.HashSet;

public class SubArrayWithZeroSum {
    public static void main(String[] args) {
        // int[] arr = {1, 4, 13, -3, -10, 5};
        int[] arr = {5, 8, 6, 13, 3};
        System.out.println(findSum(arr));
    }

    static boolean findSum(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        int prefix_sum = 0;
        for(int i : arr) {
            prefix_sum += i;

            if(prefix_sum == 0) {
                return true;
            }

            if(hs.contains(prefix_sum)) {
                return true;
            } else {
                hs.add(prefix_sum);
            }
        }
        return false;
    }
}
