package Searching;

public class TwoSumSorted {
    public static void main(String[] args) {
        int[] arr = {3, 5, 9, 2, 8, 10, 11};
        int sum = 35;

        System.out.println(findTwoSum(arr, sum));
    }

    public static boolean findTwoSum(int[] arr, int sum) {
        int start = 0, end = arr.length - 1;

        while(start < end) {
            int tempSum = arr[start] + arr[end];

            if(tempSum == sum) {
                return true;
            }
            if(tempSum < sum) {
                start++;
            } else {
                end--;
            }
        }

        return false;
    }
}
