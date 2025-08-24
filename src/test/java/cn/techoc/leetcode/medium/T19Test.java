package cn.techoc.leetcode.medium;

import cn.techoc.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * T19 单元测试类
 */
class T19Test {

    private final T19 t19 = new T19();

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

    /**
     * 测试用例1：删除倒数第2个节点
     * 输入：[1,2,3,4,5], n=2
     * 期望输出：[1,2,3,5]
     */
    @Test
    void testRemoveNthFromEnd_NormalCase() {
        ListNode head = arrayToList(new int[]{1, 2, 3, 4, 5});
        ListNode result = t19.removeNthFromEnd(head, 2);
        assertArrayEquals(new int[]{1, 2, 3, 5}, listToArray(result));
    }

    /**
     * 测试用例2：删除唯一节点
     * 输入：[1], n=1
     * 期望输出：[]
     */
    @Test
    void testRemoveNthFromEnd_SingleNode() {
        ListNode head = arrayToList(new int[]{1});
        ListNode result = t19.removeNthFromEnd(head, 1);
        assertNull(result);
    }

    /**
     * 测试用例3：删除尾节点
     * 输入：[1,2], n=1
     * 期望输出：[1]
     */
    @Test
    void testRemoveNthFromEnd_TailNode() {
        ListNode head = arrayToList(new int[]{1, 2});
        ListNode result = t19.removeNthFromEnd(head, 1);
        assertArrayEquals(new int[]{1}, listToArray(result));
    }

    /**
     * 测试用例4：删除头节点
     * 输入：[1,2], n=2
     * 期望输出：[2]
     */
    @Test
    void testRemoveNthFromEnd_HeadNode() {
        ListNode head = arrayToList(new int[]{1, 2});
        ListNode result = t19.removeNthFromEnd(head, 2);
        assertArrayEquals(new int[]{2}, listToArray(result));
    }

    /**
     * 测试用例5：删除头节点（链表较长）
     * 输入：[1,2,3,4,5], n=5
     * 期望输出：[2,3,4,5]
     */
    @Test
    void testRemoveNthFromEnd_FirstNode() {
        ListNode head = arrayToList(new int[]{1, 2, 3, 4, 5});
        ListNode result = t19.removeNthFromEnd(head, 5);
        assertArrayEquals(new int[]{2, 3, 4, 5}, listToArray(result));
    }

    /**
     * 测试用例6：空链表
     * 输入：null, n=1
     * 期望输出：null
     */
    @Test
    void testRemoveNthFromEnd_EmptyList() {
        ListNode result = t19.removeNthFromEnd(null, 1);
        assertNull(result);
    }
}
