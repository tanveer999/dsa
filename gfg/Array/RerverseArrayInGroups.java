package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RerverseArrayInGroups {
    public static void main(String[] args) {
        Integer a[] = {1,2,3};
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(a));
        // reverse(arr, 0, arr.size() - 1);
        int k = 4;
        reverseGroup(arr, k);
        System.out.println(arr);
    }

    static void reverseGroup(ArrayList<Integer> arr, int k) {
        int begin = 0;
        int i,j;
        while(begin < arr.size()) {
            i = begin;
            if(begin + k - 1  >= arr.size() ) {
                j = arr.size() - 1;
            } else {
                j = begin + k - 1;
            }

            reverse(arr, i, j);

            begin = begin + k;
        }
    }

    static void reverse(ArrayList<Integer> arr, int i, int j) {
        while(i < j) {
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);

            i++;
            j--;
        }
    }
}
