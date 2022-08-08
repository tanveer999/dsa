package DynamicProgramming;


public class EqualSumPartition {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 4};

        int sum = 0;
        for(int i : arr) {
            sum += i;
        }

        System.out.println(solve(arr));
    }

    static boolean solve(int[] arr) {
        int sum = 0;

        for(int i : arr) {
            sum += i;
        }

        if(sum % 2 != 0) {
            return false;
        } else {
            return subsetSum(arr, sum / 2);
        }
    }

    static boolean subsetSum(int[] arr, int sum) {
        return true;
    }


}
