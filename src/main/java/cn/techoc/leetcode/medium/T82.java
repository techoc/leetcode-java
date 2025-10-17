package cn.techoc.leetcode.medium;

import cn.techoc.leetcode.utils.ListNode;

public class T82 {
    /**
     * <a href="https://leetcode.cn/problems/remove-duplicates-from-sorted-list-ii">82. 删除排序链表中的重复元素 II</a>
     * 删除排序链表中的重复元素，仅保留每个重复元素的第一个。
     *
     * @param head 链表的头节点
     * @return 修改后的链表头节点
     */
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(Integer.MIN_VALUE, head);
        ListNode cur = dummy;
        while (cur.next != null && cur.next.next != null) {
            int val = cur.next.val;
            if (val == cur.next.next.val) { // 后两个节点的值相等
                while (cur.next != null && cur.next.val == val) {   // 删除重复的节点
                    cur.next = cur.next.next;
                }
            } else {
                cur = cur.next; // 移动到下一个节点
            }
        }
        return dummy.next;
    }
}