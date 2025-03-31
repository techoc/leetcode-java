package cn.techoc.leetcode.medium;

public class T167 {
    /**
     * <a href="https://leetcode.cn/problems/two-sum-ii-input-array-is-sorted">167. 两数之和 II - 输入有序数组</a>
     *
     * @param numbers 升序排列的整数数组
     * @param target  目标值
     * @return 两个数的下标值
     */
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }
}
