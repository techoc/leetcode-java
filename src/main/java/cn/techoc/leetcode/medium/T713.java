package cn.techoc.leetcode.medium;

public class T713 {
    /**
     * <a href="https://leetcode.cn/problems/subarray-product-less-than-k">713. 乘积小于 K 的子数组</a>
     *
     * @param nums 长度为 n 的正整数数组 nums
     * @param k    正整数 k
     * @return 返回 nums 中乘积小于 k 的连续子数组的个数。
     */
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }
        int left = 0, right = 0, count = 0, product = 1;
        while (right < nums.length) {
            product = product * nums[right];
            right++;
            while (product >= k) {
                product = product / nums[left];
                left++;
            }
            count += right - left;
        }
        return count;
    }
}
