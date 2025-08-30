package cn.techoc.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * T121类的单元测试
 * 测试maxProfit方法在不同场景下的正确性
 */
class T121Test {

    private final T121 t121 = new T121();

    /**
     * 测试正常情况：价格有涨有跌，存在最大利润
     * 输入：[7,1,5,3,6,4]
     * 期望输出：5 (在价格为1时买入，在价格为6时卖出)
     */
    @Test
    void testMaxProfitWithNormalCase() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int expected = 5;
        int actual = t121.maxProfit(prices);
        assertEquals(expected, actual);
    }

    /**
     * 测试价格持续上涨的情况
     * 输入：[1,2,3,4,5]
     * 期望输出：4 (在价格为1时买入，在价格为5时卖出)
     */
    @Test
    void testMaxProfitWithIncreasingPrices() {
        int[] prices = {1, 2, 3, 4, 5};
        int expected = 4;
        int actual = t121.maxProfit(prices);
        assertEquals(expected, actual);
    }

    /**
     * 测试价格持续下跌的情况
     * 输入：[7,6,4,3,1]
     * 期望输出：0 (无法获利，不进行交易)
     */
    @Test
    void testMaxProfitWithDecreasingPrices() {
        int[] prices = {7, 6, 4, 3, 1};
        int expected = 0;
        int actual = t121.maxProfit(prices);
        assertEquals(expected, actual);
    }

    /**
     * 测试所有价格相同的情况
     * 输入：[3,3,3,3,3]
     * 期望输出：0 (无法获利，不进行交易)
     */
    @Test
    void testMaxProfitWithSamePrices() {
        int[] prices = {3, 3, 3, 3, 3};
        int expected = 0;
        int actual = t121.maxProfit(prices);
        assertEquals(expected, actual);
    }

    /**
     * 测试只有两个元素的数组
     * 输入：[1,2]
     * 期望输出：1 (在价格为1时买入，在价格为2时卖出)
     */
    @Test
    void testMaxProfitWithTwoElements() {
        int[] prices = {1, 2};
        int expected = 1;
        int actual = t121.maxProfit(prices);
        assertEquals(expected, actual);
    }

    /**
     * 测试只有一个元素的数组
     * 输入：[5]
     * 期望输出：0 (无法完成交易)
     */
    @Test
    void testMaxProfitWithOneElement() {
        int[] prices = {5};
        int expected = 0;
        int actual = t121.maxProfit(prices);
        assertEquals(expected, actual);
    }

    /**
     * 测试空数组的情况
     * 输入：[]
     * 期望输出：0 (无法完成交易)
     */
    @Test
    void testMaxProfitWithEmptyArray() {
        int[] prices = {};
        // 由于原函数没有处理空数组的情况，这里会抛出ArrayIndexOutOfBoundsException
        // 实际应用中应该添加边界检查，但根据题目描述，输入总是非空数组
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            t121.maxProfit(prices);
        });
    }
}
