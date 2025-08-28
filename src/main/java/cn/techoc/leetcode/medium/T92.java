package cn.techoc.leetcode.medium;

import cn.techoc.leetcode.utils.ListNode;

public class T92 {

    /**
     * <a href="https://leetcode.cn/problems/reverse-linked-list-ii">92. 反转链表 II</a>
     *
     * @param head  链表头结点
     * @param left  开始位置
     * @param right 结束位置
     * @return 反转后的链表头结点
     */

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null) {
            return head;
        }
        // 初始化虚拟头节点
        ListNode dummy = new ListNode(-1, head);
        ListNode pre = dummy;
        for (int i = 0; i < left - 1; i++) {    // 获取 left - 1 节点
            pre = pre.next;
        }
        // 开始反转
        ListNode cur = pre.next;
        ListNode pre1 = null;
        for (int i = 0; i < right - left + 1; i++) {
            ListNode next = cur.next;
            cur.next = pre1;
            pre1 = cur;
            cur = next;
        }
        pre.next.next = cur;
        pre.next = pre1;
        return dummy.next;
    }
}
