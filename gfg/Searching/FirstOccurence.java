package Searching;

public class FirstOccurence {
    public static void main(String[] args) {
        int[] arr = {1, 10, 10, 10, 20, 20, 40};
        // int[] arr = {1, 1, 1};
        int element = 20;
        System.out.println(firstOccurence1(arr, element));
        System.out.println(firstOccurence2(arr, element));
        System.out.println(firstOccurence3(arr, 0, arr.length - 1, element));
    }

    public static int firstOccurence1(int[] arr, int element) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static int firstOccurence2(int[] arr, int element) {
        int start = 0, end = arr.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;

            if(arr[mid] == element) {
                if(mid - 1 >= 0 && arr[mid - 1] == element) {
                    end = mid - 1;
                    start = 0;
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

    public static int firstOccurence3(int[] arr, int start, int end, int element) {
        if(start > end) {
            return -1;
        }

        int mid = (start + end) / 2;

        if(arr[mid] == element) {
            if(mid - 1 >= 0 && arr[mid - 1] == element) {
                return firstOccurence3(arr, 0, mid - 1, element);
            }
            return mid;
        } else if(element < arr[mid]) {
            return firstOccurence3(arr, start, mid - 1, element);
        } else {
            return firstOccurence3(arr, mid + 1, end, element);
        }
    }
}
