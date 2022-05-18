package Array;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 5};
        // int[] arr = {1, 2, 3, 4};
        // int[] arr = {1};
        int[] arr = {};
        System.out.println("Original array: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Reversed array: ");
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1, temp;

        while(start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
