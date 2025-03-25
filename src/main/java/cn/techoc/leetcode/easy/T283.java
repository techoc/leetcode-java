package cn.techoc.leetcode.easy;

public class T283 {
    /**
     * <a href="https://leetcode.cn/problems/move-zeroes">283. 移动零</a>
     *
     * @param nums 数组
     */
    public void moveZeroes(int[] nums) {
        int fast = 0, slow = 0;
        while (fast < nums.length) {
            if (nums[fast] != 0) {
                nums[slow++] = nums[fast];
            }
            fast++;
        }
        // 后面的元素全部置为0
        for (int i = slow; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

}
