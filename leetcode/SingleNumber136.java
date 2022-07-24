import java.util.HashMap;
import java.util.Map;

public class SingleNumber136 {
    public static void main(String[] args) {
        
    }

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();

        for(int i : nums) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        for(int i : hm.keySet()) {
            if(hm.get(i) == 1) {
                return i;
            }
        }
        return -1;
    }
}
