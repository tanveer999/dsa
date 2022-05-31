package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7, 8, 9};
        int element = 20;
        System.out.println(binarySearch(arr, arr.length, element));
    }

    public static int binarySearch(int[] arr, int n, int element) {
        int start = 0, end = n - 1, mid;

        while(start <= end) {
            mid = (start + end) / 2;

            if(arr[mid] == element) {
                return mid;
            } else if (element < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }


}
