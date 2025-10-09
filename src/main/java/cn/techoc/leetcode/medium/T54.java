package cn.techoc.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class T54 {
    private static final int[][] DIRS = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // 右下左上

    /**
     * <a href="https://leetcode.cn/problems/spiral-matrix">54. 螺旋矩阵</a>
     * 以螺旋顺序返回矩阵中的所有元素。
     *
     * @param matrix 二维整数数组，表示给定的矩阵。
     * @return 按照螺旋顺序排列的所有元素列表。
     */
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        ArrayList<Integer> ans = new ArrayList<>(m * n);
        int i = 0;
        int j = 0;
        int di = 0; // 当前方向函数的方向
        for (int k = 0; k < m * n; k++) {   // 循环 m*n 次
            ans.add(matrix[i][j]);
            matrix[i][j] = Integer.MAX_VALUE;   // 置为最大值，避免重复访问
            // 计算下一步的位置
            int nextI = i + DIRS[di][0];
            int nextJ = j + DIRS[di][1];
            // 判断下一步的位置是否越界或者越界位置是否被访问过
            if (nextI < 0 || nextI >= m || nextJ < 0 || nextJ >= n || matrix[nextI][nextJ] == Integer.MAX_VALUE) {
                di = (di + 1) % 4;  // 转下一方向
            }
            // 执行移动
            i += DIRS[di][0];
            j += DIRS[di][1];
        }
        return ans;
    }
}