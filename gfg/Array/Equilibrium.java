package Array;

public class Equilibrium {
    public static void main(String[] args) {
        int[] arr = {3, 4, 8, -9, 20, 6};
        System.out.println(findEquilibrium(arr, arr.length));
    }

    public static boolean findEquilibrium(int[] arr, int n) {
        int lsum = 0, rsum = 0;

        for(int i = 0; i < n; i++) {
            rsum += arr[i];
        }

        for(int i = 0; i < n; i++) {
            if(rsum - arr[i] == lsum)
                return true;
            
            rsum -= arr[i];
            lsum += arr[i];
        }
        return false;
    }
}
