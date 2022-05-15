import java.util.Arrays;
public class SquaresOfASortedArray {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        nums = sortedSquares(nums);

        System.out.println(Arrays.toString(nums));
    }

    public static int[] sortedSquares(int[] nums) {
        for(int i = 0 ; i < nums.length; i++) {
            nums[i] *= nums[i];
        }

        Arrays.sort(nums);

        return nums;
    }

}
