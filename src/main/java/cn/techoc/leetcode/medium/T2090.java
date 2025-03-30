package cn.techoc.leetcode.medium;

import java.util.Arrays;

public class T2090 {
    /**
     * <a href="https://leetcode.cn/problems/k-radius-subarray-averages/">2090. 半径为 k 的子数组平均值</a>
     *
     * @param nums 整数数组
     * @param k    子数组长度
     * @return 子数组最大平均数
     */
    public int[] getAverages(int[] nums, int k) {
        int left = 0, right = 0;
        long sum = 0L;  // 子数组和  可能超出 int 范围 所以用 long 类型
        int[] result = new int[nums.length];
        Arrays.fill(result, -1);
        while (right < nums.length) {
            sum += nums[right];
            right++;    // 右指针右移
            while (right - left >= 2 * k + 1) {  // 子数组长度为 2k+1 即右指针 - 左指针 = 2k 进入子数组计算
                result[right - k - 1] = (int) (sum / (2L * k + 1));  // 计算子数组最大平均数 即子数组和 / 子数组长度
                sum -= nums[left];
                left++;    // 左指针右移
            }
        }
        return result;
    }
}
