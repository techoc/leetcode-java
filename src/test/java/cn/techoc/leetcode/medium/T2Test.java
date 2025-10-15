package cn.techoc.leetcode.medium;

import cn.techoc.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * 对 T2 类中的 addTwoNumbers 方法进行单元测试
 */
class T2Test {

    /**
     * 工具方法：将 int[] 转换为 ListNode 链表
     */
    private ListNode arrayToList(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        for (int num : nums) {
            cur.next = new ListNode(num);
            cur = cur.next;
        }
        return dummy.next;
    }

    /**
     * 工具方法：将 ListNode 链表转换为 int[]
     */
    private int[] listToArray(ListNode head) {
        if (head == null) return new int[0];
        int len = ListNode.getLength(head);
        int[] res = new int[len];
        ListNode cur = head;
        int i = 0;
        while (cur != null) {
            res[i++] = cur.val;
            cur = cur.next;
        }
        return res;
    }

    /**
     * 测试用例 TC1: [2,4,3] + [5,6,4] => [7,0,8]
     */
    @Test
    void testAddTwoNumbers_case1() {
        T2 t2 = new T2();
        ListNode l1 = arrayToList(new int[]{2, 4, 3});
        ListNode l2 = arrayToList(new int[]{5, 6, 4});
        ListNode result = t2.addTwoNumbers(l1, l2);
        int[] expected = {7, 0, 8};
        assertArrayEquals(expected, listToArray(result));
    }

    /**
     * 测试用例 TC2: [0] + [0] => [0]
     */
    @Test
    void testAddTwoNumbers_case2() {
        T2 t2 = new T2();
        ListNode l1 = arrayToList(new int[]{0});
        ListNode l2 = arrayToList(new int[]{0});
        ListNode result = t2.addTwoNumbers(l1, l2);
        int[] expected = {0};
        assertArrayEquals(expected, listToArray(result));
    }

    /**
     * 测试用例 TC3: [9,9,9,9,9,9,9] + [9,9,9,9] => [8,9,9,9,0,0,0,1]
     */
    @Test
    void testAddTwoNumbers_case3() {
        T2 t2 = new T2();
        ListNode l1 = arrayToList(new int[]{9, 9, 9, 9, 9, 9, 9});
        ListNode l2 = arrayToList(new int[]{9, 9, 9, 9});
        ListNode result = t2.addTwoNumbers(l1, l2);
        int[] expected = {8, 9, 9, 9, 0, 0, 0, 1};
        assertArrayEquals(expected, listToArray(result));
    }

    /**
     * 测试用例 TC4: [1] + [9,9,9] => [0,0,0,1]
     */
    @Test
    void testAddTwoNumbers_case4() {
        T2 t2 = new T2();
        ListNode l1 = arrayToList(new int[]{1});
        ListNode l2 = arrayToList(new int[]{9, 9, 9});
        ListNode result = t2.addTwoNumbers(l1, l2);
        int[] expected = {0, 0, 0, 1};
        assertArrayEquals(expected, listToArray(result));
    }

    /**
     * 测试用例 TC5: [] + [1] => [1]（边界情况）
     */
    @Test
    void testAddTwoNumbers_case5() {
        T2 t2 = new T2();
        ListNode l1 = null;
        ListNode l2 = arrayToList(new int[]{1});
        ListNode result = t2.addTwoNumbers(l1, l2);
        int[] expected = {1};
        assertArrayEquals(expected, listToArray(result));
    }
}
