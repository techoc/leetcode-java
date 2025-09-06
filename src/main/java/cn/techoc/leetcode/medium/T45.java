package cn.techoc.leetcode.medium;

public class T45 {
    /**
     * <a href="https://leetcode.cn/problems/jump-game-ii">45. 跳跃游戏 II</a>
     *
     * @param nums 数组
     * @return 跳跃次数
     */
    public int jump(int[] nums) {
        int step = 0;
        int curEnd = 0; // 当前覆盖的最远距离
        int nextEnd = 0;    // 下一步覆盖的最远距离
        for (int i = 0; i < nums.length - 1; i++) {
            nextEnd = Math.max(nextEnd, i + nums[i]);
            if (i == curEnd) {
                step++;
                curEnd = nextEnd;
            }
        }
        return step;
    }
}
