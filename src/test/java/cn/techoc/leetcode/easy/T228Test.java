package cn.techoc.leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * T228 类中 summaryRanges 方法的单元测试
 */
public class T228Test {

    private final T228 t228 = new T228();

    @Test
    @DisplayName("测试空数组")
    public void testEmptyArray() {
        int[] nums = {};
        List<String> result = t228.summaryRanges(nums);
        assertEquals(List.of(), result);
    }

    @Test
    @DisplayName("测试单个元素")
    public void testSingleElement() {
        int[] nums = {5};
        List<String> result = t228.summaryRanges(nums);
        assertEquals(List.of("5"), result);
    }

    @Test
    @DisplayName("测试全部连续元素")
    public void testAllConsecutive() {
        int[] nums = {1, 2, 3, 4, 5};
        List<String> result = t228.summaryRanges(nums);
        assertEquals(List.of("1->5"), result);
    }

    @Test
    @DisplayName("测试混合连续和不连续元素")
    public void testMixedRanges() {
        int[] nums = {0, 1, 2, 4, 5, 7};
        List<String> result = t228.summaryRanges(nums);
        assertEquals(Arrays.asList("0->2", "4->5", "7"), result);
    }

    @Test
    @DisplayName("测试多段连续区间")
    public void testMultipleRanges() {
        int[] nums = {0, 2, 3, 4, 6, 8, 9};
        List<String> result = t228.summaryRanges(nums);
        assertEquals(Arrays.asList("0", "2->4", "6", "8->9"), result);
    }

    @Test
    @DisplayName("测试全部不连续元素")
    public void testAllNonConsecutive() {
        int[] nums = {1, 3, 5, 7};
        List<String> result = t228.summaryRanges(nums);
        assertEquals(Arrays.asList("1", "3", "5", "7"), result);
    }

    @Test
    @DisplayName("测试包含边界值")
    public void testWithBoundaryValues() {
        int[] nums = {-2147483648, -2147483647, 2147483647};
        List<String> result = t228.summaryRanges(nums);
        assertEquals(Arrays.asList("-2147483648->-2147483647", "2147483647"), result);
    }
}
