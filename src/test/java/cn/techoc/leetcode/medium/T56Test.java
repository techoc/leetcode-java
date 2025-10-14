package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * T56.merge 单元测试类
 */
public class T56Test {

    private final T56 t56 = new T56();

    /**
     * 测试用例 TC01: 输入为空数组
     * 输入: []
     * 预期结果: []
     */
    @Test
    public void testMerge_EmptyInput() {
        int[][] input = {};
        int[][] expected = {};
        assertArrayEquals(expected, t56.merge(input));
    }

    /**
     * 测试用例 TC02: 单一区间
     * 输入: [[1,3]]
     * 预期结果: [[1,3]]
     */
    @Test
    public void testMerge_SingleInterval() {
        int[][] input = {{1, 3}};
        int[][] expected = {{1, 3}};
        assertArrayEquals(expected, t56.merge(input));
    }

    /**
     * 测试用例 TC03: 正常合并多个重叠区间
     * 输入: [[1,3],[2,6],[8,10],[15,18]]
     * 预期结果: [[1,6],[8,10],[15,18]]
     */
    @Test
    public void testMerge_NormalOverlappingIntervals() {
        int[][] input = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] expected = {{1, 6}, {8, 10}, {15, 18}};
        assertArrayEquals(expected, t56.merge(input));
    }

    /**
     * 测试用例 TC04: 边界接触合并
     * 输入: [[1,4],[4,5]]
     * 预期结果: [[1,5]]
     */
    @Test
    public void testMerge_AdjacentBoundaryMerge() {
        int[][] input = {{1, 4}, {4, 5}};
        int[][] expected = {{1, 5}};
        assertArrayEquals(expected, t56.merge(input));
    }

    /**
     * 测试用例 TC05: 包含关系合并
     * 输入: [[1,4],[0,4]]
     * 预期结果: [[0,4]]
     */
    @Test
    public void testMerge_InnerContainmentMerge() {
        int[][] input = {{1, 4}, {0, 4}};
        int[][] expected = {{0, 4}};
        assertArrayEquals(expected, t56.merge(input));
    }

    /**
     * 测试用例 TC06: 无重叠区间
     * 输入: [[1,3],[5,7],[9,11]]
     * 预期结果: [[1,3],[5,7],[9,11]]
     */
    @Test
    public void testMerge_NoOverlapIntervals() {
        int[][] input = {{1, 3}, {5, 7}, {9, 11}};
        int[][] expected = {{1, 3}, {5, 7}, {9, 11}};
        assertArrayEquals(expected, t56.merge(input));
    }

    /**
     * 测试用例 TC07: 所有区间最终合并为一个
     * 输入: [[2,3],[4,5],[6,7],[8,9],[1,10]]
     * 预期结果: [[1,10]]
     */
    @Test
    public void testMerge_AllMergedToOne() {
        int[][] input = {{2, 3}, {4, 5}, {6, 7}, {8, 9}, {1, 10}};
        int[][] expected = {{1, 10}};
        assertArrayEquals(expected, t56.merge(input));
    }

    /**
     * 测试用例 TC08: 特殊小范围区间
     * 输入: [[1,4],[0,0]]
     * 预期结果: [[0,0],[1,4]]
     */
    @Test
    public void testMerge_SpecialSmallRange() {
        int[][] input = {{1, 4}, {0, 0}};
        int[][] expected = {{0, 0}, {1, 4}};
        assertArrayEquals(expected, t56.merge(input));
    }
}
