package Array;

public class TrappingRainWater {
    public static void main(String[] args) {
        // int[] arr = {2, 0, 2};
        // int[] arr = {1, 2, 3};
        // int[] arr = {3, 2, 1};
        int[] arr = {3, 0, 1, 2, 5};

        System.out.println("Water trapped is: " + trappingRainWater(arr, arr.length));
    }

    // naive solution O(n^2)
    public static int trappingRainWater(int[] arr, int n) {
        int sum = 0;
        int lmax = 0, rmax = 0;

        for(int i = 1; i < n - 1; i++) {

            for(int j = 0; j < i; j++) {
                lmax = Math.max(lmax, arr[j]);
            }

            for(int j = i; j < n; j++) {
                rmax = Math.max(rmax, arr[j]);
            }

            sum += Math.min(lmax, rmax) - arr[i];
        }
        return sum;
    }
}
