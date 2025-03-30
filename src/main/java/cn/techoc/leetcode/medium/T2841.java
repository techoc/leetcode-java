package cn.techoc.leetcode.medium;

import java.util.HashMap;
import java.util.List;

public class T2841 {
    /**
     * <a href="https://leetcode.cn/problems/maximum-sum-of-almost-unique-subarray">2841. 几乎唯一子数组的最大和</a>
     *
     * @param nums 整数数组
     * @param m    整数
     * @param k    整数
     * @return 几乎唯一子数组的最大和
     */
    public long maxSum(List<Integer> nums, int m, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long sum = 0;
        int left = 0, right = 0;
        long max = 0;
        while (right < nums.size()) {
            int num = nums.get(right);
            sum += num;
            map.put(num, map.getOrDefault(num, 0) + 1);
            right++;
            while (right - left > k - 1) {    // 窗口满足条件 因为窗口为左闭右开 所以right - left > k - 1
                if (map.size() >= m) {  // 满足条件 计算最大值
                    max = Math.max(max, sum);
                }
                int leftNum = nums.get(left);
                map.put(leftNum, map.get(leftNum) - 1);
                sum -= leftNum;
                if (map.get(leftNum) == 0) {
                    map.remove(leftNum);
                }
                left++;
            }
        }
        return max;
    }
}
