package Array;

public class MaximumCircularSubArraySum {
    public static void main(String[] args) {
        // int arr[] = {10, 5, -5};
        // int arr[] = {5, -2, 3, 4};
        // int[] arr = {2, 3, -4};
        int[] arr = {8, -4, 3, -5, 4};
        // int[] arr = {-3, 4, 6, -2};
        // int[] arr = {-8, 7, 6};
        // int[] arr = {3, -4, 5, 6, -8, 7};
        System.out.println(maxCircularSubArraySum1(arr, arr.length));
        System.out.println(maxCircularSubArraySum2(arr, arr.length));
    }

    // solution 1

    public static int maxSubArraySum1(int[] arr, int n) {
        int max = arr[0], res = arr[0];
        for(int i = 1; i < n; i++) {
            max = Math.max(max + arr[i], arr[i]);
            res = Math.max(res, max);
        }
        return res;
    }

    public static void leftRotate(int[] arr, int n ) {
        int temp = arr[0];
        for(int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
    }

    public static int maxCircularSubArraySum1(int[] arr, int n) {
        int res = maxSubArraySum1(arr, n);
        for(int i = 0; i < n - 1; i++) {
            leftRotate(arr, n);
            res = Math.max(res, maxSubArraySum1(arr, n));
        }
        return res;
    }

    //solution 2

    public static int maxCircularSubArraySum2(int[] arr, int n) {
        int res = arr[0];
        for(int i = 0; i < n; i++) {
            int max = arr[i], curr_max = arr[i];

            for(int j = 1; j < n; j++) {
                int index = (i + j) % n;

                max = Math.max(max + arr[index], arr[index]);
                curr_max = Math.max(max, curr_max);
            }
            res = Math.max(curr_max, res);
        }
        return res;
    }
}
