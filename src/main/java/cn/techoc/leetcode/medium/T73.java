package cn.techoc.leetcode.medium;

public class T73 {
    /**
     * <a href="https://leetcode.cn/problems/set-matrix-zeroes">73. 矩阵置零</a>
     * <p>
     * 将矩阵中的特定行和列设置为0。
     * 如果矩阵中某个元素为0，则将其所在的行和列的所有元素都设置为0。
     *
     * @param matrix 整数二维数组，表示待处理的矩阵
     */
    public void setZeroes(int[][] matrix) {
        // 记录矩阵中0的行和列
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] rows = new boolean[m];
        boolean[] cols = new boolean[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {    // 找到0
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rows[i] || cols[j]) {   // 置0
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
