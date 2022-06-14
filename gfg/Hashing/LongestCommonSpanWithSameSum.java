package Hashing;

public class LongestCommonSpanWithSameSum {
    public static void main(String[] args) {
        // int[] arr1 = {0,1,0,0,0,0};
        // int[] arr2 = {1,0,1,0,0,1};

        int[] arr1 = {0,1,0,1,1,1,1};
        int[] arr2 = {1,1,1,1,1,0,1};

        // int[] arr1 = {0,0,0};
        // int[] arr2 = {1,1,1};
        System.out.println(findCount(arr1, arr2));
    }
    
    // arr1.length == arr2.length
    static int findCount(int[] arr1, int[] arr2) {
        int arr1Sum, arr2Sum, max = 0;

        for(int i = 0; i < arr1.length; i++) {
            arr1Sum = arr2Sum = 0;
            for(int j = i;j < arr2.length; j++) {
                arr1Sum += arr1[j];
                arr2Sum += arr2[j];

                if(arr1Sum == arr2Sum) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        return max;
    }
}
