package Array;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        // int arr[] = {0, 1, 1, 0, 1, 0};
        // int arr[] = {1, 1, 1, 1};
        // int[] arr = {0, 0, 0};
        int[] arr = {1, 0, 1, 1, 1, 1, 0, 1, 1};

        System.out.println("Count of consecutive one's is: " + countOnes(arr));
    }

    public static int countOnes(int[] arr) {
        int max = 0, count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        if(count > 0) {
            max = Math.max(max, count);
        }
        return max;
    }
}
