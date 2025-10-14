package cn.techoc.leetcode.medium;

import java.util.Arrays;
import java.util.Comparator;

public class T56 {
    /**
     * <a href="https://leetcode.cn/problems/merge-intervals">56. 合并区间</a>
     * 合并区间。
     *
     * @param intervals 二维数组，表示一系列需要合并的区间。每个区间用一个长度为2的一维数组表示，其中第一个元素是区间的起始位置，第二个元素是区间的结束位置。
     * @return 返回一个新的二维数组，表示合并后的不重叠区间列表。
     */
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][2];
        }
        // 按区间起始位置升序排序
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));

        int[][] res = new int[][]{};
        for (int[] interval : intervals) {
            int m = res.length;
            if (m == 0 || res[m - 1][1] < interval[0]) {
                // 当前区间的起始位置大于 res 数组中的最后一个区间的结束位置，则将当前区间加入 res 数组中
                res = Arrays.copyOf(res, m + 1);
                res[m] = interval;
            } else {
                // 当前区间与 res 数组中的最后一个区间有重叠，则将当前区间与最后一个区间进行合并
                res[m - 1][1] = Math.max(res[m - 1][1], interval[1]);
            }
        }
        return res;
    }
}
