public class App {
    public static void main(String[] args) throws Exception {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Max profit: " + new App().maxProfit(prices));
        System.out.println("testing internal debug terminal");
    }

    // solution 1: timeout error
    // public int maxProfit(int[] prices) {
    //     int maxProfit = 0;
    //     for(int i = 0; i < prices.length - 1; i++) {
    //         for(int j = 0; j < prices.length; j++) {
    //             if(i > j) {
    //                 continue;
    //             }
    //             if(prices[j] - prices[i] > maxProfit) {
    //                 maxProfit = prices[j] - prices[i];
    //             }
    //         }
    //     }
    //     return maxProfit;
    // }

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int costPrice = prices[0];

        for(int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(prices[i] - costPrice, maxProfit);
            if(prices[i] < costPrice) {
                costPrice = prices[i];
            }
        }
        return maxProfit;
    }
}
