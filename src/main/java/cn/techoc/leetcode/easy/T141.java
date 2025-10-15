package cn.techoc.leetcode.easy;

import cn.techoc.leetcode.utils.ListNode;

public class T141 {
    /**
     * <a href="https://leetcode.cn/problems/linked-list-cycle">141. 环形链表</a>
     * 给定一个链表，判断链表中是否有环。
     *
     * @param head 链表头结点
     * @return 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。
     */
    public boolean hasCycle(ListNode head) {
        // 快慢指针
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;   // 慢指针每次移动一步
            fast = fast.next.next;  // 快指针每次移动两步
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
