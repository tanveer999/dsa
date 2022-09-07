package Practice;

import java.util.Arrays;

public class Create2dArray {
    public static void main(String[] args) {
        int[] a = {1 ,2 ,4 ,5};
        int[] b = {3 , 2,  2, 1};

        int[][] out = new int[2][a.length];

        out[0] = solve(a);
        out[1] = solve(b);

        for(int i = 0; i < 2; i++) {
            System.out.println(Arrays.toString(out[i]));
        }
    }

    static int[] solve(int[] a) {
        return a;
    }
}
