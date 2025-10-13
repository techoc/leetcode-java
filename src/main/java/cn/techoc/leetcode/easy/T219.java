package cn.techoc.leetcode.easy;

import org.jetbrains.annotations.Nullable;

import java.util.HashSet;

public class T219 {
    /**
     * <a href="https://leetcode.cn/problems/contains-duplicate-ii">219. 存在重复元素 II</a>
     * 检查数组中是否存在距离不超过k的重复元素。
     *
     * @param nums 整数数组
     * @param k    两个相同元素之间的最大允许距离
     * @return 如果存在这样的重复元素，则返回true；否则返回false。
     */
    public boolean containsNearbyDuplicate(int @Nullable [] nums, int k) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) { // set 中有 nums[i]
                return true;
            }
            if (i >= k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}
