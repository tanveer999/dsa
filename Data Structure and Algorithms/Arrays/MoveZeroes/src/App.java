import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] a = {0, 1, 0, 3, 12};
        moveZeroes(a);
    }

    public static void moveZeroes(int[] nums) {
        int x = 0;
        int temp = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                temp = nums[i];
                nums[i] = nums[x];
                nums[x] = temp;
                x++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
