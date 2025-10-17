package cn.techoc.leetcode.medium;

import cn.techoc.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * T82.deleteDuplicates(ListNode head) 的单元测试类
 */
class T82Test {

    private final T82 t82 = new T82();

    /**
     * 工具方法：将数组转换为链表
     */
    private ListNode arrayToList(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int num : nums) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummy.next;
    }

    /**
     * 工具方法：将链表转换为数组
     */
    private int[] listToArray(ListNode head) {
        if (head == null) return new int[0];
        int length = ListNode.getLength(head);
        int[] result = new int[length];
        ListNode current = head;
        int index = 0;
        while (current != null) {
            result[index++] = current.val;
            current = current.next;
        }
        return result;
    }

    @Test
    void testDeleteDuplicates_nullInput() {
        // 输入：null
        // 期望输出：null
        ListNode result = t82.deleteDuplicates(null);
        assertNull(result);
    }

    @Test
    void testDeleteDuplicates_singleNode() {
        // 输入：[1]
        // 期望输出：[1]
        ListNode head = arrayToList(new int[]{1});
        ListNode result = t82.deleteDuplicates(head);
        assertArrayEquals(new int[]{1}, listToArray(result));
    }

    @Test
    void testDeleteDuplicates_noDuplicates() {
        // 输入：[1,2,3]
        // 期望输出：[1,2,3]
        ListNode head = arrayToList(new int[]{1, 2, 3});
        ListNode result = t82.deleteDuplicates(head);
        assertArrayEquals(new int[]{1, 2, 3}, listToArray(result));
    }

    @Test
    void testDeleteDuplicates_duplicatesAtHead() {
        // 输入：[1,1,2]
        // 期望输出：[2]
        ListNode head = arrayToList(new int[]{1, 1, 2});
        ListNode result = t82.deleteDuplicates(head);
        assertArrayEquals(new int[]{2}, listToArray(result));
    }

    @Test
    void testDeleteDuplicates_duplicatesInMiddle() {
        // 输入：[1,2,2,3]
        // 期望输出：[1,3]
        ListNode head = arrayToList(new int[]{1, 2, 2, 3});
        ListNode result = t82.deleteDuplicates(head);
        assertArrayEquals(new int[]{1, 3}, listToArray(result));
    }

    @Test
    void testDeleteDuplicates_duplicatesAtTail() {
        // 输入：[1,2,3,3]
        // 期望输出：[1,2]
        ListNode head = arrayToList(new int[]{1, 2, 3, 3});
        ListNode result = t82.deleteDuplicates(head);
        assertArrayEquals(new int[]{1, 2}, listToArray(result));
    }

    @Test
    void testDeleteDuplicates_multipleDuplicates() {
        // 输入：[1,1,1,2,3]
        // 期望输出：[2,3]
        ListNode head = arrayToList(new int[]{1, 1, 1, 2, 3});
        ListNode result = t82.deleteDuplicates(head);
        assertArrayEquals(new int[]{2, 3}, listToArray(result));
    }

    @Test
    void testDeleteDuplicates_allDuplicates() {
        // 输入：[1,1,1,1]
        // 期望输出：[]
        ListNode head = arrayToList(new int[]{1, 1, 1, 1});
        ListNode result = t82.deleteDuplicates(head);
        assertArrayEquals(new int[]{}, listToArray(result));
    }

    @Test
    void testDeleteDuplicates_multipleNonContinuousDuplicates() {
        // 输入：[1,2,3,3,4,4,5]
        // 期望输出：[1,2,5]
        ListNode head = arrayToList(new int[]{1, 2, 3, 3, 4, 4, 5});
        ListNode result = t82.deleteDuplicates(head);
        assertArrayEquals(new int[]{1, 2, 5}, listToArray(result));
    }

}
