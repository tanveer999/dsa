package Array;

public class FrequencyInSortedArray {
    public static void main(String[] args) {
        // int[] arr = {10, 10, 10, 25, 30, 30};
        // int[] arr = {10, 10, 10, 10};
        int[] arr = {10, 20, 30};
        elementFrequency(arr, arr.length);
    }

    public static void elementFrequency(int[] arr, int n) {
        int count = 1, temp = arr[0];

        for(int i = 1; i < n; i++) {
            if(arr[i] == temp) {
                count++;
            } else {
                System.out.println(temp + "   " + count);
                count = 1;
                temp = arr[i];
            }
        }
        System.out.println(temp + "   " + count); // count of last n same element / elements
    }
}
