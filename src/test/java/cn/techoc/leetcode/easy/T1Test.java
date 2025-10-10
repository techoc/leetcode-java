package cn.techoc.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * T1类的单元测试
 * 测试twoSum方法在不同场景下的正确性
 */
class T1Test {

    private final T1 t1 = new T1();

    /**
     * 测试正常情况：存在两个数相加等于目标值
     * 输入：[2, 7, 11, 15], target = 9
     * 期望输出：[0, 1]
     */
    @Test
    void testTwoSumNormalCase() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        int[] actual = t1.twoSum(nums, target);
        assertArrayEquals(expected, actual);
    }

    /**
     * 测试两个相同元素相加等于目标值
     * 输入：[3, 3], target = 6
     * 期望输出：[0, 1]
     */
    @Test
    void testTwoSumWithSameElements() {
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1};
        int[] actual = t1.twoSum(nums, target);
        assertArrayEquals(expected, actual);
    }

    /**
     * 测试数组长度为2的情况
     * 输入：[3, 2], target = 5
     * 期望输出：[0, 1]
     */
    @Test
    void testTwoSumWithTwoElements() {
        int[] nums = {3, 2};
        int target = 5;
        int[] expected = {0, 1};
        int[] actual = t1.twoSum(nums, target);
        assertArrayEquals(expected, actual);
    }

    /**
     * 测试负数参与运算的情况
     * 输入：[-1, -2, -3, -4], target = -5
     * 期望输出：[0, 3]
     */
    @Test
    void testTwoSumWithNegativeNumbers() {
        int[] nums = {-1, -2, -3, -4};
        int target = -5;
        int[] expected = {1, 2};
        int[] actual = t1.twoSum(nums, target);
        assertArrayEquals(expected, actual);
    }

    /**
     * 测试包含重复元素的情况
     * 输入：[1, 2, 3], target = 4
     * 期望输出：[0, 2]
     */
    @Test
    void testTwoSumWithDuplicateElements() {
        int[] nums = {1, 2, 3};
        int target = 4;
        int[] expected = {0, 2};
        int[] actual = t1.twoSum(nums, target);
        assertArrayEquals(expected, actual);
    }
}
