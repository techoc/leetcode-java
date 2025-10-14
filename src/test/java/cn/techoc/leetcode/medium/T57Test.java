package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * T57 插入区间 单元测试
 */
class T57Test {

    private final T57 t57 = new T57();

    /**
     * 测试用例1：空列表插入新区间
     */
    @Test
    void testInsertIntoEmptyList() {
        int[][] intervals = {};
        int[] newInterval = {5, 7};
        int[][] expected = {{5, 7}};
        int[][] result = t57.insert(intervals, newInterval);
        assertArrayEquals(expected, result);
    }

    /**
     * 测试用例2：新区间在所有区间之前
     */
    @Test
    void testInsertBeforeAll() {
        int[][] intervals = {{2, 3}, {4, 5}};
        int[] newInterval = {0, 1};
        int[][] expected = {{0, 1}, {2, 3}, {4, 5}};
        int[][] result = t57.insert(intervals, newInterval);
        assertArrayEquals(expected, result);
    }

    /**
     * 测试用例3：新区间在所有区间之后
     */
    @Test
    void testInsertAfterAll() {
        int[][] intervals = {{1, 2}, {3, 4}};
        int[] newInterval = {5, 6};
        int[][] expected = {{1, 2}, {3, 4}, {5, 6}};
        int[][] result = t57.insert(intervals, newInterval);
        assertArrayEquals(expected, result);
    }

    /**
     * 测试用例4：新区间与某个区间重叠，需合并
     */
    @Test
    void testInsertOverlapOne() {
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};
        int[][] expected = {{1, 5}, {6, 9}};
        int[][] result = t57.insert(intervals, newInterval);
        assertArrayEquals(expected, result);
    }

    /**
     * 测试用例5：新区间完全包含于某个区间
     */
    @Test
    void testInsertContained() {
        int[][] intervals = {{1, 5}};
        int[] newInterval = {2, 3};
        int[][] expected = {{1, 5}};
        int[][] result = t57.insert(intervals, newInterval);
        assertArrayEquals(expected, result);
    }

    /**
     * 测试用例6：新区间与多个区间重叠，需合并多个区间
     */
    @Test
    void testInsertOverlapMultiple() {
        int[][] intervals = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval = {4, 8};
        int[][] expected = {{1, 2}, {3, 10}, {12, 16}};
        int[][] result = t57.insert(intervals, newInterval);
        assertArrayEquals(expected, result);
    }
}
