package cn.techoc.leetcode.medium;

public class T55 {
    /**
     * <a href="https://leetcode.cn/problems/jump-game">55. 跳跃游戏</a>
     *
     * @param nums 非负整数数组
     * @return 是否可以跳到最后一个位置
     */
    public boolean canJump(int[] nums) {
        int mx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > mx) {   // 当前位置超过最大跳跃距离
                return false;
            }
            mx = Math.max(mx, i + nums[i]); // 更新能跳的最大距离
        }
        return true;
    }
}
