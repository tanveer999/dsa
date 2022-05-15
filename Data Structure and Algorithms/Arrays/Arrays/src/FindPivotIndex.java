public class FindPivotIndex {

    public static void main(String[] args) {
        int[] nums =  {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }
    public static int pivotIndex(int[] nums) {
        if(nums.length < 1) {
            return -1;
        }
    
        int lsum = 0, rsum = 0;
    
        for(int i : nums) {
            lsum += i;
        }
    
        for(int i = 0; i < nums.length; i++) {
            lsum -= nums[i];
            if (lsum == rsum) {
                return i;
            } else {
                rsum += nums[i];
            }
        }
        return -1;
    
    }
}


