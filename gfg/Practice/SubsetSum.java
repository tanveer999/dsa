package Practice;

public class SubsetSum {
    public static void main(String[] args) {
        int[] arr = {1, -1, 0};
        int sum = 0;
        System.out.println(solve(arr, sum, arr.length));
    }   

    static int solve(int[] arr, int sum, int n) {
        if(sum == 0) return 1;
        if(n == 0) return 0;

        if(arr[n - 1] > sum) {
            return solve(arr, sum, n - 1);
        } else {
            return solve(arr, sum, n - 1) + solve(arr, sum - arr[n - 1], n - 1);
        }
    }
}
