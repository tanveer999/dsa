package DynamicProgramming;

public class UnboundedKnapsack {
    public static void main(String[] args) {
        int[] arr = {1, 2, 7};
        int sum = 5;
        System.out.println(solve(arr, arr.length, sum));
    }

    static boolean solve(int[] arr, int n, int sum) {

        if(sum == 0) return true;
        if(n == 0) return false;

        if(arr[n - 1] > sum) {
            return solve(arr, n - 1, sum);
        } else {
            return solve(arr, n - 1, sum) || solve(arr, n, sum - arr[n - 1]);
        }
    }
}
