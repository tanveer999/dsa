package Queue;

public class MaximumsOfSubarrayOfSizeK {
    public static void main(String[] args) {
        int arr[] = {10, 8, 5, 12, 15, 7, 6};
        int k =3;
        solveNaive(arr, k);
    }

    static void solveNaive(int[] arr, int k) {
        for(int i = 0; i <= arr.length - k; i++) {
            int max = arr[i];
            for(int j = i+1; j < i + k; j++) {
                max = Math.max(max, arr[j]);
            }
            System.out.print(max + " ");
        }
    }
}
