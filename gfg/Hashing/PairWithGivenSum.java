package Hashing;

import java.util.HashSet;

public class PairWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {3,2,8,15,-8};
        int sum = 29;

        System.out.println(findSum(arr, sum));
    }

    static boolean findSum(int[] arr, int sum) {
        HashSet<Integer> hs = new HashSet<>();

        for(int i : arr) {
            if(hs.contains(sum - i)) {
                return true;
            } else {
                hs.add(i);
            }
        }
        return false;
    }
}
