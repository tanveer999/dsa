package Hashing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;

public class FrequenciesOfArrayElements {
    public static void main(String[] args) {
        int[] arr = {10, 12, 10, 15, 10, 20, 12, 12};
        findFrequency2(arr);        
    }

    static void findFrequency(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();

        // for(int i : arr) {
        //     if(hm.containsKey(i)) {
        //         hm.put(i, hm.get(i) + 1);
        //     } else {
        //         hm.put(i, 1);
        //     }
        // }

        for(int i : arr) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        // System.out.println(hm);
    }

    static void findFrequency2(int[] arr) {
        LinkedHashMap<Integer,Integer> lhm = new LinkedHashMap<>();

        for(int i : arr) {
            lhm.put(i, lhm.getOrDefault(i, 0) + 1);
        }

        for(Map.Entry<Integer,Integer> m : lhm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
