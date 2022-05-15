import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 7 };
        int target = 7;
        System.out.println(binarySearch(arr, target));
    }

    static int binarySearch(int[] arr, int target) {
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
