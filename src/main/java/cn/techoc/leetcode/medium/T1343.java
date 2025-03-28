package cn.techoc.leetcode.medium;

public class T1343 {
    /**
     * <a href="https://leetcode.cn/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold">1343. 大小为 K 且平均值大于等于阈值的子数组数目</a>
     *
     * @param arr       整数数组
     * @param k         子数组长度
     * @param threshold 平均值阈值
     * @return 子数组数目
     */
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left = 0, right = 0, sum = 0, count = 0;
        while (right < arr.length) {
            sum += arr[right];
            right++;
            if (right - left == k) {
                if (sum >= threshold * k) { // 平均值大于等于阈值
                    count++;
                }
                sum -= arr[left];
                left++;
            }
        }
        return count;
    }
}
