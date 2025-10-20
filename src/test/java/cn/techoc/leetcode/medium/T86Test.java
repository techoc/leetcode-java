package cn.techoc.leetcode.medium;

import cn.techoc.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 测试类：T86.partition(ListNode head, int x)
 */
class T86Test {

    private final T86 t86 = new T86();

    /**
     * TC01: 输入为null，期望返回null
     */
    @Test
    void testPartitionWithNullHead() {
        assertNull(t86.partition(null, 1));
    }

    /**
     * TC02: 输入为单节点链表，期望返回原链表
     */
    @Test
    void testPartitionWithSingleNode() {
        ListNode head = new ListNode(1);
        ListNode result = t86.partition(head, 2);
        assertEquals(1, result.val);
        assertNull(result.next);
    }

    /**
     * TC03: 普通情况，包含小于x和大于等于x的节点
     */
    @Test
    void testPartitionNormalCase() {
        ListNode head = new ListNode(new int[]{1, 4, 3, 2, 5, 2});
        ListNode result = t86.partition(head, 3);
        int[] expected = {1, 2, 2, 4, 3, 5};
        assertArrayEquals(expected, listToArray(result));
    }

    /**
     * TC04: 所有节点值都小于x
     */
    @Test
    void testPartitionAllLessThanX() {
        ListNode head = new ListNode(new int[]{2, 1});
        ListNode result = t86.partition(head, 2);
        int[] expected = {1, 2};
        assertArrayEquals(expected, listToArray(result));
    }

    /**
     * TC05: 所有节点值都大于等于x
     */
    @Test
    void testPartitionAllGreaterOrEqualX() {
        ListNode head = new ListNode(new int[]{3, 4, 5});
        ListNode result = t86.partition(head, 2);
        int[] expected = {3, 4, 5};
        assertArrayEquals(expected, listToArray(result));
    }

    /**
     * TC06: 所有节点值都等于x
     */
    @Test
    void testPartitionAllEqualX() {
        ListNode head = new ListNode(new int[]{1, 1, 1});
        ListNode result = t86.partition(head, 1);
        int[] expected = {1, 1, 1};
        assertArrayEquals(expected, listToArray(result));
    }

    /**
     * TC07: 逆序链表
     */
    @Test
    void testPartitionReverseOrder() {
        ListNode head = new ListNode(new int[]{5, 4, 3, 2, 1});
        ListNode result = t86.partition(head, 3);
        int[] expected = {2, 1, 5, 4, 3};
        assertArrayEquals(expected, listToArray(result));
    }

    /**
     * 辅助方法：将链表转换为数组，便于断言比较
     */
    private int[] listToArray(ListNode head) {
        if (head == null) return new int[0];
        int length = ListNode.getLength(head);
        int[] array = new int[length];
        int index = 0;
        while (head != null) {
            array[index++] = head.val;
            head = head.next;
        }
        return array;
    }
}
