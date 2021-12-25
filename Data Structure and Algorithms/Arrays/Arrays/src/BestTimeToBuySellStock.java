public class BestTimeToBuySellStock {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int cp = prices[0];
        int max_profit = 0;

        for(int i = 1; i < prices.length; i++) {
            int profit = prices[i] - cp;
            if( profit > max_profit ) {
                max_profit = profit;
            }

            if( prices[i] < cp) {
                cp = prices[i];
            }
        }

        return max_profit;
    }
}
