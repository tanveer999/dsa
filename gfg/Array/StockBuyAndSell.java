package Array;

public class StockBuyAndSell {
    public static void main(String[] args) {
        // int[] arr = {1, 5, 3, 1, 2, 8};
        // int[] arr =  {1, 5, 3, 1, 2, 8, 1};
        int[] arr = {1, 5, 3, 8, 12}; 
        // int[] arr = {30, 20, 10};
        // int[] arr = {10, 20, 30};
        System.out.println(buyAndSell1(arr, arr.length));
        System.out.println(buyAndSell2(arr, arr.length));
        System.out.println(buyAndSell3(arr, arr.length));
    }

    public static int buyAndSell1(int[] arr, int n) {
        int sum = 0, max = 0, min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            // if(arr[i] < min) min = arr[i];
            min = Math.min(arr[i], min);

            for(int j = i + 1; j < n; j++) {
                if(arr[j] > max) max = arr[j];
                else {
                    sum += (max - min);
                    i = j - 1;
                    min = Integer.MAX_VALUE;
                    max = 0;
                    break;
                }
                if(arr[j] < min) {
                    max = 0;
                    break;
                }
            }
        }
        // if(max > 0) sum += (max - min);
        return sum;
    }

    // time complexity O(n)
    public static int buyAndSell2(int[] arr, int n) {
        int sum = 0, max = 0, min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            if(arr[i] < min && max == 0) {
                min = arr[i];
                continue;
            }
            if(arr[i] > max) max = arr[i];
            if (max != 0 && arr[i] < max) {
                sum += (max - min);
                max = 0;
                min = arr[i];
            }
        }
        if(max > 0) sum += (max - min);
        return sum;
    }

    public static int buyAndSell3(int[] arr, int n) {
        int sum = 0;
        for(int i = 1; i < n; i++) {
            if(arr[i] > arr[i - 1]) {
                sum += arr[i] - arr[i - 1];
            }
        }
        return sum;
    }
}
