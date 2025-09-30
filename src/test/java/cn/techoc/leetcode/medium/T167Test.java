package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class T167Test {

    /**
     * 测试基本正常情况：[2,7,11,15], target=9 => [1,2]
     */
    @Test
    void testTwoSum_NormalCase1() {
        T167 t167 = new T167();
        int[] result = t167.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    /**
     * 测试靠后匹配的情况：[2,3,4], target=6 => [1,3]
     */
    @Test
    void testTwoSum_NormalCase2() {
        T167 t167 = new T167();
        int[] result = t167.twoSum(new int[]{2, 3, 4}, 6);
        assertArrayEquals(new int[]{1, 3}, result);
    }

    /**
     * 测试包含负数的情况：[-1,0], target=-1 => [1,2]
     */
    @Test
    void testTwoSum_WithNegativeNumbers() {
        T167 t167 = new T167();
        int[] result = t167.twoSum(new int[]{-1, 0}, -1);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    /**
     * 测试相同数字的情况：[0,0,3,4], target=0 => [1,2]
     */
    @Test
    void testTwoSum_ZeroDuplicates() {
        T167 t167 = new T167();
        int[] result = t167.twoSum(new int[]{0, 0, 3, 4}, 0);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    /**
     * 测试中间部分匹配的情况：[1,2,3,4,5], target=8 => [3,5]
     */
    @Test
    void testTwoSum_MiddleMatch() {
        T167 t167 = new T167();
        int[] result = t167.twoSum(new int[]{1, 2, 3, 4, 5}, 8);
        assertArrayEquals(new int[]{3, 5}, result);
    }

    /**
     * 测试最短合法数组的情况：[1,2], target=3 => [1,2]
     */
    @Test
    void testTwoSum_MinimalValidInput() {
        T167 t167 = new T167();
        int[] result = t167.twoSum(new int[]{1, 2}, 3);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    /**
     * （可选）测试无解情况兜底逻辑（虽然题目保证有解）
     * 实际上不会进入 while 循环结束后的 return [-1,-1]，但仍可用于增强鲁棒性检查
     */
    @Test
    void testTwoSum_NoSolutionFallback() {
        T167 t167 = new T167();
        int[] result = t167.twoSum(new int[]{1, 2, 3}, 10); // 不存在这样的两个数
        assertArrayEquals(new int[]{-1, -1}, result);
    }
}