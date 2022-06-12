package Hashing;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        Integer[] arr1 = {10, 15,20,5,30};
        int[] arr2 = {30,5,30,80};

        // Integer[] arr1  = {10,20};
        // int[] arr2 = {20, 30};

        // Integer[] arr1 = {10,10,10};
        // int[] arr2 = {10,10,10};
        System.out.println(findIntersectionCount(arr1, arr2));
        System.out.println(findCount2(arr1, arr2));
    }

    static int findIntersectionCount(Integer[] arr1, int[] arr2) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();

        // HashSet<Integer> hs3 = new HashSet<>(Arrays.asList(arr1));
        int count = 0;

        for(int i : arr1) {
            hs1.add(i);
        }

        for(int i : arr2) {
            hs2.add(i);
        }

        for(Integer i : hs1) {
            if(hs2.contains(i)) {
                count++;
            }
        }
        return count;
    }

    static int findCount2(Integer[] arr1, int[] arr2) {
        HashSet<Integer> hs = new HashSet<>();
        int count = 0;
        for(int i : arr1) {
            hs.add(i);
        }

        for(int i : arr2) {
            if(hs.contains(i)) {
                count++;
                hs.remove(i);
            }
        }

        return count;
    }
}
