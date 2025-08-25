package cn.techoc.leetcode.medium;

public class T189 {
    /**
     * 将给定数组向右旋转k个位置。
     *
     * @param nums 待旋转的整数数组
     * @param k    数组需要向右旋转的位置数
     */
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return;
        }
        k = k % nums.length;
        // 反转数组
        reverse(nums, 0, nums.length - 1);
        // 反转数组前k个元素
        reverse(nums, 0, k - 1);
        // 反转数组从k到末尾的元素
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
