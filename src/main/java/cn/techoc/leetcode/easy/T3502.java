package cn.techoc.leetcode.easy;

public class T3502 {
    /**
     * <a href="https://leetcode.cn/problems/minimum-cost-to-reach-every-position">3502. 到达每个位置的最小费用</a>
     *
     * @param cost 长度为 n 的整数数组 cost ，其中 cost[i] 是从下标 i 移动到下标 (i + 1) 所需的费用。
     * @return 返回一个长度为 n 的整数数组 answer ，其中 answer[i] 是从下标 0 移动到下标 i 的最小费用。
     */
    public int[] minCosts(int[] cost) {
        int min = cost[0];
        int[] res = new int[cost.length];
        for (int i = 0; i < cost.length; i++) { // 从左往右遍历
            if (cost[i] < min) {              // 若当前元素小于最小值，则更新最小值
                min = cost[i];
                res[i] = cost[i];
            } else {                           // 否则，将最小值赋给当前元素
                res[i] = min;
            }
        }
        return res;
    }
}
