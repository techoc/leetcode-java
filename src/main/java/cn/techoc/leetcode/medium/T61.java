package cn.techoc.leetcode.medium;

import cn.techoc.leetcode.utils.ListNode;

public class T61 {
    /**
     * <a href="https://leetcode.cn/problems/rotate-list/">61. 旋转链表</a>
     * 将给定的链表向右旋转k个位置。
     *
     * @param head 链表的头节点
     * @param k    向右旋转的位置数
     * @return 旋转后的链表头节点
     */
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // 初始化快慢指针
        ListNode fast = head;
        ListNode slow = head;

        // 计算链表长度
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            length++;
        }

        // 如果k是length的倍数，则不需要旋转
        k = k % length;
        if (k == 0) {
            return head;
        }

        // 让快指针先走k步
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }

        // 快慢指针同时移动，直到快指针到达最后一个节点
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // 此时slow指向新尾节点，slow.next指向新头节点
        ListNode newHead = slow.next;
        slow.next = null;  // 断开链表
        fast.next = head;  // 连接原尾节点到原头节点

        return newHead;
    }
}
