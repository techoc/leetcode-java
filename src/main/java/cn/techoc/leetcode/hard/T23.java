package cn.techoc.leetcode.hard;

import cn.techoc.leetcode.utils.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class T23 {
    /**
     * <a href="https://leetcode.cn/problems/merge-k-sorted-lists/">23. 合并 K 个升序链表</a>
     *
     * @param lists 列表
     * @return listNode
     */
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        PriorityQueue<ListNode> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.val));
        for (ListNode list : lists) {
            if (list != null) {
                pq.offer(list); // 把所有非空链表的头节点入堆
            }
        }
        ListNode dummy = new ListNode(); // 哨兵节点，作为合并后链表头节点的前一个节点
        ListNode cur = dummy;
        while (!pq.isEmpty()) { // 循环直到堆为空
            ListNode node = pq.poll(); // 剩余节点中的最小节点
            if (node.next != null) { // 下一个节点不为空
                pq.offer(node.next); // 下一个节点有可能是最小节点，入堆
            }
            cur.next = node; // 把 node 添加到新链表的末尾
            cur = cur.next; // 准备合并下一个节点
        }
        return dummy.next; // 哨兵节点的下一个节点就是新链表的头节点
    }
}
