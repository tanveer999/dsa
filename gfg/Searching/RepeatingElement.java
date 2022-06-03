package Searching;

public class RepeatingElement {
    public static void main(String[] args) {
        // int[] arr = {0, 2, 1, 3, 2, 2};
        // int[] arr = {1, 2, 3, 0, 3, 4, 5};
        int[] arr = {0, 0};
        System.out.println(findRepeatingElement(arr));
    }
    // slow - fast algorithm
    public static int findRepeatingElement(int[] arr) {
        int slow = arr[0] + 1, fast = arr[0] + 1;

        do {
            slow = arr[slow] + 1;
            fast = arr[arr[fast] + 1] + 1 ;
        } while(slow != fast);

        slow = arr[0] + 1;
        while(slow != fast) {
            slow = arr[slow] + 1;
            fast = arr[fast] + 1;
        }
        return slow - 1;
    }
}
