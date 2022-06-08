package Sorting;

import java.util.Arrays;
import java.util.Random;

public class Practice {
    public static void main(String[] args) {
    //    Random rand = new Random();
       
    //    for(int i = 0; i<10; i++) {
    //        System.out.println(rand.nextInt(6, 10));
    //    }

    int[] arr = {5, 1, 3, 2, 9, 7};
    Arrays.sort(arr, 1, arr.length);
    System.out.println(Arrays.toString(arr));
    }
}
