package Array;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a1 = {1, 3, 4, 6};
        int[] a2 = {2, 5, 7, 8, 9, 10};
        mergeArrays(a1, a2);
    }

    public static void mergeArrays(int[] a1, int[] a2) {
        int m = a1.length, n = a2.length;
        int[] arr = new int[m + n];

        int i = 0, j = 0, k = 0;

        while(i < m || j < n) {
            if(i != m && j != n) {
                if(a1[i] < a2[j]) {
                    arr[k++] = a1[i++];
                } else {
                    arr[k++] = a2[j++];
                }
            } else if(i == m && j < n) {
                arr[k++] = a2[j++];
            } else if(j == n && i < m) {
                arr[k++] = a1[i++];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
