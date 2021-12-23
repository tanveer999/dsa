import java.util.HashMap;
public class App {
    public static void main(String[] args) throws Exception {
        int[] a = {1, 2, 3, 4};

        System.out.println(containDuplicate(a));
    }

    public static boolean containDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i : nums) {
            if(hm.containsKey(i)) {
                return true;
            }

            hm.put(i, i);
            // System.out.println(hm);
        }
        
        return false;
    }
}
