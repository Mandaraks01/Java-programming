Class solution{
public static int maxProfit(int[] prices) {
    int minPrice = prices[0];
    int bestProfit = 0;
    for (int i = 1; i < prices.length; i++) {
        if (prices[i] < minPrice) {
            minPrice = prices[i];             // cheaper day to buy
        } else if (prices[i] - minPrice > bestProfit) {
            bestProfit = prices[i] - minPrice;
        }
    }
    return bestProfit;
}
}
