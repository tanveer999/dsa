package Array;

public class LeadersInAnArray {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 6, 5, 2};
        // int[] arr = {10, 20, 30};
        // int[] arr = {30, 20, 10};
        int n = arr.length;
        // printLeaders1(arr, n);
        printLeaders2(arr, n);
    }

    public static void printLeaders1(int[] arr, int n) {
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

    public static void printLeaders2(int[] arr, int n) {
        int[] temp = new int[n];
        int count = 0;
        int max = arr[n - 1];
        temp[count++] = max;
        for(int i = n - 2; i >= 0; i--) {
            if(arr[i] > max) {
                temp[count++] = arr[i];
                max = arr[i];
            }
        }
        for(int i = count - 1; i >= 0; i--) {
            System.out.print(temp[i] + " ");
        }
        System.out.println();
    }
}
