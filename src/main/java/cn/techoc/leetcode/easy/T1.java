package cn.techoc.leetcode.easy;

import java.util.HashMap;

public class T1 {
    /**
     * <a href="https://leetcode.cn/problems/two-sum">1. 两数之和</a>
     * 从数组中找到两个数，使它们的和等于目标值。
     *
     * @param nums   整数数组
     * @param target 目标和
     * @return 一个包含两个整数的数组，这两个整数是nums中的索引，它们相加等于target。如果找不到这样的两个数，则返回空数组。
     */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (integerIntegerHashMap.containsKey(target - num)) {  // 存在满足 两数之和 的数
                return new int[]{integerIntegerHashMap.get(target - num), i};
            }
            integerIntegerHashMap.put(num, i);
        }
        return new int[0];
    }
}
