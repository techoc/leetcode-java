package cn.techoc.leetcode.easy;

import cn.techoc.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * 测试类：T83.deleteDuplicates
 */
public class T83Test {

    private final T83 t83 = new T83();

    /**
     * 工具方法：将数组转换为链表
     */
    private ListNode arrayToList(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    /**
     * 工具方法：将链表转换为数组
     */
    private int[] listToArray(ListNode head) {
        if (head == null) return new int[0];
        java.util.List<Integer> list = new java.util.ArrayList<>();
        ListNode current = head;
        while (current != null) {
            list.add(current.val);
            current = current.next;
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    /**
     * TC01: 输入为 null，期望返回 null
     */
    @Test
    void testDeleteDuplicates_nullInput_returnsNull() {
        ListNode result = t83.deleteDuplicates(null);
        assertNull(result);
    }

    /**
     * TC02: 输入为单节点链表 [1]，期望返回 [1]
     */
    @Test
    void testDeleteDuplicates_singleNode_returnsSame() {
        ListNode head = new ListNode(1);
        ListNode result = t83.deleteDuplicates(head);
        assertArrayEquals(new int[]{1}, listToArray(result));
    }

    /**
     * TC03: 输入为 [1,1,2]，期望返回 [1,2]
     */
    @Test
    void testDeleteDuplicates_withDuplicates_returnsDeduplicated() {
        ListNode head = arrayToList(new int[]{1, 1, 2});
        ListNode result = t83.deleteDuplicates(head);
        assertArrayEquals(new int[]{1, 2}, listToArray(result));
    }

    /**
     * TC04: 输入为 [1,1,2,3,3]，期望返回 [1,2,3]
     */
    @Test
    void testDeleteDuplicates_multipleDuplicates_returnsDeduplicated() {
        ListNode head = arrayToList(new int[]{1, 1, 2, 3, 3});
        ListNode result = t83.deleteDuplicates(head);
        assertArrayEquals(new int[]{1, 2, 3}, listToArray(result));
    }

    /**
     * TC05: 输入为 [1,1,1,1]，期望返回 [1]
     */
    @Test
    void testDeleteDuplicates_allSame_returnsOne() {
        ListNode head = arrayToList(new int[]{1, 1, 1, 1});
        ListNode result = t83.deleteDuplicates(head);
        assertArrayEquals(new int[]{1}, listToArray(result));
    }

    /**
     * TC06: 输入为 [1,2,3,4,5]，期望返回 [1,2,3,4,5]
     */
    @Test
    void testDeleteDuplicates_noDuplicates_returnsSame() {
        ListNode head = arrayToList(new int[]{1, 2, 3, 4, 5});
        ListNode result = t83.deleteDuplicates(head);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, listToArray(result));
    }
}
