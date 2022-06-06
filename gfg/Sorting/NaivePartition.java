package Sorting;

public class NaivePartition {
    public static void main(String[] args) {
        int[] arr = {3, 8, 6, 12, 10, 7};
        int pivot = 5;
        System.out.println(partition(arr, pivot));
    }

    public static int partition(int[] arr, int pivot) {
        int[] temp = new int[arr.length];

        int start = 0, end = arr.length - 1;

        for(int i = 0; i < arr.length; i++) {
            if(i == pivot) continue;

            if(arr[i] < arr[pivot]) {
                temp[start++] = arr[i];
            } else {
                temp[end--] = arr[i];
            }
            if(start == end) {
                temp[start] = arr[pivot];
            }
        }
        return start;
    }
}
