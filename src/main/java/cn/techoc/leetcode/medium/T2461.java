package cn.techoc.leetcode.medium;

import java.util.HashMap;

public class T2461 {
    /**
     * <a href="https://leetcode.cn/problems/maximum-sum-of-distinct-subarrays-with-length-k">2461. 长度为 K 子数组中的最大和</a>
     *
     * @param nums 1 <= nums.length <= 10^5
     * @param k    1 <= k <= 10^5
     * @return -1
     */
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long sum = 0;
        long maxSum = 0;
        int left = 0, right = 0;
        while (right < nums.length) {
            sum += nums[right];
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            right++;
            while (right - left >= k) {
                if (map.size() == k) {  // 窗口内元素不重复 更新最大值
                    maxSum = Math.max(maxSum, sum);
                }
                sum -= nums[left];
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                left++;
            }
        }
        return maxSum;
    }
}
