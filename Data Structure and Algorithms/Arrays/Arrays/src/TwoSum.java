import java.util.Arrays;
import java.util.HashMap;
public class TwoSum {
    public static void main(String[] args) throws Exception {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] output = twoSum(nums, target);
        System.out.println("Indices are " + Arrays.toString(output));
    }

    // solution 1
    // public static int[] twoSum(int[] nums, int target) {
    //     int[] index = new int[2];

    //     for(int i = 0; i < nums.length - 1; i++) {
    //         for(int j = i + 1; j < nums.length; j++) {
    //             if(nums[i] + nums[j] == target) {
    //                 index[0] = i;
    //                 index[1] = j;
    //             }
    //         }
    //     }
    //     return index;
    // }

    // solution 2
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(hm.containsKey(target - nums[i])) {
                return (new int[]{hm.get(target - nums[i]), i});
            } else {
                hm.put(nums[i], i);
            }
        }
        return (new int[] {0, 0});
    }

}
