package Hashing;
import java.util.HashMap;
public class MoreThanNByKOccurence {
    public static void main(String[] args) {
        int[] arr = {30,10,20,20,10,20,30,30};
        int k = 4;
        findItem(arr, k);
    }

    static void findItem(int[] arr, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);

            if(hm.get(arr[i]) > arr.length / k) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
    
}
