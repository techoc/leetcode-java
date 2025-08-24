package cn.techoc.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * T169 类的单元测试
 * 测试 majorityElement 方法
 */
class T169Test {

    private final T169 t169 = new T169();

    /**
     * 测试用例1: 基本功能测试
     * 输入: [3,2,3]
     * 期望输出: 3
     */
    @Test
    void testMajorityElement_BasicCase() {
        int[] nums = {3, 2, 3};
        int result = t169.majorityElement(nums);
        assertEquals(3, result);
    }

    /**
     * 测试用例2: 多数元素在数组开头
     * 输入: [2,2,1,1,1,2,2]
     * 期望输出: 2
     */
    @Test
    void testMajorityElement_ElementAtBeginning() {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int result = t169.majorityElement(nums);
        assertEquals(2, result);
    }

    /**
     * 测试用例3: 单元素数组
     * 输入: [1]
     * 期望输出: 1
     */
    @Test
    void testMajorityElement_SingleElement() {
        int[] nums = {1};
        int result = t169.majorityElement(nums);
        assertEquals(1, result);
    }

    /**
     * 测试用例4: 多数元素在数组末尾
     * 输入: [1,1,2,2,2]
     * 期望输出: 2
     */
    @Test
    void testMajorityElement_ElementAtEnd() {
        int[] nums = {1, 1, 2, 2, 2};
        int result = t169.majorityElement(nums);
        assertEquals(2, result);
    }

    /**
     * 测试用例5: 多数元素出现次数刚好超过一半
     * 输入: [1,2,1,3,1,4,1]
     * 期望输出: 1
     */
    @Test
    void testMajorityElement_ExactMajority() {
        int[] nums = {1, 2, 1, 3, 1, 4, 1};
        int result = t169.majorityElement(nums);
        assertEquals(1, result);
    }

    /**
     * 测试用例6: 负数元素
     * 输入: [-1,-1,2]
     * 期望输出: -1
     */
    @Test
    void testMajorityElement_NegativeNumbers() {
        int[] nums = {-1, -1, 2};
        int result = t169.majorityElement(nums);
        assertEquals(-1, result);
    }

    /**
     * 测试用例7: 所有元素相同
     * 输入: [5,5,5,5,5]
     * 期望输出: 5
     */
    @Test
    void testMajorityElement_AllSameElements() {
        int[] nums = {5, 5, 5, 5, 5};
        int result = t169.majorityElement(nums);
        assertEquals(5, result);
    }
}
