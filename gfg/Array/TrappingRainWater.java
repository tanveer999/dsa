package Array;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {2, 0, 2};
        // int[] arr = {1, 2, 3};
        // int[] arr = {3, 2, 1};
        // int[] arr = {3, 0, 1, 2, 5};
        // int[] arr = {3, 0, 6, 2, 3};

        System.out.println("Water trapped is: " + trappingRainWater1(arr, arr.length));
        System.out.println("Water trapped is: " + trappingRainWater2(arr, arr.length));
    }

    // naive solution O(n^2)
    public static int trappingRainWater1(int[] arr, int n) {
        int sum = 0;
        int lmax, rmax;
        for(int i = 1; i < n - 1; i++) {
            lmax = arr[i];
            for(int j = 0; j < i; j++) {
                lmax = Math.max(lmax, arr[j]);
            }
            rmax = arr[i];
            for(int j = i; j < n; j++) {
                rmax = Math.max(rmax, arr[j]);
            }

            sum += Math.min(lmax, rmax) - arr[i];
        }
        return sum;
    }

    public static int trappingRainWater2(int[] arr, int n) {
        int sum = 0;
        int[] lmax = new int[n];
        int[] rmax = new int[n];
        
        lmax[0] = arr[0];
        for(int i = 1; i < n; i++) {
            lmax[i] = Math.max(lmax[i - 1], arr[i]);
        }

        rmax[n - 1] = arr[n - 1];

        for(int i = n - 2; i >= 0; i--) {
            rmax[i] = Math.max(rmax[i + 1], arr[i]);
        }

        for(int i = 0; i < n; i++) {
            sum += Math.min(lmax[i], rmax[i]) - arr[i];
        }
        return sum;
    }
}
