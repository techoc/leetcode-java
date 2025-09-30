package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T209Test {


    /**
     * 测试存在满足条件的最小子数组的情况
     * 示例输入: target=7, nums=[2,3,1,2,4,3]
     * 预期输出: 2 （子数组 [4,3]）
     */
    @Test
    void testMinSubArrayLen_WithValidSubArray() {
        T209 t209 = new T209();
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        int expected = 2;
        assertEquals(expected, t209.minSubArrayLen(target, nums));
    }

    /**
     * 测试单个元素就满足条件的情况
     * 示例输入: target=4, nums=[1,4,4]
     * 预期输出: 1 （子数组 [4]）
     */
    @Test
    void testMinSubArrayLen_ElementItselfSatisfiesTarget() {
        T209 t209 = new T209();
        int target = 4;
        int[] nums = {1, 4, 4};
        int expected = 1;
        assertEquals(expected, t209.minSubArrayLen(target, nums));
    }

    /**
     * 测试所有元素加起来都不够的情况
     * 示例输入: target=11, nums=[1,1,1,1,1,1,1,1]
     * 预期输出: 0 （无满足条件的子数组）
     */
    @Test
    void testMinSubArrayLen_NoValidSubArray() {
        T209 t209 = new T209();
        int target = 11;
        int[] nums = {1, 1, 1, 1, 1, 1, 1, 1};
        int expected = 0;
        assertEquals(expected, t209.minSubArrayLen(target, nums));
    }

    /**
     * 测试只有一个元素且正好等于 target 的情况
     * 示例输入: target=1, nums=[1]
     * 预期输出: 1
     */
    @Test
    void testMinSubArrayLen_SingleElementEqualsTarget() {
        T209 t209 = new T209();
        int target = 1;
        int[] nums = {1};
        int expected = 1;
        assertEquals(expected, t209.minSubArrayLen(target, nums));
    }

    /**
     * 测试空数组的情况
     * 示例输入: target=100, nums=[]
     * 预期输出: 0
     */
    @Test
    void testMinSubArrayLen_EmptyArray() {
        T209 t209 = new T209();
        int target = 100;
        int[] nums = {};
        int expected = 0;
        assertEquals(expected, t209.minSubArrayLen(target, nums));
    }

    /**
     * 测试整体数组才满足的情况
     * 示例输入: target=6, nums=[1,2,3]
     * 预期输出: 3 （整个数组）
     */
    @Test
    void testMinSubArrayLen_EntireArrayRequired() {
        T209 t209 = new T209();
        int target = 6;
        int[] nums = {1, 2, 3};
        int expected = 3;
        assertEquals(expected, t209.minSubArrayLen(target, nums));
    }
}