//Maximum profit by buying and selling a share atmost twice

class Main {
    public static int maxProfit(int[] prices){
        int n = prices.length;
        if (n < 2) return 0;
        
        int[] profit1 = new int[n];
        int[] profit2 = new int[n];
        
        int minPrice = prices[0];
        for (int i = 1; i < n; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            profit1[i] = Math.max(profit1[i - 1], prices[i] - minPrice);
        }

        int maxPrice = prices[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxPrice = Math.max(maxPrice, prices[i]);
            profit2[i] = Math.max(profit2[i + 1], maxPrice - prices[i]);
        }

        // Combine profits of both transactions
        int maxTotalProfit = 0;
        for (int i = 0; i < n; i++) {
            maxTotalProfit = Math.max(maxTotalProfit, profit1[i] + profit2[i]);
        }

        return maxTotalProfit;
    }
    
    public static void main(String[] args) {
        int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};  // Example
        System.out.println("Max profit (at most two transactions): " + maxProfit(prices));
    }
}
