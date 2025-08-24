package cn.techoc.leetcode.medium;

import cn.techoc.leetcode.utils.ListNode;

public class T142 {
    /**
     * <a href="https://leetcode.cn/problems/linked-list-cycle-ii">142. 环形链表 II</a>
     *
     * @param head 链表头节点
     * @return 环的起始节点
     */
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) { //判断是否有环
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) { //有环
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }
        slow = head;    //重置slow
        while (slow != fast) {  //快慢指针同时出发，再次相遇的节点即为环的起始节点
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
