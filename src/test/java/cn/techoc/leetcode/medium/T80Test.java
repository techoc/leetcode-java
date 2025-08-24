package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * T80 单元测试类
 * 测试 removeDuplicates 方法的功能正确性
 */
class T80Test {

    private final T80 t80 = new T80();

    /**
     * TC01: 输入为 null，期望返回 0
     */
    @Test
    void testRemoveDuplicatesWithNullArray() {
        int result = t80.removeDuplicates(null);
        assertEquals(0, result);
    }

    /**
     * TC02: 输入为空数组，期望返回 0
     */
    @Test
    void testRemoveDuplicatesWithEmptyArray() {
        int[] nums = {};
        int result = t80.removeDuplicates(nums);
        assertEquals(0, result);
    }

    /**
     * TC03: 输入为单个元素数组，期望返回 1
     */
    @Test
    void testRemoveDuplicatesWithSingleElement() {
        int[] nums = {1};
        int result = t80.removeDuplicates(nums);
        assertEquals(2, result);
        assertArrayEquals(new int[]{1}, nums);
    }

    /**
     * TC04: 输入为两个相同元素，期望返回 2
     */
    @Test
    void testRemoveDuplicatesWithTwoSameElements() {
        int[] nums = {1, 1};
        int result = t80.removeDuplicates(nums);
        assertEquals(2, result);
    }

    /**
     * TC05: 输入为三个相同元素，期望返回 2，并验证数组前两位为 1
     */
    @Test
    void testRemoveDuplicatesWithThreeSameElements() {
        int[] nums = {1, 1, 1};
        int result = t80.removeDuplicates(nums);
        assertArrayEquals(new int[]{1, 1}, java.util.Arrays.copyOf(nums, result));
    }

    /**
     * TC06: 复杂重复情况 {1,1,1,2,2,3}，期望返回 5，数组前五位为 {1,1,2,2,3}
     */
    @Test
    void testRemoveDuplicatesWithMixedDuplicates() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int result = t80.removeDuplicates(nums);
        assertEquals(5, result);
        assertArrayEquals(new int[]{1, 1, 2, 2, 3}, java.util.Arrays.copyOf(nums, result));
    }

    /**
     * TC07: 更复杂重复情况 {0,0,1,1,1,1,2,3,3}，期望返回 7
     */
    @Test
    void testRemoveDuplicatesWithComplexCase() {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int result = t80.removeDuplicates(nums);
        assertEquals(7, result);
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 3, 3}, java.util.Arrays.copyOf(nums, result));
    }

    /**
     * TC08: 无重复元素 {1,2,3}，期望返回 3
     */
    @Test
    void testRemoveDuplicatesWithoutDuplicates() {
        int[] nums = {1, 2, 3};
        int result = t80.removeDuplicates(nums);
        assertEquals(3, result);
        assertArrayEquals(new int[]{1, 2, 3}, java.util.Arrays.copyOf(nums, result));
    }
}
