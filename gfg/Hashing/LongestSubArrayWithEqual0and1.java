package Hashing;
import java.util.HashMap;
public class LongestSubArrayWithEqual0and1 {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,1,1,0};
        // int[] arr = {0,0,0,0};
        // int[] arr = {1,0,1,1,1,0,0};
        System.out.println(findCount1(arr));
        System.out.println(findCount2(arr));
    }

    // naive

    static int findCount1(int[] arr) {
        int count0, count1;
        int n = arr.length;
        int max = 0;
        for(int i = 0; i < n; i++) {
            count0=count1=0;
            for(int j = i; j < n; j++) {
                if(arr[j] == 0) {
                    count0++;
                } else {
                    count1++;
                }
                if(count0 == count1) {
                    max = Math.max(max, count0+count1);
                }
            }
        }
        return max;
    }

    static int findCount2(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int prefix_sum = 0, max = 0;
        for(int i = 0; i < arr.length;i++) {
            if(arr[i] == 0) {
                arr[i] = -1;
            }
        }

        for(int i = 0 ; i < arr.length; i++) {
            prefix_sum += arr[i];
            if(prefix_sum == 0) {
                max = i + 1;
            }

            if(hm.containsKey(prefix_sum) == false) {
                hm.put(prefix_sum, i);
            }
            if(hm.containsKey(prefix_sum)) {
                max = Math.max(max, i - hm.get(prefix_sum));
            }
        }
        return max;

    }
}
