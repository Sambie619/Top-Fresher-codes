package arraysadvanced;

// Best Time to Buy and Sell Stock - At Most 2 Transactions
// Maximize profit with maximum 2 buy/sell transactions

public class MaxTwoTransactionsStock {

    public static void main(String[] args) {

        int[] prices = {3,3,5,0,0,3,1,4};
        System.out.println("Max Profit = " + maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {

        // EDGE CASE: Need at least 2 days
        if (prices == null || prices.length < 2) return 0;

        // TIME: O(n) single pass, SPACE: O(1) constant variables
        // 4 variables track states of 2 transactions:
        // buy1: cost of first buy opportunity
        // profit1: profit from first complete transaction (sell1 - buy1)
        // buy2: cost of second buy = actual price - profit1 (effective cost after first profit)
        // profit2: total profit from both transactions
        int buy1 = Integer.MAX_VALUE;  // First buy price (minimize)
        int buy2 = Integer.MAX_VALUE;  // Second buy effective price (minimize)  
        int profit1 = 0;               // Profit from first transaction
        int profit2 = 0;               // Total profit from both transactions

        for (int price : prices) {

            // Update first buy opportunity (cheapest price seen)
            buy1 = Math.min(buy1, price);

            // Update first transaction profit (if sell today)
            profit1 = Math.max(profit1, price - buy1);

            // Update second buy opportunity (effective cost = price - first_profit)
            // We subtract profit1 because we can use first transaction's profit to buy cheaper
            buy2 = Math.min(buy2, price - profit1);

            // Update total profit from second transaction (if sell today)
            profit2 = Math.max(profit2, price - buy2);
        }

        return profit2;  // Maximum profit with at most 2 transactions
    }
}

