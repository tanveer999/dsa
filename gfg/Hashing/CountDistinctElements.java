package Hashing;

import java.util.HashSet;

public class CountDistinctElements {
    public static void main(String[] args) {
        int[] arr = {15, 12, 13, 12, 13, 13, 18};
        System.out.println(findCount(arr));
    }   
    
    static int findCount(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();

        for(int element : arr ){
            hs.add(element);
        }

        return hs.size();
    }
}
