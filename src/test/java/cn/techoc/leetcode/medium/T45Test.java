package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * T45 跳跃游戏 II 的单元测试
 */
class T45Test {

    private final T45 t45 = new T45();

    /**
     * 测试用例1: 数组长度为1，无需跳跃
     * 输入: [0]
     * 期望输出: 0
     */
    @Test
    void testJumpWithSingleElement() {
        int[] nums = {0};
        int result = t45.jump(nums);
        assertEquals(0, result, "数组长度为1时，跳跃次数应为0");
    }

    /**
     * 测试用例2: 正常情况，需要多次跳跃
     * 输入: [2,3,1,1,4]
     * 期望输出: 2
     */
    @Test
    void testJumpWithMultipleSteps() {
        int[] nums = {2, 3, 1, 1, 4};
        int result = t45.jump(nums);
        assertEquals(2, result, "跳跃次数应为2");
    }

    /**
     * 测试用例3: 一步跳跃到底
     * 输入: [5,1,1,1,1]
     * 期望输出: 1
     */
    @Test
    void testJumpWithOneStep() {
        int[] nums = {5, 1, 1, 1, 1};
        int result = t45.jump(nums);
        assertEquals(1, result, "一步跳跃到底，跳跃次数应为1");
    }

    /**
     * 测试用例4: 包含0但不影响跳跃
     * 输入: [2,0,1,1,4]
     * 期望输出: 3
     */
    @Test
    void testJumpWithZeroElement() {
        int[] nums = {2, 0, 1, 1, 4};
        int result = t45.jump(nums);
        assertEquals(3, result, "包含0但不影响跳跃，跳跃次数应为3");
    }

    /**
     * 测试用例5: 最大跳跃范围
     * 输入: [10,9,8,7,6,5,4,3,2,1,1,0]
     * 期望输出: 2
     */
    @Test
    void testJumpWithMaxRange() {
        int[] nums = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 1, 0};
        int result = t45.jump(nums);
        assertEquals(2, result, "最大跳跃范围，跳跃次数应为2");
    }
}
