package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 9, 0, 1};
        // int element = 9;
        int element = 20;
        System.out.println(linearSearch(arr, arr.length, element));
    }

    public static boolean linearSearch(int[] arr, int n, int element) {
        for(int i = 0; i < n; i++) {
            if(arr[i] == element) {
                return true;
            }
        }
        return false;
    }
}
