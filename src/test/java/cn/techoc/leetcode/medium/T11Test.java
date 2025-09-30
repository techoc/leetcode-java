package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 对 T11 类中的 maxArea 方法进行单元测试
 */
public class T11Test {

    private final T11 t11 = new T11();

    /**
     * 测试基本功能：LeetCode 示例输入
     * 输入: [1,8,6,2,5,4,8,3,7]
     * 期望输出: 49
     */
    @Test
    public void testMaxArea_ExampleInput() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expected = 49;
        int result = t11.maxArea(height);
        assertEquals(expected, result, "应返回最大面积 49");
    }

    /**
     * 测试最小数组长度情况
     * 输入: [1,1]
     * 期望输出: 1
     */
    @Test
    public void testMaxArea_MinimumLength() {
        int[] height = {1, 1};
        int expected = 1;
        int result = t11.maxArea(height);
        assertEquals(expected, result, "应返回面积 1");
    }

    /**
     * 测试所有元素相同的情况
     * 输入: [5,5,5,5]
     * 期望输出: 15
     */
    @Test
    public void testMaxArea_AllSameElements() {
        int[] height = {5, 5, 5, 5};
        int expected = 15;
        int result = t11.maxArea(height);
        assertEquals(expected, result, "应返回面积 15");
    }

    /**
     * 测试递增序列
     * 输入: [1,2,3,4,5]
     * 期望输出: 6
     */
    @Test
    public void testMaxArea_IncreasingSequence() {
        int[] height = {1, 2, 3, 4, 5};
        int expected = 6;
        int result = t11.maxArea(height);
        assertEquals(expected, result, "应返回面积 6");
    }

    /**
     * 测试递减序列
     * 输入: [5,4,3,2,1]
     * 期望输出: 6
     */
    @Test
    public void testMaxArea_DecreasingSequence() {
        int[] height = {5, 4, 3, 2, 1};
        int expected = 6;
        int result = t11.maxArea(height);
        assertEquals(expected, result, "应返回面积 6");
    }

    /**
     * 测试空数组
     * 输入: []
     * 期望输出: 0
     */
    @Test
    public void testMaxArea_EmptyArray() {
        int[] height = {};
        int expected = 0;
        int result = t11.maxArea(height);
        assertEquals(expected, result, "空数组应返回 0");
    }

    /**
     * 测试单个元素数组
     * 输入: [1]
     * 期望输出: 0
     */
    @Test
    public void testMaxArea_SingleElement() {
        int[] height = {1};
        int expected = 0;
        int result = t11.maxArea(height);
        assertEquals(expected, result, "单个元素无法构成容器，应返回 0");
    }
}
