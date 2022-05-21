package Array;

public class LeadersInAnArray {
    public static void main(String[] args) {
        // int[] arr = {7, 10, 4, 3, 6, 5, 2};
        // int[] arr = {10, 20, 30};
        int[] arr = {30, 20, 10};
        int n = arr.length;
        printLeaders(arr, n);
    }

    public static void printLeaders(int[] arr, int n) {
        for(int i = 0; i < n; i++) {
            boolean flag = true;

            if(i == n - 1) {
                System.out.print(arr[n - 1]);
                System.out.println();
                break;
            }

            for(int j = i + 1; j < n; j++) {
                if(arr[j] > arr[i]) {
                    flag = false;
                }
            }

            if(flag) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
