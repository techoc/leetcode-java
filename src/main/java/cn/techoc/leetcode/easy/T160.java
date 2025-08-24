package cn.techoc.leetcode.easy;

import cn.techoc.leetcode.utils.ListNode;

public class T160 {
    /**
     * <a href="https://leetcode.cn/problems/intersection-of-two-linked-lists">160. 相交链表</a>
     *
     * @param headA 链表A头节点
     * @param headB 链表B头节点
     * @return 相交节点
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pA = headA, pB = headB;
        while (pA != pB) {  //pA == pB时，即为相交节点
            //当pA遍历完链表A后，继续遍历链表B，当pB遍历完链表B后，继续遍历链表A，直到pA == pB
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }
}
