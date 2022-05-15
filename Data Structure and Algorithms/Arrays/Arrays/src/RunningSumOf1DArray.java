import java.util.Arrays;
public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1};
        nums = runningSum(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static int[] runningSum(int[] nums) {
        for(int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }

        return nums;
    }
}
