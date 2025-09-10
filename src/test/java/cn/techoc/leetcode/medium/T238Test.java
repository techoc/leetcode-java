package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * T238 类的单元测试
 * 测试函数：public int[] productExceptSelf(int[] nums)
 */
class T238Test {

    private final T238 t238 = new T238();

    /**
     * TC01: 普通正整数数组
     */
    @Test
    void testProductExceptSelf_NormalPositive() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        int[] result = t238.productExceptSelf(input);
        assertArrayEquals(expected, result);
    }

    /**
     * TC02: 包含一个 0
     */
    @Test
    void testProductExceptSelf_OneZero() {
        int[] input = {-1, 1, 0, -3, 3};
        int[] expected = {0, 0, 9, 0, 0};
        int[] result = t238.productExceptSelf(input);
        assertArrayEquals(expected, result);
    }

    /**
     * TC03: 全为 0
     */
    @Test
    void testProductExceptSelf_AllZero() {
        int[] input = {0, 0};
        int[] expected = {0, 0};
        int[] result = t238.productExceptSelf(input);
        assertArrayEquals(expected, result);
    }

    /**
     * TC04: 单个元素
     */
    @Test
    void testProductExceptSelf_SingleElement() {
        int[] input = {1};
        int[] expected = {1};
        int[] result = t238.productExceptSelf(input);
        assertArrayEquals(expected, result);
    }

    /**
     * TC05: 空数组
     */
    @Test
    void testProductExceptSelf_EmptyArray() {
        int[] input = {};
        int[] expected = {};
        int[] result = t238.productExceptSelf(input);
        assertArrayEquals(expected, result);
    }

    /**
     * TC06: 两个元素
     */
    @Test
    void testProductExceptSelf_TwoElements() {
        int[] input = {2, 3};
        int[] expected = {3, 2};
        int[] result = t238.productExceptSelf(input);
        assertArrayEquals(expected, result);
    }

    /**
     * TC07: 全为负数
     */
    @Test
    void testProductExceptSelf_AllNegative() {
        int[] input = {-1, -2, -3};
        int[] expected = {6, 3, 2};
        int[] result = t238.productExceptSelf(input);
        assertArrayEquals(expected, result);
    }
}
