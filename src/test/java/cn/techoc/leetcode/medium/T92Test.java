package cn.techoc.leetcode.medium;

import cn.techoc.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * T92 类的单元测试
 * 被测函数: reverseBetween(ListNode head, int left, int right)
 */
class T92Test {

    private final T92 t92 = new T92();

    /**
     * 工具方法：根据数组创建链表
     */
    private ListNode createLinkedList(int[] values) {
        if (values.length == 0) return null;
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        for (int val : values) {
            cur.next = new ListNode(val);
            cur = cur.next;
        }
        return dummy.next;
    }

    /**
     * 工具方法：将链表转换为数组便于断言
     */
    private int[] linkedListToArray(ListNode head) {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    @Test
    void testReverseMiddlePart() {
        // 输入: [1,2,3,4,5], left=2, right=4
        // 期望输出: [1,4,3,2,5]
        ListNode head = createLinkedList(new int[]{1, 2, 3, 4, 5});
        ListNode result = t92.reverseBetween(head, 2, 4);
        assertArrayEquals(new int[]{1, 4, 3, 2, 5}, linkedListToArray(result));
    }

    @Test
    void testReverseEntireList() {
        // 输入: [1,2,3], left=1, right=3
        // 期望输出: [3,2,1]
        ListNode head = createLinkedList(new int[]{1, 2, 3});
        ListNode result = t92.reverseBetween(head, 1, 3);
        assertArrayEquals(new int[]{3, 2, 1}, linkedListToArray(result));
    }

    @Test
    void testReverseSingleElement() {
        // 输入: [1,2,3], left=2, right=2
        // 期望输出: [1,2,3]
        ListNode head = createLinkedList(new int[]{1, 2, 3});
        ListNode result = t92.reverseBetween(head, 2, 2);
        assertArrayEquals(new int[]{1, 2, 3}, linkedListToArray(result));
    }

    @Test
    void testNullHead() {
        // 输入: null, left=1, right=1
        // 期望输出: null
        ListNode result = t92.reverseBetween(null, 1, 1);
        assertNull(result);
    }

    @Test
    void testSingleNodeList() {
        // 输入: [1], left=1, right=1
        // 期望输出: [1]
        ListNode head = createLinkedList(new int[]{1});
        ListNode result = t92.reverseBetween(head, 1, 1);
        assertArrayEquals(new int[]{1}, linkedListToArray(result));
    }
}
