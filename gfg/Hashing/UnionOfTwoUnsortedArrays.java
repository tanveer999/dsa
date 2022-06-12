package Hashing;

import java.util.HashSet;

public class UnionOfTwoUnsortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {15,20,5,15};
        int[] arr2 = {15,15,15,20,10};

        System.out.println(findCount(arr1, arr2));
    }

    static int findCount(int[] arr1, int[] arr2) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i : arr1) {
            hs.add(i);
        }

        for(int i : arr2) {
            hs.add(i);
        }

        return hs.size();
    }
}
