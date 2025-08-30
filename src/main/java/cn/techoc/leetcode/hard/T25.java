package cn.techoc.leetcode.hard;

import cn.techoc.leetcode.utils.ListNode;

public class T25 {
    /**
     * <a href="https://leetcode.cn/problems/reverse-nodes-in-k-group">25. K 个一组翻转链表</a>
     *
     * @param head 链表头结点
     * @param k    组长度
     * @return 反转后的链表头结点
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        // 计算链表长度
        int length = 0;
        ListNode pre1 = head;
        while (pre1 != null) {
            pre1 = pre1.next;
            length++;
        }

        // 开始按组遍历反转
        ListNode dummy = new ListNode(-1, head);
        ListNode p0 = dummy;
        ListNode pre = null;
        ListNode cur = p0.next;
        while (length >= k) {    // 剩余的组数
            length -= k;

            for (int i = 0; i < k; i++) {
                ListNode next = cur.next;   // 暂存下一个节点
                cur.next = pre; // 反转
                pre = cur;  // 移动当前节点
                cur = next; // 移动下一个节点
            }
            ListNode next = p0.next;
            p0.next.next = cur;
            p0.next = pre;
            p0 = next;
        }
        return dummy.next;
    }
}
