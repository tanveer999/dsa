package Searching;

public class LastOccurence {
    public static void main(String[] args) {
        // int arr[] = {5, 8, 8, 10, 10};
        int[] arr = {10, 15, 20, 20, 40, 40};
        int element = 20;
        System.out.println(findLastOccurence(arr, element));
    }

    public static int findLastOccurence(int[] arr, int element) {
        int start = 0, end = arr.length - 1, mid;

        while(start <= end) {
            mid = (start + end) / 2;

            if(arr[mid] == element) {
                if(mid + 1 <= arr.length - 1 && arr[mid + 1] == element) {
                    start = mid + 1;
                } else
                    return mid;
            } else if(element < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
