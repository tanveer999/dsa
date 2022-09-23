public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6, 10, 30};
        int target = 11;
        System.out.println(searchInsert(nums, target));
    }

    static public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int mid = -1;
        while(low <= high) {
            mid = low + ((high - low) / 2);

            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if(target < nums[mid]) {
            return mid;
        } else {
            return mid + 1;
        }
    }
}
