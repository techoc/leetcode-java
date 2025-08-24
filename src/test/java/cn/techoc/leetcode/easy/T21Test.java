package cn.techoc.leetcode.easy;

import cn.techoc.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * 合并两个有序链表的单元测试类
 */
class T21Test {

    private final T21 t21 = new T21();

    /**
     * 工具方法：根据数组构建链表
     */
    private ListNode buildList(int[] values) {
        if (values == null || values.length == 0) return null;
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        for (int val : values) {
            cur.next = new ListNode(val);
            cur = cur.next;
        }
        return dummy.next;
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
        return list.stream().mapToInt(i -> i).toArray();
    }

    /**
     * TC01: 两个链表都为空
     */
    @Test
    void testMergeTwoLists_BothNull() {
        ListNode result = t21.mergeTwoLists(null, null);
        assertNull(result);
    }

    /**
     * TC02: l1为空，l2非空
     */
    @Test
    void testMergeTwoLists_L1Null() {
        ListNode l2 = buildList(new int[]{1, 2, 3});
        ListNode result = t21.mergeTwoLists(null, l2);
        assertArrayEquals(new int[]{1, 2, 3}, listToArray(result));
    }

    /**
     * TC03: l2为空，l1非空
     */
    @Test
    void testMergeTwoLists_L2Null() {
        ListNode l1 = buildList(new int[]{1, 2, 3});
        ListNode result = t21.mergeTwoLists(l1, null);
        assertArrayEquals(new int[]{1, 2, 3}, listToArray(result));
    }

    /**
     * TC04: 两个链表长度相等，交错合并
     */
    @Test
    void testMergeTwoLists_Interleaved() {
        ListNode l1 = buildList(new int[]{1, 2, 4});
        ListNode l2 = buildList(new int[]{1, 3, 4});
        ListNode result = t21.mergeTwoLists(l1, l2);
        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 4}, listToArray(result));
    }

    /**
     * TC05: 一个链表所有元素都小于另一个
     */
    @Test
    void testMergeTwoLists_AllLess() {
        ListNode l1 = buildList(new int[]{1, 2, 3});
        ListNode l2 = buildList(new int[]{4, 5, 6});
        ListNode result = t21.mergeTwoLists(l1, l2);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, listToArray(result));
    }

    /**
     * TC06: 一个链表所有元素都大于另一个
     */
    @Test
    void testMergeTwoLists_AllGreater() {
        ListNode l1 = buildList(new int[]{4, 5, 6});
        ListNode l2 = buildList(new int[]{1, 2, 3});
        ListNode result = t21.mergeTwoLists(l1, l2);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, listToArray(result));
    }

    /**
     * TC07: 两个链表完全相同
     */
    @Test
    void testMergeTwoLists_Identical() {
        ListNode l1 = buildList(new int[]{1, 1, 1});
        ListNode l2 = buildList(new int[]{1, 1, 1});
        ListNode result = t21.mergeTwoLists(l1, l2);
        assertArrayEquals(new int[]{1, 1, 1, 1, 1, 1}, listToArray(result));
    }
}
