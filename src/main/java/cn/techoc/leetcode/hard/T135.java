package cn.techoc.leetcode.hard;

public class T135 {
    /**
     * <a href="https://leetcode.cn/problems/candy">135. 分发糖果</a>
     *
     * @param ratings 评分
     * @return 最少糖果数
     */
    public int candy(int[] ratings) {
        if (ratings == null || ratings.length == 0) {
            return 0;
        }
        int n = ratings.length;
        int ans = n;    // 默认每个孩子至少分配一个糖果
        for (int i = 0; i < n; i++) {
            int start = i > 0 && ratings[i - 1] < ratings[i] ? i - 1 : i;   // 山开始的地方

            // 找严格递增段
            while (i + 1 < n && ratings[i] < ratings[i + 1]) {
                i++;
            }
            int top = i; // 峰顶

            // 找严格递减段 i 为山结束的地方
            while (i + 1 < n && ratings[i] > ratings[i + 1]) {
                i++;
            }

            int inc = top - start; // start 到 top 严格递增
            int dec = i - top;     // top 到 i 严格递减
            ans += (inc * (inc - 1) + dec * (dec - 1)) / 2 + Math.max(inc, dec);
        }
        return ans;
    }
}
