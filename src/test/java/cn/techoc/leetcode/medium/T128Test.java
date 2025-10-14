package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 对T128类中的longestConsecutive方法进行单元测试
 */
class T128Test {

    private final T128 t128 = new T128();

    /**
     * 测试空数组的情况
     * 预期结果: 0
     */
    @Test
    void testLongestConsecutiveWithEmptyArray() {
        int[] nums = {};
        assertEquals(0, t128.longestConsecutive(nums));
    }

    /**
     * 测试只有一个元素的数组
     * 预期结果: 1
     */
    @Test
    void testLongestConsecutiveWithSingleElement() {
        int[] nums = {5};
        assertEquals(1, t128.longestConsecutive(nums));
    }

    /**
     * 测试全部相同的元素
     * 预期结果: 1
     */
    @Test
    void testLongestConsecutiveWithAllSameElements() {
        int[] nums = {2, 2, 2, 2};
        assertEquals(1, t128.longestConsecutive(nums));
    }

    /**
     * 测试有正数和负数混合且存在连续序列的情况
     * 示例输入: [100, 4, 200, 1, 3, 2]
     * 预期结果: 4 （因为最长连续序列为 [1, 2, 3, 4]）
     */
    @Test
    void testLongestConsecutiveWithMixedNumbers() {
        int[] nums = {100, 4, 200, 1, 3, 2};
        assertEquals(4, t128.longestConsecutive(nums));
    }

    /**
     * 测试包含负数的连续序列
     * 示例输入: [-1, 0, 1, 2]
     * 预期结果: 4
     */
    @Test
    void testLongestConsecutiveWithNegativeNumbers() {
        int[] nums = {-1, 0, 1, 2};
        assertEquals(4, t128.longestConsecutive(nums));
    }

    /**
     * 测试无连续序列的情况
     * 示例输入: [1, 3, 5, 7]
     * 预期结果: 1
     */
    @Test
    void testLongestConsecutiveWithoutSequence() {
        int[] nums = {1, 3, 5, 7};
        assertEquals(1, t128.longestConsecutive(nums));
    }

    /**
     * 测试大量重复元素但不含连续序列
     * 示例输入: [1, 1, 1, 3, 3, 3, 5, 5, 5]
     * 预期结果: 1
     */
    @Test
    void testLongestConsecutiveWithDuplicatesNoSequence() {
        int[] nums = {1, 1, 1, 3, 3, 3, 5, 5, 5};
        assertEquals(1, t128.longestConsecutive(nums));
    }

    /**
     * 测试较长的连续序列
     * 示例输入: [1, 2, 3, ..., 100]
     * 预期结果: 100
     */
    @Test
    void testLongestConsecutiveWithLargeSequence() {
        int[] nums = new int[100];
        for (int i = 0; i < 100; i++) {
            nums[i] = i + 1;
        }
        assertEquals(100, t128.longestConsecutive(nums));
    }
}
