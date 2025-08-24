package cn.techoc.leetcode.hard;

import cn.techoc.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * 合并 K 个升序链表 单元测试
 */
class T23Test {

    private final T23 t23 = new T23();

    /**
     * 工具方法：根据数组构建链表
     */
    private ListNode buildList(int[] values) {
        if (values == null || values.length == 0) return null;
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        for (int val : values) {
            cur.next = new ListNode(val);
            cur = cur.next;
        }
        return dummy.next;
    }

    /**
     * 工具方法：将链表转为数组，便于断言
     */
    private int[] listToArray(ListNode head) {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    /**
     * TC01: 输入为 null
     */
    @Test
    void testMergeKLists_NullInput() {
        assertNull(t23.mergeKLists(null));
    }

    /**
     * TC02: 输入为空数组
     */
    @Test
    void testMergeKLists_EmptyArray() {
        ListNode[] lists = {};
        assertNull(t23.mergeKLists(lists));
    }

    /**
     * TC03: 输入全为 null 的链表
     */
    @Test
    void testMergeKLists_AllNull() {
        ListNode[] lists = {null, null};
        assertNull(t23.mergeKLists(lists));
    }

    /**
     * TC04: 正常合并多个升序链表
     * 输入: [[1->4->5], [1->3->4], [2->6]]
     * 输出: [1->1->2->3->4->4->5->6]
     */
    @Test
    void testMergeKLists_NormalCase() {
        ListNode list1 = buildList(new int[]{1, 4, 5});
        ListNode list2 = buildList(new int[]{1, 3, 4});
        ListNode list3 = buildList(new int[]{2, 6});
        ListNode[] lists = {list1, list2, list3};

        ListNode result = t23.mergeKLists(lists);
        int[] expected = {1, 1, 2, 3, 4, 4, 5, 6};
        assertArrayEquals(expected, listToArray(result));
    }

    /**
     * TC05: 输入包含空链表
     * 输入: [null, [1->2], null]
     * 输出: [1->2]
     */
    @Test
    void testMergeKLists_WithNullList() {
        ListNode list = buildList(new int[]{1, 2});
        ListNode[] lists = {null, list, null};

        ListNode result = t23.mergeKLists(lists);
        int[] expected = {1, 2};
        assertArrayEquals(expected, listToArray(result));
    }

    /**
     * TC06: 输入全是空链表
     * 输入: [[], [], []]
     * 输出: null
     */
    @Test
    void testMergeKLists_AllEmptyLists() {
        ListNode[] lists = {buildList(new int[]{}), buildList(new int[]{}), buildList(new int[]{})};
        assertNull(t23.mergeKLists(lists));
    }
}
