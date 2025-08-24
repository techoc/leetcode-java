package cn.techoc.leetcode.easy;

import cn.techoc.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * @author techoc
 * @since 2025/04/05
 */
class T160Test {

    private final T160 t160 = new T160();

    /**
     * 测试用例1：两个链表相交
     * 链表A: 4 -> 1 -> 8 -> 4 -> 5
     * 链表B: 5 -> 6 -> 1 -> 8 -> 4 -> 5
     * 相交节点为8
     */
    @Test
    void testGetIntersectionNode_Intersecting() {
        // 构造相交部分
        ListNode common = new ListNode(8);
        common.next = new ListNode(4);
        common.next.next = new ListNode(5);

        // 构造链表A
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = common;

        // 构造链表B
        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = common;

        ListNode result = t160.getIntersectionNode(headA, headB);
        assertEquals(common, result);
    }

    /**
     * 测试用例2：两个链表不相交
     * 链表A: 1 -> 2 -> 3
     * 链表B: 4 -> 5 -> 6
     */
    @Test
    void testGetIntersectionNode_NotIntersecting() {
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = new ListNode(3);

        ListNode headB = new ListNode(4);
        headB.next = new ListNode(5);
        headB.next.next = new ListNode(6);

        ListNode result = t160.getIntersectionNode(headA, headB);
        assertNull(result);
    }

    /**
     * 测试用例3：其中一个链表为空
     * headA: null
     * headB: 1 -> 2
     */
    @Test
    void testGetIntersectionNode_OneNull() {
        ListNode headB = new ListNode(1);
        headB.next = new ListNode(2);

        ListNode result = t160.getIntersectionNode(null, headB);
        assertNull(result);

        result = t160.getIntersectionNode(headB, null);
        assertNull(result);
    }

    /**
     * 测试用例4：两个链表都为空
     */
    @Test
    void testGetIntersectionNode_BothNull() {
        ListNode result = t160.getIntersectionNode(null, null);
        assertNull(result);
    }

    /**
     * 测试用例5：两个链表完全相同
     */
    @Test
    void testGetIntersectionNode_Identical() {
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = new ListNode(3);

        ListNode result = t160.getIntersectionNode(headA, headA);
        assertEquals(headA, result);
    }

    /**
     * 测试用例6：链表长度不同但相交
     * 链表A: 1 -> 2 -> 3 -> 4
     * 链表B:       5 -> 3 -> 4
     * 相交节点为3
     */
    @Test
    void testGetIntersectionNode_DifferentLength() {
        ListNode common = new ListNode(3);
        common.next = new ListNode(4);

        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = common;

        ListNode headB = new ListNode(5);
        headB.next = common;

        ListNode result = t160.getIntersectionNode(headA, headB);
        assertEquals(common, result);
    }
}
