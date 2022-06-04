package Searching;

public class ThreeSumSorted {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 8, 9, 20, 40};
        int sum = 1000;
        System.out.println(findThreeSum(arr, sum));
    }

    public static boolean findTwoSum(int[] arr, int start, int sum) {
        int end = arr.length - 1;

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

    public static boolean findThreeSum(int[] arr, int sum) {
        boolean res = false;
        for(int i = 0; i < arr.length - 2; i++) {
            res = findTwoSum(arr, i + 1, sum - arr[i]);
            if(res) {
                return true;
            }
        }
        return res;
    }
}
