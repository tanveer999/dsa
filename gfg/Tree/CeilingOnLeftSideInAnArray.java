package Tree;

import java.util.TreeSet;

public class CeilingOnLeftSideInAnArray {
    public static void main(String[] args) {
        int[] arr = {2, 8, 30, 15, 25, 12};
        findCeiling(arr);
    }

    static void findCeiling(int[] arr) {
        TreeSet<Integer> ts = new TreeSet<>();

        for(int i = 0; i < arr.length; ++i) {
            Integer ceiling = ts.ceiling(arr[i]);
            if(ceiling == null)
                System.out.print(-1 + " ");
            else 
                System.out.print(ceiling + " ");
            
            ts.add(arr[i]);
        }
    }
}
