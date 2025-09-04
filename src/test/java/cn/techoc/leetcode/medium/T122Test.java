package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * T122 类的单元测试
 * 测试 maxProfit 方法在不同场景下的正确性
 */
class T122Test {

    private final T122 t122 = new T122();

    /**
     * 测试正常上涨序列 [1,2,3,4,5]
     * 预期利润: 4
     */
    @Test
    void testMaxProfitWithRisingPrices() {
        int[] prices = {1, 2, 3, 4, 5};
        int expected = 4;
        int actual = t122.maxProfit(prices);
        assertEquals(expected, actual, "连续上涨序列应获得总利润");
    }

    /**
     * 测试正常波动序列 [7,1,5,3,6,4]
     * 预期利润: 7
     */
    @Test
    void testMaxProfitWithFluctuatingPrices() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int expected = 7;
        int actual = t122.maxProfit(prices);
        assertEquals(expected, actual, "波动序列应获得最优利润");
    }

    /**
     * 测试持续下跌序列 [7,6,4,3,1]
     * 预期利润: 0
     */
    @Test
    void testMaxProfitWithFallingPrices() {
        int[] prices = {7, 6, 4, 3, 1};
        int expected = 0;
        int actual = t122.maxProfit(prices);
        assertEquals(expected, actual, "持续下跌序列不应获得利润");
    }

    /**
     * 测试单日价格 [1]
     * 预期利润: 0
     */
    @Test
    void testMaxProfitWithSingleDay() {
        int[] prices = {1};
        int expected = 0;
        int actual = t122.maxProfit(prices);
        assertEquals(expected, actual, "单日价格不应获得利润");
    }

    /**
     * 测试价格全部相同 [3,3,3,3,3]
     * 预期利润: 0
     */
    @Test
    void testMaxProfitWithSamePrices() {
        int[] prices = {3, 3, 3, 3, 3};
        int expected = 0;
        int actual = t122.maxProfit(prices);
        assertEquals(expected, actual, "相同价格序列不应获得利润");
    }
}
