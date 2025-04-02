package cn.techoc.leetcode.easy;

public class T704 {
    /**
     * <a href="https://leetcode.cn/problems/binary-search">704. 二分查找</a>
     *
     * @param nums   有序数组
     * @param target 目标值
     * @return 目标值的索引
     */
    public int search(int[] nums, int target) {
        int left = -1, right = nums.length;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                right = mid;
            } else if (nums[mid] < target) {
                left = mid;
            } else if (nums[mid] > target) {
                right = mid;
            }
        }
        if (right == nums.length || nums[right] != target) {
            return -1;
        }
        return right;
    }
}
