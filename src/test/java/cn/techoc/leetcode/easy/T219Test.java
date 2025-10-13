package cn.techoc.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * T219 类的单元测试
 * 测试 containsNearbyDuplicate 方法的功能正确性
 */
class T219Test {

    private final T219 t219 = new T219();

    /**
     * 测试用例 TC01: 存在重复元素且距离 ≤ k
     * 输入: nums = [1,2,3,1], k = 3
     * 预期输出: true
     */
    @Test
    void testContainsNearbyDuplicate_ExistsWithinK() {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        assertTrue(t219.containsNearbyDuplicate(nums, k));
    }

    /**
     * 测试用例 TC02: 存在重复元素且距离 ≤ k
     * 输入: nums = [1,0,1,1], k = 1
     * 预期输出: true
     */
    @Test
    void testContainsNearbyDuplicate_ExistsWithinK2() {
        int[] nums = {1, 0, 1, 1};
        int k = 1;
        assertTrue(t219.containsNearbyDuplicate(nums, k));
    }

    /**
     * 测试用例 TC03: 存在重复元素但距离 > k
     * 输入: nums = [1,2,3,1,2,3], k = 2
     * 预期输出: false
     */
    @Test
    void testContainsNearbyDuplicate_ExistsButBeyondK() {
        int[] nums = {1, 2, 3, 1, 2, 3};
        int k = 2;
        assertFalse(t219.containsNearbyDuplicate(nums, k));
    }

    /**
     * 测试用例 TC04: 无重复元素
     * 输入: nums = [1,2,3,4,5], k = 3
     * 预期输出: false
     */
    @Test
    void testContainsNearbyDuplicate_NoDuplicates() {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;
        assertFalse(t219.containsNearbyDuplicate(nums, k));
    }

    /**
     * 测试用例 TC05: 空数组
     * 输入: nums = null, k = 1
     * 预期输出: false
     */
    @Test
    void testContainsNearbyDuplicate_NullArray() {
        int[] nums = null;
        int k = 1;
        assertFalse(t219.containsNearbyDuplicate(nums, k));
    }

    /**
     * 测试用例 TC06: 空数组
     * 输入: nums = [], k = 1
     * 预期输出: false
     */
    @Test
    void testContainsNearbyDuplicate_EmptyArray() {
        int[] nums = {};
        int k = 1;
        assertFalse(t219.containsNearbyDuplicate(nums, k));
    }

    /**
     * 测试用例 TC07: 单个元素
     * 输入: nums = [1], k = 1
     * 预期输出: false
     */
    @Test
    void testContainsNearbyDuplicate_SingleElement() {
        int[] nums = {1};
        int k = 1;
        assertFalse(t219.containsNearbyDuplicate(nums, k));
    }

    /**
     * 测试用例 TC08: 两个相同元素
     * 输入: nums = [99,99], k = 2
     * 预期输出: true
     */
    @Test
    void testContainsNearbyDuplicate_TwoSameElements() {
        int[] nums = {99, 99};
        int k = 2;
        assertTrue(t219.containsNearbyDuplicate(nums, k));
    }

    /**
     * 测试用例 TC09: k = 0
     * 输入: nums = [1,2,1], k = 0
     * 预期输出: true
     */
    @Test
    void testContainsNearbyDuplicate_KIsZero() {
        int[] nums = {1, 2, 1};
        int k = 0;
        assertFalse(t219.containsNearbyDuplicate(nums, k));
    }
}
