package CollectionsJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws IOException{
        // System.out.println(solve());

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int[] arr = new int[input.length];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        System.out.println(Arrays.toString(arr));
    }

    static int solve() {
        try{
            int a = 10 /0;
            return 1;
        } catch(Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }
}
