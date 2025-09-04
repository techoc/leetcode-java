package cn.techoc.leetcode.medium;

import cn.techoc.leetcode.utils.ListNode;

public class T445 {
    /**
     * <a href="https://leetcode.cn/problems/add-two-numbers-ii">445. 两数相加 II</a>
     *
     * @param l1 第一个链表
     * @param l2 第二个链表
     * @return 表示两数之和的链表
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 反转链表
        l1 = reverseList(l1);
        l2 = reverseList(l2);
        // 将两个链表相加
        ListNode l3 = addTwo(l1, l2, 0);
        // 反转链表
        return reverseList(l3);
    }

    private ListNode addTwo(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null) {  // 两个链表都为空 递归边界
            return carry == 0 ? null : new ListNode(carry); // 如果进位了，就额外创建一个节点
        }
        if (l1 == null) { // 如果 l1 是空的，那么此时 l2 一定不是空节点
            l1 = l2;
            l2 = null; // 交换 l1 与 l2，保证 l1 非空，从而简化代码
        }
        carry += l1.val + (l2 == null ? 0 : l2.val);    //节点值和进位加在一起
        l1.val = carry % 10;    // 节点值只保留个位
        l1.next = addTwo(l1.next, l2 == null ? null : l2.next, carry / 10); //  开始递归
        return l1;
    }

    private ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
