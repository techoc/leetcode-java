package cn.techoc.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T15 {
    /**
     * <a href="https://leetcode.cn/problems/3sum/description">15. 三数之和</a>
     * <p>
     * 给定一个整数数组，找出所有和为 0 且不重复的三元组。
     * 使用排序加双指针的方法来避免暴力枚举，并通过跳过重复元素来保证结果不重复。
     *
     * @param nums 整数数组
     * @return 所有不重复的三元组，其和为 0
     */
    public List<List<Integer>> threeSum(int[] nums) {
        // 先对数组进行排序，便于后续使用双指针法以及去重处理
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        // 遍历数组，固定第一个数作为三元组的第一个元素
        for (int i = 0; i < nums.length - 2; i++) {
            int x = nums[i];

            // 跳过重复的第一个数字以避免重复的三元组
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // 剪枝：如果当前数与接下来两个最小的数之和都大于0，则不可能存在满足条件的三元组
            if (x + nums[i + 1] + nums[i + 2] > 0) {
                break;
            }

            // 剪枝：如果当前数与最后两个最大的数之和仍小于0，则当前数无法构成有效三元组
            if (x + nums[nums.length - 1] + nums[nums.length - 2] < 0) {
                continue;
            }

            // 双指针法寻找另外两个数
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int y = nums[left], z = nums[right];
                int sum = x + y + z;

                if (sum > 0) {
                    // 和太大，右指针左移尝试更小的数
                    right--;
                } else if (sum < 0) {
                    // 和太小，左指针右移尝试更大的数
                    left++;
                } else {
                    // 找到符合条件的三元组，加入结果集
                    result.add(Arrays.asList(x, y, z));

                    // 移动左指针并跳过重复元素
                    left++;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // 移动右指针并跳过重复元素
                    right--;
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
            }
        }
        return result;
    }
}
