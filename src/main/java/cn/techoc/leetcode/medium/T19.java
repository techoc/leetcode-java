package cn.techoc.leetcode.medium;

import cn.techoc.leetcode.utils.ListNode;

public class T19 {
    /**
     * <a href="https://leetcode.cn/problems/remove-nth-node-from-end-of-list/">19. 删除链表的倒数第 N 个结点</a>
     *
     * @param head 链表头节点
     * @param n    倒数第n个节点
     * @return 删除节点后的链表头节点
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(-1, head);
        ListNode fast = dummy;
        ListNode slow = dummy;
        int len = 0;
        while (fast != null) {  // fast先走n步
            len++;
            fast = fast.next;
            if (len == n) {
                break;
            }
        }
        if (fast != null) {  // 判断一下
            while (fast.next != null) { // 再一起走 直到 fast 走到末尾 则 slow 走到倒数第n个节点
                fast = fast.next;
                slow = slow.next;
            }
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
