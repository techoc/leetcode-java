package cn.techoc.leetcode.medium;

import java.util.Arrays;
import java.util.Comparator;

public class T57 {
    /**
     * <a href="https://leetcode.cn/problems/insert-interval">57. 插入区间</a>
     * 给你一个 无重叠的 ，按照区间起始端点排序的区间列表。
     * 在列表中插入一个新的区间，你需要确保列表中的区间仍然有序且不重叠（如果有必要的话，可以合并区间）。
     *
     * @param intervals   无重叠的，按照区间起始端点排序的区间列表
     * @param newInterval 新的区间
     * @return 合并后的区间列表
     **/
    public int[][] insert(int[][] intervals, int[] newInterval) {
        // 将 newInterval 插入到 intervals 中
        intervals = Arrays.copyOf(intervals, intervals.length + 1);
        intervals[intervals.length - 1] = newInterval;

        // 排序
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));

        int[][] res = new int[][]{};
        for (int[] interval : intervals) {
            if (res.length == 0 || res[res.length - 1][1] < interval[0]) {
                // 当前区间的起始位置大于 res 数组中的最后一个区间的结束位置，则将当前区间加入 res 数组中
                res = Arrays.copyOf(res, res.length + 1);
                res[res.length - 1] = interval;
            } else {
                // 当前区间与 res 数组中的最后一个区间有重叠，则将当前区间与最后一个区间进行合并
                res[res.length - 1][1] = Math.max(res[res.length - 1][1], interval[1]);
            }
        }
        return res;
    }
}
