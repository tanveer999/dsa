package Hashing;

import java.util.HashMap;

public class LongestSubArrayWithGivenSum {
    public static void main(String[] args) {
        // int[] arr = {8,3,1,5,-6,6,2,2};
        // int sum = 4;

        int[] arr = {3,1,0,1,8,2,3,6,};
        int sum = 5;
        System.out.println(findCount(arr, sum));
    }

    static int findCount(int[] arr, int sum) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max = 0, prefix_sum = 0;

        for(int i = 0; i < arr.length; i++) {
            prefix_sum += arr[i];
            if(prefix_sum == sum) {
                max = Math.max(max, i + 1);
                hm.put(prefix_sum, i);
            }
            if(hm.containsKey(prefix_sum - sum)){
                max = Math.max(max, i - hm.get(prefix_sum - sum));
            } else {
                if(hm.containsKey(prefix_sum)) {
                    continue;
                }
                hm.put(prefix_sum, i);
            }
        }
        return max;
    }
}
