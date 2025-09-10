package cn.techoc.leetcode.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * T135 类的单元测试
 * 测试 candy 方法的正确性
 */
class T135Test {

    private final T135 t135 = new T135();

    /**
     * 测试空数组情况
     */
    @Test
    void testCandyWithEmptyArray() {
        int[] ratings = {};
        int result = t135.candy(ratings);
        assertEquals(0, result, "空数组应返回0");
    }

    /**
     * 测试单个元素数组
     */
    @Test
    void testCandyWithSingleElement() {
        int[] ratings = {1};
        int result = t135.candy(ratings);
        assertEquals(1, result, "单个元素应返回1");
    }

    /**
     * 测试评分单调递增情况
     * 示例: [1, 2, 3] -> 糖果分配: [1, 2, 3] -> 总和: 6
     */
    @Test
    void testCandyWithIncreasingRatings() {
        int[] ratings = {1, 2, 3};
        int result = t135.candy(ratings);
        assertEquals(6, result, "递增评分应返回6");
    }

    /**
     * 测试评分单调递减情况
     * 示例: [3, 2, 1] -> 糖果分配: [3, 2, 1] -> 总和: 6
     */
    @Test
    void testCandyWithDecreasingRatings() {
        int[] ratings = {3, 2, 1};
        int result = t135.candy(ratings);
        assertEquals(6, result, "递减评分应返回6");
    }

    /**
     * 测试评分先增后减情况
     * 示例: [1, 2, 3, 2, 1] -> 糖果分配: [1, 2, 3, 2, 1] -> 总和: 9
     */
    @Test
    void testCandyWithIncreaseThenDecrease() {
        int[] ratings = {1, 2, 3, 2, 1};
        int result = t135.candy(ratings);
        assertEquals(9, result, "先增后减评分应返回9");
    }

    /**
     * 测试评分先减后增情况
     * 示例: [3, 2, 1, 2, 3] -> 糖果分配: [3, 2, 1, 2, 3] -> 总和: 11
     */
    @Test
    void testCandyWithDecreaseThenIncrease() {
        int[] ratings = {3, 2, 1, 2, 3};
        int result = t135.candy(ratings);
        assertEquals(11, result, "先减后增评分应返回11");
    }

    /**
     * 测试评分相同情况
     * 示例: [1, 1, 1] -> 糖果分配: [1, 1, 1] -> 总和: 3
     */
    @Test
    void testCandyWithSameRatings() {
        int[] ratings = {1, 1, 1};
        int result = t135.candy(ratings);
        assertEquals(3, result, "相同评分应返回3");
    }

    /**
     * 测试复杂评分情况
     * 示例: [1, 3, 2, 2, 1] -> 糖果分配: [1, 2, 1, 2, 1] -> 总和: 7
     */
    @Test
    void testCandyWithComplexRatings() {
        int[] ratings = {1, 3, 2, 2, 1};
        int result = t135.candy(ratings);
        assertEquals(7, result, "复杂评分应返回7");
    }
}
