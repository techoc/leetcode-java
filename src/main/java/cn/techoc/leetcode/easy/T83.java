package cn.techoc.leetcode.easy;

import cn.techoc.leetcode.utils.ListNode;

public class T83 {
    /**
     * <a href="https://leetcode.cn/problems/remove-duplicates-from-sorted-list">83. 删除排序链表中的重复元素</a>
     *
     * @param head 链表头节点
     * @return 删除重复元素后的链表头节点
     */
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head, fast = head.next;
        while (fast != null) {
            if (fast.val != slow.val) { // 找到一个不重复的节点，就将其插入到slow的后面
                slow.next = fast;
                slow = slow.next;
            }
            fast = fast.next;
        }
        // 断开与后面重复元素的连接
        slow.next = null;
        return head;
    }
}
