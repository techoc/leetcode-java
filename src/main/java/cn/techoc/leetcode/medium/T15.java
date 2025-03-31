package cn.techoc.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T15 {
    /**
     * <a href="https://leetcode.cn/problems/3sum/description">15. 三数之和</a>
     *
     * @param nums 整数数组
     * @return 不允许重复的三元组
     */
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int x = nums[i];
            if (i > 0 && nums[i] == nums[i - 1]) {  // 与前一个数相同，跳过
                continue;
            }
            if (x + nums[i + 1] + nums[i + 2] > 0) {    // 最小的三个数大于0，结束
                break;
            }
            if (x + nums[nums.length - 1] + nums[nums.length - 2] < 0) { // 最大的三个数小于0，结束
                continue;
            }
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int y = nums[j], z = nums[k];
                int sum = x + y + z;
                if (sum > 0) {  // 三数之和大于0，右指针左移
                    k--;
                } else if (sum < 0) {  // 三数之和小于0，左指针右移
                    j++;
                } else {  // 三数之和等于0，添加到结果中
                    result.add(Arrays.asList(x, y, z));
                    j++;
                    while (j < k && nums[j] == nums[j - 1]) {  // 与前一个数相同，跳过
                        j++;
                    }
                    k--;
                    while (j < k && nums[k] == nums[k + 1]) {  // 与后一个数相同，跳过
                        k--;
                    }
                }
            }
        }
        return result;
    }
}
