package cn.techoc.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class T228 {
    /**
     * <a href="https://leetcode.cn/problems/summary-ranges">228. 汇总区间</a>
     * 返回整数数组中连续数字范围的字符串表示形式列表。
     *
     * @param nums 整数数组
     * @return 一个列表，其中包含给定数组中连续数字范围的字符串表示形式。如果数组为空，则返回空列表。
     */
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums.length == 0) {
            return res;
        }
        for (int i = 0; i < nums.length; i++) {
            int start = i;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(nums[start]);
            // 循环 找到第一个不连续的数字
            while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {
                i++;
            }
            if (i > start) {    // 存在连续数字
                stringBuilder.append("->").append(nums[i]);
            }
            res.add(stringBuilder.toString());
        }
        return res;
    }
}
