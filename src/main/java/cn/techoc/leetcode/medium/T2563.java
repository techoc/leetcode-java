package cn.techoc.leetcode.medium;

import java.util.Arrays;

public class T2563 {
    /**
     * <a href="https://leetcode.cn/problems/count-the-number-of-fair-pairs/description">2563. 统计公平数对的数目</a>
     *
     * @param nums  数组
     * @param lower 下限
     * @param upper 上限
     * @return 公平数对的数目
     */
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int l = lowerBound(nums, i, lower - nums[i]);
            int r = lowerBound(nums, i, upper - nums[i] + 1);
            ans += r - l;
        }
        return ans;
    }

    private int lowerBound(int[] nums, int right, int target) {
        int left = -1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid;
            } else if (nums[mid] > target) {
                right = mid;
            } else if (nums[mid] == target) {
                right = mid;
            }
        }
        return right;
    }
}
