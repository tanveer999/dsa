import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
    int[] nums = {2,7,11,15};
    int target = 9;
    System.out.println(Arrays.toString(solve(nums, target)));
    }

    static int[] solve(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i = 0;i<nums.length;i++) {
            if(hm.containsKey(target - nums[i])) {
                return new int[]{hm.get(target - nums[i]), i};
            } else {
                hm.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
