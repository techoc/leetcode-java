package cn.techoc.easy;

import java.util.Arrays;

public class T2643 {
    public static void main(String[] args) {
        int[][] mat1 = {{0, 1}, {1, 0}};
        int[][] mat2 = {{0, 0, 0}, {0, 1, 1}};
        int[][] mat3 = {{0, 0}, {1, 1}, {0, 0}};
        T2643 t2643 = new T2643();
        int[] res1 = t2643.rowAndMaximumOnes(mat1);
        int[] res2 = t2643.rowAndMaximumOnes(mat2);
        int[] res3 = t2643.rowAndMaximumOnes(mat3);
        System.out.println(Arrays.toString(res1));
        System.out.println(Arrays.toString(res2));
        System.out.println(Arrays.toString(res3));
    }

    /**
     * <a href="https://leetcode.cn/problems/row-with-maximum-ones">2643. 一最多的行</a>
     *
     * @param mat 二维数组
     * @return 返回一个包含行索引和该行中 1 的最大数量的数组
     */
    public int[] rowAndMaximumOnes(int[][] mat) {
        // 初始化最大 1 的数量为 0
        int maxOnes = 0;
        // 初始化最大 1 的行索引为 0
        int rowIndex = 0;
        // 遍历二维数组的每一行
        for (int i = 0; i < mat.length; i++) {
            // 初始化当前行 1 的总数为 0
            int tot = 0;
            // 遍历当前行的每一个元素
            for (int j = 0; j < mat[i].length; j++) {
                // 累加当前行中 1 的数量
                tot += mat[i][j];
            }
            // 如果当前行 1 的总数大于最大 1 的数量
            if (tot > maxOnes) {
                // 更新最大 1 的数量
                maxOnes = tot;
                // 更新最大 1 的行索引
                rowIndex = i;
            }
        }
        // 返回包含行索引和最大 1 的数量的数组
        return new int[]{rowIndex, maxOnes};
    }
}
