package cn.techoc.leetcode.easy;

import cn.techoc.leetcode.utils.ListNode;

public class T206 {
    /**
     * <a href="https://leetcode.cn/problems/reverse-linked-list">206. 反转链表</a>
     *
     * @param head 链表头结点
     * @return 反转后的链表头结点
     */
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre; // 头插法
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
