package cn.techoc.leetcode.medium;

public class T289 {
    /**
     * <a href="https://leetcode.cn/problems/game-of-life">289. 生命游戏</a>
     * 实现康威生命游戏的下一步状态更新。
     *
     * @param board 当前的游戏面板，其中0表示死细胞，1表示活细胞。
     */
    public void gameOfLife(int[][] board) {
        // 定义 -1 代表过去是活细胞 现在是死细胞
        // 定义 2 代表过去是死细胞 现在是活细胞
        int m = board.length;
        int n = board[0].length;

        int[] neighbors = {0, 1, -1};

        // 1. 遍历
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {

                int live = 0;   // 当前位置的活细胞数量

                for (int i = 0; i < 3; i++) {   // 计算 周围的活细胞数量
                    for (int j = 0; j < 3; j++) {
                        if (!(neighbors[i] == 0 && neighbors[j] == 0)) { // 跳过自身
                            int r = row + neighbors[i];
                            int c = col + neighbors[j];
                            // 获取当前位置的活细胞数量 并且 判断当前位置是否越界
                            if (r < m && r >= 0 && c < n && c >= 0 && Math.abs(board[r][c]) == 1) {
                                live++;
                            }
                        }
                    }
                }
                if (board[row][col] == 1 && (live < 2 || live > 3)) {   // 死细胞
                    board[row][col] = -1;
                }
                if (board[row][col] == 0 && live == 3) {   // 活细胞
                    board[row][col] = 2;
                }
            }
        }
        // 2. 赋值
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (board[row][col] > 0) {
                    board[row][col] = 1;
                } else {
                    board[row][col] = 0;
                }
            }
        }
    }
}

