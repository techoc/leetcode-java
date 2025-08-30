package cn.techoc.leetcode.hard;

import cn.techoc.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * 对 T25 类中的 reverseKGroup 方法进行单元测试
 */
class T25Test {

    private final T25 t25 = new T25();

    /**
     * 工具方法：将数组转换为链表
     */
    private ListNode arrayToList(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        for (int val : arr) {
            cur.next = new ListNode(val);
            cur = cur.next;
        }
        return dummy.next;
    }

    /**
     * 工具方法：将链表转换为数组
     */
    private int[] listToArray(ListNode head) {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    @Test
    void testReverseKGroup_NullHead() {
        // 测试输入：head = null, k = 2
        ListNode result = t25.reverseKGroup(null, 2);
        assertNull(result);
    }

    @Test
    void testReverseKGroup_SingleNode() {
        // 测试输入：head = [1], k = 2
        ListNode head = arrayToList(new int[]{1});
        ListNode result = t25.reverseKGroup(head, 2);
        assertArrayEquals(new int[]{1}, listToArray(result));
    }

    @Test
    void testReverseKGroup_KGreaterThanLength() {
        // 测试输入：head = [1,2], k = 3
        ListNode head = arrayToList(new int[]{1, 2});
        ListNode result = t25.reverseKGroup(head, 3);
        assertArrayEquals(new int[]{1, 2}, listToArray(result));
    }

    @Test
    void testReverseKGroup_ExactDivision() {
        // 测试输入：head = [1,2,3,4], k = 2
        ListNode head = arrayToList(new int[]{1, 2, 3, 4});
        ListNode result = t25.reverseKGroup(head, 2);
        assertArrayEquals(new int[]{2, 1, 4, 3}, listToArray(result));
    }

    @Test
    void testReverseKGroup_RemainderExists() {
        // 测试输入：head = [1,2,3,4,5], k = 3
        ListNode head = arrayToList(new int[]{1, 2, 3, 4, 5});
        ListNode result = t25.reverseKGroup(head, 3);
        assertArrayEquals(new int[]{3, 2, 1, 4, 5}, listToArray(result));
    }
}
