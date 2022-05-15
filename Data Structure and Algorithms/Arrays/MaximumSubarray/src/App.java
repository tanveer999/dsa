public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        int[] nums = { -1, 0, -2};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        //solution 2

        int sum = 0;
        int max = nums[0];

        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if(sum > max) {
                max = sum;
            }

            if(sum < 0) {
                sum = 0;
            }
        }
        return max;

        // solution 1: timeout
        // int sum = nums[0];

        // for(int i = 0; i < nums.length-1; i++) {
        //     int temp = nums[i];
        //     if(temp > sum) sum = temp;
        //     for(int j = i + 1; j < nums.length; j++) {
        //         temp = temp + nums[j];

        //         if(temp > sum) {
        //             sum = temp;
        //         }
        //     }
        // }
        // if(nums[nums.length - 1] > sum) sum = nums[nums.length - 1];

        // return sum;

    }
}
