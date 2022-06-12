package Hashing;

import java.util.HashSet;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        // int[] arr = {5,8,6,13,-1};
        // int sum = 22;

        int[] arr = {3,2,5,6};
        int sum = 10;
        System.out.println(findSum(arr, sum));
    }

    static boolean findSum(int[] arr, int sum) {
        HashSet<Integer> hs = new HashSet<>();
        int prefix_sum = 0;
        for(int i : arr) {  
            prefix_sum += i;

            if(prefix_sum == sum) {
                return true;
            }

            if(hs.contains(prefix_sum - sum)) {
                return true;
            } else {
                hs.add(prefix_sum);
            }     
        }
        return false;
    }
}
