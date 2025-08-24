package cn.techoc.leetcode.easy;

import cn.techoc.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * @author techoc
 * @since 2025/4/5
 */
class T86Test {

    private final T86 t86 = new T86();

    // 工具方法：根据数组构造链表
    private ListNode createList(int[] values) {
        if (values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode cur = head;
        for (int i = 1; i < values.length; i++) {
            cur.next = new ListNode(values[i]);
            cur = cur.next;
        }
        return head;
    }

    // 工具方法：将链表转换为数组用于断言
    private int[] listToArray(ListNode head) {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        ListNode cur = head;
        while (cur != null) {
            list.add(cur.val);
            cur = cur.next;
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    @Test
    void testPartition_NullList() {
        // TC01: 空链表
        ListNode result = t86.partition(null, 1);
        assertNull(result);
    }

    @Test
    void testPartition_SingleNode() {
        // TC02: 单节点链表
        ListNode head = new ListNode(1);
        ListNode result = t86.partition(head, 2);
        assertArrayEquals(new int[]{1}, listToArray(result));
    }

    @Test
    void testPartition_NormalCase() {
        // TC03: 正常情况 [1,4,3,2,5,2], x=3 => [1,2,2,4,3,5]
        ListNode head = createList(new int[]{1, 4, 3, 2, 5, 2});
        ListNode result = t86.partition(head, 3);
        assertArrayEquals(new int[]{1, 2, 2, 4, 3, 5}, listToArray(result));
    }

    @Test
    void testPartition_AllLessThanX() {
        // TC04: 所有节点都小于 x
        ListNode head = createList(new int[]{1, 1});
        ListNode result = t86.partition(head, 2);
        assertArrayEquals(new int[]{1, 1}, listToArray(result));
    }

    @Test
    void testPartition_AllGreaterThanOrEqualX() {
        // TC05: 所有节点都大于等于 x
        ListNode head = createList(new int[]{3, 4, 5});
        ListNode result = t86.partition(head, 2);
        assertArrayEquals(new int[]{3, 4, 5}, listToArray(result));
    }

    @Test
    void testPartition_AllEqualToX() {
        // TC06: 所有节点等于 x
        ListNode head = createList(new int[]{1, 1, 1});
        ListNode result = t86.partition(head, 1);
        assertArrayEquals(new int[]{1, 1, 1}, listToArray(result));
    }
}
