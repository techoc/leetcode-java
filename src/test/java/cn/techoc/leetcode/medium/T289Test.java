package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * {@link T289#gameOfLife(int[][])} 的单元测试类
 */
class T289Test {

    private final T289 t289 = new T289();

    /**
     * TC01: 孤独致死 —— 只有一个活细胞
     */
    @Test
    void testSingleLiveCellDies() {
        int[][] board = {{1}};
        t289.gameOfLife(board);
        assertArrayEquals(new int[][]{{0}}, board);
    }

    /**
     * TC02: 拥挤致死 —— 四个邻居包围中心活细胞
     */
    @Test
    void testOvercrowdingDeath() {
        int[][] board = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };
        int[][] expected = {
                {1, 0, 1},
                {0, 0, 0},
                {1, 0, 1}
        };
        t289.gameOfLife(board);
        assertArrayEquals(expected, board);
    }

    /**
     * TC03: 稳定结构 —— 十字形结构中间死亡
     */
    @Test
    void testStableCrossPattern() {
        int[][] board = {
                {0, 1, 0},
                {1, 1, 1},
                {0, 1, 0}
        };
        int[][] expected = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        t289.gameOfLife(board);
        assertArrayEquals(expected, board);
    }

    /**
     * TC04: 复活机制 —— 死细胞因三个邻居而复活
     */
    @Test
    void testDeadCellRevivesWithThreeNeighbors() {
        int[][] board = {
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 1}
        };
        int[][] expected = {
                {0, 0, 0},
                {1, 0, 1},
                {0, 1, 1}
        };
        t289.gameOfLife(board);
        assertArrayEquals(expected, board);
    }

    /**
     * TC05: 边界测试 —— 单行情况
     */
    @Test
    void testEdgeCaseSingleRow() {
        int[][] board = {{0, 1, 0, 0}};
        int[][] expected = {{0, 0, 0, 0}};
        t289.gameOfLife(board);
        assertArrayEquals(expected, board);
    }
}
