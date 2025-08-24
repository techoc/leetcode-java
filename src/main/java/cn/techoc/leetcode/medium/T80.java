package cn.techoc.leetcode.medium;

public class T80 {

    /**
     * <a href="https://leetcode.cn/problems/remove-duplicates-from-sorted-array-ii">80. 删除有序数组中的重复项 II</a>
     *
     * @param nums 数组
     * @return 删除重复元素后的数组长度
     */
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // 初始化虚拟栈大小
        int stackSize = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[stackSize - 2]) {   // 栈顶元素和当前元素不相等
                nums[stackSize++] = nums[i];    // 将当前元素入栈
            }
        }
        return stackSize;
    }
}
