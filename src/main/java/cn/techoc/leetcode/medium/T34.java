package cn.techoc.leetcode.medium;

public class T34 {
    /**
     * <a href="https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array">34. 在排序数组中查找元素的第一个和最后一个位置</a>     * @param nums
     *
     * @param target 目标值
     * @return 目标值的索引
     */
    public int[] searchRange(int[] nums, int target) {
        int left = lowerBound(nums, target);
        if (left == nums.length || nums[left] != target) {
            return new int[]{-1, -1};
        }
        int right = lowerBound(nums, target + 1) - 1;
        return new int[]{left, right};
    }

    private int lowerBound(int[] nums, int target) {
        int left = -1, right = nums.length; // 开区间 (left, right)
        while (left + 1 < right) {  // 区间不为空
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                right = mid;
            } else if (nums[mid] < target) {
                left = mid;
            } else if (nums[mid] > target) {
                right = mid;
            }
        }
        return right;
    }
}
