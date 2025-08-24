package cn.techoc.leetcode.easy;

public class T27 {
    /**
     * <a href="https://leetcode.cn/problems/remove-element">27. 移除元素</a>
     *
     * @param nums 数组
     * @param val  元素
     * @return 数组长度
     */
    public int removeElement(int[] nums, int val) {
        // 初始化快慢指针
        int slow = 0, fast = 0;
        while (fast < nums.length) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
