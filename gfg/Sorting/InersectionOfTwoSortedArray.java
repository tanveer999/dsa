package Sorting;

public class InersectionOfTwoSortedArray {
    public static void main(String[] args) {
        // int[] arr1 = {1,1,3,3,3};
        // int[] arr2 = {1,1,1,1,3,5,7};

        int[] arr1 = {3, 5, 10, 10, 10, 15, 15};
        int[] arr2 = {5, 10, 10, 15, 30};

        printIntersectionElements(arr1,arr2);
    }

    public static void printIntersectionElements(int[] arr1, int[] arr2) {
        int m = arr1.length, n = arr2.length;
        int i = 0, j = 0;
        int count = 0;
        while(i < m && j < n) {
            
            if(arr1[i] == arr2[j]) {
                count++;
                if(count == 1)
                    System.out.print(arr1[i] + " ");
            }
            if(arr1[i] != arr2[j])
                count = 0;
            if(arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
    }


}
