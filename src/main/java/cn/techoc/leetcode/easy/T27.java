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
        int fast = 0, slow = 0;
        // 快指针遍历数组
        while (fast < nums.length) {
            // 慢指针指向的元素不等于val
            if (nums[fast] != val) {
                // 慢指针后移 与快指针指向的元素相等
                nums[slow++] = nums[fast];
            }
            // 快指针后移
            fast++;
        }
        return slow;
    }
}
