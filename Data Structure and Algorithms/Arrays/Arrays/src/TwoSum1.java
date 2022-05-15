import java.util.Arrays;
import java.util.HashMap;

public class TwoSum1 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] output = twoSum(nums, 9);

        System.out.println(Arrays.toString(output));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] output = new int[2];
        for(int i = 0; i < nums.length; i++) {
            if(hm.containsKey(target - nums[i])) {
                output[0] = hm.get(target - nums[i]);
                output[1] = i;
            } else {
                hm.put(nums[i], i);
            }
            
        }
        return output;
    }
}
