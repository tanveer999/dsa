package Array;

public class StockBuyAndSell {
    public static void main(String[] args) {
        // int[] arr = {1, 5, 3, 1, 2, 8};
        // int[] arr =  {1, 5, 3, 1, 2, 8, 1};
        int[] arr = {1, 5, 3, 8, 12}; 
        // int[] arr = {30, 20, 10};
        // int[] arr = {10, 20, 30};
        System.out.println(buyAndSell(arr, arr.length));
    }

    public static int buyAndSell(int[] arr, int n) {
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
}
