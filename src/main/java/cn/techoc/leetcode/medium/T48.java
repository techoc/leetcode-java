package cn.techoc.leetcode.medium;

public class T48 {

    /**
     * <a href="https://leetcode.cn/problems/rotate-image">48. 旋转图像</a>
     * 将给定的矩阵顺时针旋转90度。
     *
     * @param matrix 待旋转的二维整数数组
     */
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // 1. 转置
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {    //遍历对角线下方元素
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // 2. 翻转
        for (int[] ints : matrix) {
            for (int i = 0; i < n / 2; i++) {   // 遍历每一行左边的元素 与 右边的元素 交换
                int temp = ints[i];
                ints[i] = ints[n - 1 - i];
                ints[n - 1 - i] = temp;
            }
        }
    }
}
