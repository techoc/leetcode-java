package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * {@link T73#setZeroes(int[][])} 的单元测试类
 */
class T73Test {

    private final T73 t73 = new T73();

    /**
     * 测试中间含有0的矩阵
     */
    @Test
    void testSetZeroes_withMiddleZero() {
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        int[][] expected = {
                {1, 0, 1},
                {0, 0, 0},
                {1, 0, 1}
        };

        t73.setZeroes(matrix);

        assertMatrixEquals(expected, matrix);
    }

    /**
     * 测试多个0的情况
     */
    @Test
    void testSetZeroes_multipleZeros() {
        int[][] matrix = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };
        int[][] expected = {
                {0, 0, 0, 0},
                {0, 4, 5, 0},
                {0, 3, 1, 0}
        };

        t73.setZeroes(matrix);

        assertMatrixEquals(expected, matrix);
    }

    /**
     * 测试单个非零元素
     */
    @Test
    void testSetZeroes_singleNonZeroElement() {
        int[][] matrix = {{1}};
        int[][] expected = {{1}};

        t73.setZeroes(matrix);

        assertMatrixEquals(expected, matrix);
    }

    /**
     * 测试单个零元素
     */
    @Test
    void testSetZeroes_singleZeroElement() {
        int[][] matrix = {{0}};
        int[][] expected = {{0}};

        t73.setZeroes(matrix);

        assertMatrixEquals(expected, matrix);
    }

    /**
     * 测试不含0的正常矩阵
     */
    @Test
    void testSetZeroes_noZeroElements() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] expected = {
                {1, 2, 3},
                {4, 5, 6}
        };

        t73.setZeroes(matrix);

        assertMatrixEquals(expected, matrix);
    }

    /**
     * 自定义辅助方法用于比较两个二维数组内容是否相等
     */
    private void assertMatrixEquals(int[][] expected, int[][] actual) {
        if (expected.length != actual.length) {
            throw new AssertionError("Row count mismatch");
        }
        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i], actual[i], "Row " + i + " does not match");
        }
    }
}
