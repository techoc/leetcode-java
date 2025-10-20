package cn.techoc.leetcode.medium;

import cn.techoc.leetcode.utils.ListNode;

public class T86 {
    /**
     * <a href="https://leetcode.cn/problems/partition-list/">86. 分隔链表</a>
     * 将给定的链表根据值x进行分区，使得所有小于x的节点都出现在大于或等于x的节点之前。
     * 分区后保持原有节点的相对顺序不变。
     *
     * @param head 链表头节点
     * @param x    用于分区的基准值
     * @return 分区后的链表头节点
     */
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) return head;
        // 创建两个虚拟头节点，分别用于存储小于x和大于等于x的节点
        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        ListNode pre1 = dummy1;
        ListNode pre2 = dummy2;
        // 遍历原链表，将节点分别添加到两个链表中
        while (head != null) {
            if (head.val < x) {
                pre1.next = head;
                pre1 = pre1.next;
            } else {
                pre2.next = head;
                pre2 = pre2.next;
            }
            head = head.next;
        }
        // 连接两个链表，将小于x的链表尾部连接到大于等于x的链表头部
        pre1.next = dummy2.next;
        pre2.next = null;
        return dummy1.next;
    }

}
