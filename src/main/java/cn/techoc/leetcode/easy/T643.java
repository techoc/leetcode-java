package cn.techoc.leetcode.easy;

public class T643 {
    /**
     * <a href="https://leetcode.cn/problems/maximum-average-subarray-i/">643. 子数组最大平均数 I</a>
     *
     * @param nums 整数数组
     * @param k    子数组长度
     * @return 子数组最大平均数
     */
    public double findMaxAverage(int[] nums, int k) {
        int left = 0, right = 0, sum = 0, max = Integer.MIN_VALUE;
        while (right < nums.length) {
            sum += nums[right];
            right++;
            if (right - left == k) {
                max = Math.max(max, sum);
                sum -= nums[left];
                left++;
            }
        }
        return (double) max / k;
    }
}
