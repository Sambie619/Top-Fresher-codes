package arraysadvanced;

// Best Time to Buy and Sell Stock - Single Transaction
// Find maximum profit by buying once and selling once later

public class StockProfitCalculator {

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit = " + maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {

        // EDGE CASE: Need at least 2 days for transaction
        if (prices == null || prices.length < 2) return 0;

        // TIME: O(n) single pass, SPACE: O(1) constant extra space
        int minPrice = prices[0]; // Track cheapest buy price seen so far
        int maxProfit = 0;        // Track maximum profit possible so far

        // Scan prices from day 1 onwards
        for (int i = 1; i < prices.length; i++) {

            // Update minimum buy price if cheaper day found
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            // Calculate profit if we sell today (buy at minPrice, sell at prices[i])
            int profitToday = prices[i] - minPrice;

            // Update maximum profit if today's profit is better
            if (profitToday > maxProfit) {
                maxProfit = profitToday;
            }
        }

        return maxProfit;
    }
}

