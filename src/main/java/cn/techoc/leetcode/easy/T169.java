package cn.techoc.leetcode.easy;

public class T169 {
    /**
     * <a href="https://leetcode.cn/problems/majority-element">169. 多数元素</a>
     *
     * @param nums 数组
     * @return 多数元素
     */
    public int majorityElement(int[] nums) {
        // 投票算法
        int count = 0, candidate = 0;
        for (int num : nums) {
            if (count == 0) {   // 如果 票数等于0，则将当前元素作为候选者
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;   // 如果当前元素等于候选者，则增加票数，否则减少票数
        }
        return candidate;
    }
}
