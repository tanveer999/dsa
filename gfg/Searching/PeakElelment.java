package Searching;

public class PeakElelment {
    public static void main(String[] args) {
        // int[] arr = {5, 10, 20, 15, 7};
        // int[] arr = {10, 20, 15, 5, 23, 90, 67};
        int[] arr = {80, 70, 60};
        printPeakElements(arr);
    }

    public static void printPeakElements(int[] arr) {
        int n = arr.length;

        if(arr[0] > arr[1]) {
            System.out.println(arr[0]);
        }
        if(arr[n - 1] > arr[n - 2]) {
            System.out.println(arr[n - 1]);
        }

        for(int i = 1; i < n - 1; i++) {
            if(arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.println(arr[i]);
            }
        }
    }
}
