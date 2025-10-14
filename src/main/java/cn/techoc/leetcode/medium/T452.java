package cn.techoc.leetcode.medium;

import java.util.Arrays;
import java.util.Comparator;

public class T452 {
    /**
     * <a href="https://leetcode.cn/problems/minimum-number-of-arrows-to-burst-balloons">452. 用最少数量的箭引爆气球</a>
     * 计算最少需要多少支箭可以射穿所有气球。
     * 每个气球以一个数组的形式表示，其中points[i] = [x_start, x_end]代表第i个气球的起始和结束位置。
     * 一支箭如果在某个点上，那么它会穿过所有在这个点上的气球。
     *
     * @param points 二维数组，每个元素为长度为2的一维数组，表示气球的起始和结束位置。
     * @return 最少需要的箭的数量。
     */
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
        // 按气球的左端点升序排序
        Arrays.sort(points, Comparator.comparingInt(point -> point[0]));

        int[][] res = new int[][]{};
        for (int[] point : points) {
            if (res.length == 0 || res[res.length - 1][1] < point[0]) {
                // res 数组中的最后一个气球的结束位置小于当前气球的起始位置，则将当前气球加入 res 数组中
                res = Arrays.copyOf(res, res.length + 1);
                res[res.length - 1] = point;
            } else {
                // res 数组中的最后一个气球与当前气球有重叠，则将当前气球与最后一个气球进行合并
                // 更新 res 数组中的最后一个气球的起始位置和结束位置
                res[res.length - 1][0] = Math.min(res[res.length - 1][0], point[0]);
                res[res.length - 1][1] = Math.min(res[res.length - 1][1], point[1]);
            }
        }
        return res.length;
    }
}
