package cn.techoc.leetcode.medium;

import cn.techoc.leetcode.utils.ListNode;

public class T2 {
    /**
     * <a href="https://leetcode.cn/problems/add-two-numbers">2. 两数相加</a>
     * 将两个非空链表表示的非负整数相加。每个节点包含一个数字，且数字按逆序存储（即个位数在链表头）。
     * 假设除了数字0本身之外，这些数字都不会以0开头。
     *
     * @param l1 第一个加数链表
     * @param l2 第二个加数链表
     * @return 代表两数之和的新链表
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwo(l1, l2, 0);
    }

    private ListNode addTwo(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null) {  // 递归边界
            return carry == 0 ? null : new ListNode(carry);
        }
        int val = carry;
        if (l1 != null) {
            val += l1.val;
        }
        if (l2 != null) {
            val += l2.val;
        }
        return new ListNode(val % 10, addTwo(l1 == null ? null : l1.next, l2 == null ? null : l2.next, val / 10));
    }
}
