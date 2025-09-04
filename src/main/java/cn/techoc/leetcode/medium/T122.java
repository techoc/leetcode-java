package cn.techoc.leetcode.medium;

public class T122 {
    /**
     * <a href="https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-ii">122. 买卖股票的最佳时机 II</a>
     *
     * @param prices 整数数组
     * @return 最大利润
     */
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > minPrice) {
                maxProfit += prices[i] - minPrice;
                minPrice = prices[i];
            } else {
                minPrice = prices[i];
            }
        }
        return maxProfit;
    }
}
