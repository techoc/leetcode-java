package cn.techoc.leetcode.medium;

public class T209 {
    /**
     * <a href="https://leetcode.cn/problems/minimum-size-subarray-sum/">209. 长度最小的子数组</a>
     *
     * @param target 目标和
     * @param nums   数组
     * @return 最小长度
     */
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0;
        int sum = 0;
        int res = Integer.MAX_VALUE;
        while (right < nums.length) {
            int num = nums[right];
            right++;
            sum += num;

            // 收缩左边界
            while (sum >= target) {
                res = Math.min(res, right - left);  // 更新最小长度 要在左边界收缩之前更新最小长度
                int num2 = nums[left];  // 要移除的元素
                left++;  // 左边界右移
                sum -= num2;    // 减去要移除的元素
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
