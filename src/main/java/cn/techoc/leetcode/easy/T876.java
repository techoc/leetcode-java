package cn.techoc.leetcode.easy;

import cn.techoc.leetcode.utils.ListNode;

public class T876 {
    /**
     * <a href="https://leetcode.cn/problems/middle-of-the-linked-list/">876. 链表的中间结点</a>
     *
     * @param head 链表头节点
     * @return 链表中间节点
     */
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) { // fast.next != null 是为了防止fast.next.next出现空指针异常
            slow = slow.next;   // slow走一步
            fast = fast.next.next;  // fast走两步
        }
        return slow;
    }
}
