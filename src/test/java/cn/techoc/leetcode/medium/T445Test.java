package cn.techoc.leetcode.medium;

import cn.techoc.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * T445 类的单元测试
 */
public class T445Test {

    private final T445 t445 = new T445();

    /**
     * 工具方法：将数组转换为链表
     */
    private ListNode arrayToList(int[] arr) {
        if (arr.length == 0) return null;
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
        java.util.List<Integer> list = new java.util.ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    /**
     * TC01: 普通情况，无进位
     * 输入: l1 = [7,2,4,3], l2 = [5,6,4]
     * 输出: [7,8,0,7]
     */
    @Test
    public void testAddTwoNumbers_NormalCaseNoCarry() {
        ListNode l1 = arrayToList(new int[]{7, 2, 4, 3});
        ListNode l2 = arrayToList(new int[]{5, 6, 4});
        ListNode result = t445.addTwoNumbers(l1, l2);
        assertArrayEquals(new int[]{7, 8, 0, 7}, listToArray(result));
    }

    /**
     * TC02: 普通情况，有进位
     * 输入: l1 = [2,4,3], l2 = [5,6,4]
     * 输出: [8,0,7]
     */
    @Test
    public void testAddTwoNumbers_NormalCaseWithCarry() {
        ListNode l1 = arrayToList(new int[]{2, 4, 3});
        ListNode l2 = arrayToList(new int[]{5, 6, 4});
        ListNode result = t445.addTwoNumbers(l1, l2);
        assertArrayEquals(new int[]{8, 0, 7}, listToArray(result));
    }

    /**
     * TC03: 两数都为0
     * 输入: l1 = [0], l2 = [0]
     * 输出: [0]
     */
    @Test
    public void testAddTwoNumbers_BothZero() {
        ListNode l1 = arrayToList(new int[]{0});
        ListNode l2 = arrayToList(new int[]{0});
        ListNode result = t445.addTwoNumbers(l1, l2);
        assertArrayEquals(new int[]{0}, listToArray(result));
    }

    /**
     * TC04: 多位数相加且进位
     * 输入: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
     * 输出: [1,0,0,0,9,9,9,8]
     */
    @Test
    public void testAddTwoNumbers_MultipleDigitsWithCarry() {
        ListNode l1 = arrayToList(new int[]{9, 9, 9, 9, 9, 9, 9});
        ListNode l2 = arrayToList(new int[]{9, 9, 9, 9});
        ListNode result = t445.addTwoNumbers(l1, l2);
        assertArrayEquals(new int[]{1, 0, 0, 0, 9, 9, 9, 8}, listToArray(result));
    }

    /**
     * TC05: 一个链表为空
     * 输入: l1 = [], l2 = [1]
     * 输出: [1]
     */
    @Test
    public void testAddTwoNumbers_OneEmptyList() {
        ListNode l1 = null;
        ListNode l2 = arrayToList(new int[]{1});
        ListNode result = t445.addTwoNumbers(l1, l2);
        assertArrayEquals(new int[]{1}, listToArray(result));
    }

    /**
     * TC06: 一个链表为空
     * 输入: l1 = [1], l2 = []
     * 输出: [1]
     */
    @Test
    public void testAddTwoNumbers_AnotherEmptyList() {
        ListNode l1 = arrayToList(new int[]{1});
        ListNode l2 = null;
        ListNode result = t445.addTwoNumbers(l1, l2);
        assertArrayEquals(new int[]{1}, listToArray(result));
    }
}
