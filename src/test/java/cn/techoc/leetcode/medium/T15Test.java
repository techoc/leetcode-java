package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class T15Test {

    private final T15 t15 = new T15();

    /**
     * 测试正常情况：存在多个满足条件的三元组
     */
    @Test
    public void testNormalCase() {
        int[] input = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-1, -1, 2),
                Arrays.asList(-1, 0, 1)
        );
        List<List<Integer>> actual = t15.threeSum(input);
        assertTrue(actual.containsAll(expected) && expected.containsAll(actual));
    }

    /**
     * 测试边界值：空数组
     */
    @Test
    public void testEmptyArray() {
        int[] input = {};
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> actual = t15.threeSum(input);
        assertEquals(expected, actual);
    }

    /**
     * 测试边界值：数组长度小于3
     */
    @Test
    public void testLessThanThreeElements() {
        int[] input = {1, 2};
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> actual = t15.threeSum(input);
        assertEquals(expected, actual);
    }

    /**
     * 测试特殊情况：所有元素都为正数
     */
    @Test
    public void testAllPositiveNumbers() {
        int[] input = {1, 2, 3};
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> actual = t15.threeSum(input);
        assertEquals(expected, actual);
    }

    /**
     * 测试特殊情况：所有元素都为负数
     */
    @Test
    public void testAllNegativeNumbers() {
        int[] input = {-1, -2, -3};
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> actual = t15.threeSum(input);
        assertEquals(expected, actual);
    }

    /**
     * 测试特殊情况：全为0
     */
    @Test
    public void testAllZeros() {
        int[] input = {0, 0, 0};
        List<List<Integer>> expected = List.of(Arrays.asList(0, 0, 0));
        List<List<Integer>> actual = t15.threeSum(input);
        assertEquals(expected, actual);
    }

    /**
     * 测试无解情况：没有任何满足条件的三元组
     */
    @Test
    public void testNoSolution() {
        int[] input = {1, 2, 3};
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> actual = t15.threeSum(input);
        assertEquals(expected, actual);
    }

    /**
     * 测试重复元素：包含大量重复元素的情况
     */
    @Test
    public void testDuplicateElements() {
        int[] input = {0, 0, 0, 0};
        List<List<Integer>> expected = List.of(Arrays.asList(0, 0, 0));
        List<List<Integer>> actual = t15.threeSum(input);
        assertEquals(expected, actual);
    }
}