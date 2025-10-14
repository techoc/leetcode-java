package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 对函数 findMinArrowShots 的单元测试
 */
class T452Test {

    private final T452 t452 = new T452();

    /**
     * TC01: 输入为空数组，期望返回0
     */
    @Test
    void testFindMinArrowShots_EmptyArray() {
        int[][] points = {};
        int result = t452.findMinArrowShots(points);
        assertEquals(0, result);
    }

    /**
     * TC02: 输入为单个气球，期望返回1
     */
    @Test
    void testFindMinArrowShots_SingleBalloon() {
        int[][] points = {{1, 2}};
        int result = t452.findMinArrowShots(points);
        assertEquals(1, result);
    }

    /**
     * TC03: 气球之间部分重叠，期望返回2
     */
    @Test
    void testFindMinArrowShots_PartialOverlap() {
        int[][] points = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        int result = t452.findMinArrowShots(points);
        assertEquals(2, result);
    }

    /**
     * TC04: 气球之间完全不重叠，期望返回4
     */
    @Test
    void testFindMinArrowShots_NoOverlap() {
        int[][] points = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        int result = t452.findMinArrowShots(points);
        assertEquals(4, result);
    }

    /**
     * TC05: 所有气球完全重叠，期望返回1
     */
    @Test
    void testFindMinArrowShots_FullyOverlap() {
        int[][] points = {{1, 2}, {1, 2}, {1, 2}};
        int result = t452.findMinArrowShots(points);
        assertEquals(1, result);
    }

    /**
     * TC06: 一个大气球覆盖多个小气球，期望返回2
     */
    @Test
    void testFindMinArrowShots_OneCoversMany() {
        int[][] points = {{1, 10}, {2, 3}, {4, 5}};
        int result = t452.findMinArrowShots(points);
        assertEquals(2, result);
    }
}
