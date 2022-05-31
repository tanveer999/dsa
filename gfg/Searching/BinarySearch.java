package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7, 8, 9};
        int element = 9;
        System.out.println(binarySearch(arr, arr.length, element));
        System.out.println(binarySearchRecursive(arr, arr.length, 0, arr.length - 1, element));
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

    public static int binarySearchRecursive(int[] arr, int n, int start, int end, int element) {
        if (start > end) {
            return -1;
        }

        int mid = (start + end) / 2;
        if(arr[mid] == element) {
            return mid;
        } else if(element < arr[mid]) {
            return binarySearchRecursive(arr, n, start, mid - 1, element);
        } else {
            return binarySearchRecursive(arr, n, mid + 1, end, element);
        }
    }

}
