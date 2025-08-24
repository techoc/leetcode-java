package cn.techoc.leetcode.easy;

public class T26 {
    /**
     * <a href="https://leetcode.cn/problems/remove-duplicates-from-sorted-array">26. 删除有序数组中的重复项</a>
     *
     * @param nums 有序数组
     * @return 无重复元素的数组长度
     */
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // 快慢指针
        int fast = 0, slow = 0;
        // 快指针遍历数组
        while (fast < nums.length) {
            if (nums[fast] == nums[slow]) { // 如果快指针和满指针值相等 则快指针后移
                fast++;
            } else { // 否则慢指针后移 并将快指针的值赋给慢指针
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
    }
}
