package cn.techoc.leetcode.easy;

import cn.techoc.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * 206. 反转链表 单元测试
 */
class T206Test {

    private final T206 t206 = new T206();

    /**
     * 工具方法：根据数组构造链表
     */
    private ListNode buildList(int[] values) {
        if (values == null || values.length == 0) {
            return null;
        }
        ListNode head = new ListNode(values[0]);
        ListNode cur = head;
        for (int i = 1; i < values.length; i++) {
            cur.next = new ListNode(values[i]);
            cur = cur.next;
        }
        return head;
    }

    /**
     * 工具方法：将链表转换为数组，便于断言
     */
    private int[] listToArray(ListNode head) {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        ListNode cur = head;
        while (cur != null) {
            list.add(cur.val);
            cur = cur.next;
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    // TC01: 输入 null，期望输出 null
    @Test
    void testReverseList_NullInput() {
        ListNode result = t206.reverseList(null);
        assertNull(result);
    }

    // TC02: 输入 [1]，期望输出 [1]
    @Test
    void testReverseList_SingleNode() {
        ListNode head = buildList(new int[]{1});
        ListNode result = t206.reverseList(head);
        assertArrayEquals(new int[]{1}, listToArray(result));
    }

    // TC03: 输入 [1 -> 2]，期望输出 [2 -> 1]
    @Test
    void testReverseList_TwoNodes() {
        ListNode head = buildList(new int[]{1, 2});
        ListNode result = t206.reverseList(head);
        assertArrayEquals(new int[]{2, 1}, listToArray(result));
    }

    // TC04: 输入 [1 -> 2 -> 3]，期望输出 [3 -> 2 -> 1]
    @Test
    void testReverseList_ThreeNodes() {
        ListNode head = buildList(new int[]{1, 2, 3});
        ListNode result = t206.reverseList(head);
        assertArrayEquals(new int[]{3, 2, 1}, listToArray(result));
    }

    // TC05: 输入 [1 -> 2 -> 3 -> 4 -> 5]，期望输出 [5 -> 4 -> 3 -> 2 -> 1]
    @Test
    void testReverseList_MultipleNodes() {
        ListNode head = buildList(new int[]{1, 2, 3, 4, 5});
        ListNode result = t206.reverseList(head);
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, listToArray(result));
    }
}
