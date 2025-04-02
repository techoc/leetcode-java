package cn.techoc.leetcode.easy;

public class T2529 {
    /**
     * <a href="https://leetcode.cn/problems/maximum-count-of-positive-integer-and-negative-integer">2529. 正整数和负整数的最大计数</a>
     *
     * @param nums 非递减顺序排列的数组
     * @return 返回正整数和负整数的最大计数
     */
    public int maximumCount(int[] nums) {
        int neg = lowerBound(nums, 0);    // 找第一个大于等于0的元素
        int pos = nums.length - lowerBound(nums, 1);
        return Math.max(neg, pos);
    }

    private int lowerBound(int[] nums, int target) {
        int left = -1, right = nums.length;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                right = mid;    // 边界左缩 找到第一个等于target的元素
            } else if (nums[mid] < target) {
                left = mid;
            } else if (nums[mid] > target) {
                right = mid;
            }
        }
        return right;
    }
}
