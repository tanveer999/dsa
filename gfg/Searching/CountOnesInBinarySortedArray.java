package Searching;

public class CountOnesInBinarySortedArray {
    public static void main(String[] args) {
        // int[] arr = {0, 0, 0, 1, 1, 1, 1, 1};
        // int[] arr = {1, 1, 1, 1, 1};
        int[] arr = {0, 0, 0, 0, 0};
        int element = 1;
        System.out.println(findFirstOccurence(arr, element));
        System.out.println(findLastOccurence(arr, element));
        System.out.println(findCount(arr, element));
    }

    public static int findFirstOccurence(int[] arr, int element) {
        int start = 0, end = arr.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;

            if(arr[mid] == element) {
                if(mid - 1 >= 0 && arr[mid - 1] == element) {
                    end = mid - 1;
                } else
                return mid;
            } else if (element < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int findLastOccurence(int[] arr, int element) {
        int start = 0, end = arr.length - 1, mid;

        while(start <= end) {
            mid = (start + end) / 2;

            if(arr[mid] == element) {
                if(mid + 1 < arr.length && arr[mid + 1] == element) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            } else if(element < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int findCount(int[] arr, int element) {
        int firstIndex = findFirstOccurence(arr, element);

        if(firstIndex == -1) {
            return 0;
        }

        return (findLastOccurence(arr, element) - firstIndex + 1);
    }
}
