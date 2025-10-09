package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * T48 类中 rotate 方法的单元测试
 */
class T48Test {

    private final T48 t48 = new T48();

    /**
     * 测试用例 TC1: 1x1 矩阵
     */
    @Test
    void testRotate_1x1Matrix() {
        int[][] matrix = {{1}};
        int[][] expected = {{1}};
        t48.rotate(matrix);
        assertArrayEquals(expected, matrix);
    }

    /**
     * 测试用例 TC2: 2x2 矩阵
     */
    @Test
    void testRotate_2x2Matrix() {
        int[][] matrix = {
                {1, 2},
                {3, 4}
        };
        int[][] expected = {
                {3, 1},
                {4, 2}
        };
        t48.rotate(matrix);
        assertArrayEquals(expected, matrix);
    }

    /**
     * 测试用例 TC3: 3x3 矩阵
     */
    @Test
    void testRotate_3x3Matrix() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] expected = {
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };
        t48.rotate(matrix);
        assertArrayEquals(expected, matrix);
    }

    /**
     * 测试用例 TC4: 4x4 矩阵
     */
    @Test
    void testRotate_4x4Matrix() {
        int[][] matrix = {
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}
        };
        int[][] expected = {
                {15, 13, 2, 5},
                {14, 3, 4, 1},
                {12, 6, 8, 9},
                {16, 7, 10, 11}
        };
        t48.rotate(matrix);
        assertArrayEquals(expected, matrix);
    }
}
