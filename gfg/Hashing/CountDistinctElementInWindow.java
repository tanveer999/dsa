package Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class CountDistinctElementInWindow {
    public static void main(String[] args) {
        int[] arr = {10,20,20,10,30,40,10};
        int k = 4;
        findCount1(arr, 4);
        findCount2(arr, 4);
    }
    static void findCount1(int[] arr, int k) {
        HashSet<Integer> hs = new HashSet<>();

        for(int i = 0 ; i < arr.length - k + 1; i++) {
            hs.clear();
            for(int j = i; j < i + k; j++) {
                hs.add(arr[j]);
            }
            System.out.print(hs.size() + " ");
        }
        System.out.println();
    }

    static void findCount2(int[] arr, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int max = 0;
        for(int i = 0; i < k; i++ ) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)  + 1);
        }
        System.out.print(hm.size() + " ");

        for(int i = k; i < arr.length; i++) {
            hm.put(arr[i - k], hm.get(arr[i - k]) - 1);
            if(hm.get(arr[i - k]) == 0) {
                hm.remove(arr[i - k]);
            }

            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
            System.out.print(hm.size() + " ");
        }
        System.out.println();
    }

}
