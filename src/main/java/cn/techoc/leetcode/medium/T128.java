package cn.techoc.leetcode.medium;

import java.util.HashSet;

public class T128 {
    /**
     * <a href="https://leetcode.cn/problems/longest-consecutive-sequence">128. 最长连续序列</a>
     * 寻找给定整数数组中最长的连续序列长度。
     *
     * @param nums 整数数组
     * @return 最长连续序列的长度
     */
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int res = 0;
        for (Integer i : set) {
            if (set.contains(i - 1)) {  // 存在前一个值 则不是序列的起点 跳过
                continue;
            }
            int y = i + 1;  // 存在下一个值 是否存在
            while (set.contains(y)) {
                y++;
            }
            // 找到当前最大连续序列长度
            res = Math.max(res, y - i);
            if (res * 2 >= set.size()) { // 当前序列长度大于数组长度的一半时 已经可以确定返回结果 提前返回
                return res;
            }
        }
        return res;
    }
}
