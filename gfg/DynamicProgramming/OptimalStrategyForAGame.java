package DynamicProgramming;

import java.util.Arrays;

public class OptimalStrategyForAGame {
    public static void main(String[] args) {
        int[] arr = {20, 5, 4, 6};
        System.out.println(findOptimal(arr));
    }

    static int findOptimal(int[] arr) {
        int sum = 0;

        for(int i : arr){
            sum += i;
        }

        return solve(arr, 0, arr.length - 1, sum);
    }

    static int solve(int[] arr,int m,int n,int sum) {

        if(m + 1 == n) {
            return Math.max(arr[m], arr[n]);
        } else {
            return Math.max(sum - solve(arr, m + 1, n, sum - arr[m]),
                            sum - solve(arr, m, n - 1, sum - arr[n]));
        }
    }
}
