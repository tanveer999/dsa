import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i : nums) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        for(int i : hm.keySet()) {
            if (hm.get(i) > nums.length /2 ) {
                return i;
            }
        }
        return -1;
    }
}
