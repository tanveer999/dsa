package Strings;

import java.util.Arrays;
import Strings.AnagramSearch;

public class Practice {
    public static void main(String[] args) {
        String str = "abcd";

        System.out.println(str.charAt(0)); // a
        System.out.println((int)str.charAt(0)); // 97
        System.out.println((int)'A'); // 65 (note: "A" gives erroe: string cannot be converted to int)
        System.out.println((char)255);

        System.out.println('a' * 2);
        System.out.println('a' * (int)Math.pow(5,2));

        System.out.println('A' + "b");

        int[] a1 = {0,0,0};
        int[] a2 = {0,0,0};
        int[] a3 = {1,0,0};
        double[] a4 = {1.0,0,0};
        System.out.println(Arrays.equals(a1,a2)); // true
        System.out.println(Arrays.equals(a1,a3)); // flase
        System.out.println(AnagramSearch.CHAR);
    }
}
