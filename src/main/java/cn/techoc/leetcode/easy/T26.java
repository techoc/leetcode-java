package cn.techoc.leetcode.easy;

public class T26 {
    /**
     * <a href="https://leetcode.cn/problems/remove-duplicates-from-sorted-array">26. 删除有序数组中的重复项</a>
     *
     * @param nums 有序数组
     * @return 无重复元素的数组长度
     */
    public int removeDuplicates(int[] nums) {
        // 快慢指针
        int slow = 0, fast = 1;
        while (fast < nums.length) {
            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        return slow + 1;
    }
}
