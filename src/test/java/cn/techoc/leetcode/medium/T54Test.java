package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * {@link T54#spiralOrder(int[][])} 的单元测试类
 */
class T54Test {

    private final T54 t54 = new T54();

    /**
     * 测试单个元素矩阵
     * 输入: [[1]]
     * 期望输出: [1]
     */
    @Test
    void testSingleElementMatrix() {
        int[][] matrix = {{1}};
        List<Integer> result = t54.spiralOrder(matrix);
        assertEquals(List.of(1), result);
    }

    /**
     * 测试 2x2 矩阵
     * 输入: [[1,2],[3,4]]
     * 期望输出: [1,2,4,3]
     */
    @Test
    void testTwoByTwoMatrix() {
        int[][] matrix = {{1, 2}, {3, 4}};
        List<Integer> result = t54.spiralOrder(matrix);
        assertEquals(List.of(1, 2, 4, 3), result);
    }

    /**
     * 测试 3x3 标准螺旋矩阵
     * 输入: [[1,2,3],[4,5,6],[7,8,9]]
     * 期望输出: [1,2,3,6,9,8,7,4,5]
     */
    @Test
    void testThreeByThreeStandardMatrix() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> result = t54.spiralOrder(matrix);
        assertEquals(List.of(1, 2, 3, 6, 9, 8, 7, 4, 5), result);
    }

    /**
     * 测试 3行4列矩形矩阵
     * 输入: [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
     * 期望输出: [1,2,3,4,8,12,11,10,9,5,6,7]
     */
    @Test
    void testRectangularMatrix() {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        List<Integer> result = t54.spiralOrder(matrix);
        assertEquals(List.of(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7), result);
    }

    /**
     * 测试多行单列矩阵
     * 输入: [[1],[2],[3]]
     * 期望输出: [1,2,3]
     */
    @Test
    void testVerticalLineMatrix() {
        int[][] matrix = {{1}, {2}, {3}};
        List<Integer> result = t54.spiralOrder(matrix);
        assertEquals(List.of(1, 2, 3), result);
    }

    /**
     * 测试单行多列矩阵
     * 输入: [[1,2,3]]
     * 期望输出: [1,2,3]
     */
    @Test
    void testHorizontalLineMatrix() {
        int[][] matrix = {{1, 2, 3}};
        List<Integer> result = t54.spiralOrder(matrix);
        assertEquals(List.of(1, 2, 3), result);
    }
}
