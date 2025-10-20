package cn.techoc.leetcode.medium;

import cn.techoc.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * 61. 旋转链表 的单元测试类
 */
class T61Test {

    private final T61 t61 = new T61();

    /**
     * 工具方法：根据数组创建链表
     */
    private ListNode createLinkedList(int[] nums) {
        if (nums.length == 0) return null;
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        for (int num : nums) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummyHead.next;
    }

    /**
     * 工具方法：将链表转换成数组便于比较
     */
    private int[] linkedListToArray(ListNode head) {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    /**
     * 测试用例1：空链表
     * 输入：head = [], k = 1
     * 输出：[]
     */
    @Test
    void testRotateRight_EmptyList() {
        ListNode result = t61.rotateRight(null, 1);
        assertNull(result);
    }

    /**
     * 测试用例2：只有一个节点的链表
     * 输入：head = [1], k = 1
     * 输出：[1]
     */
    @Test
    void testRotateRight_SingleNode() {
        ListNode head = createLinkedList(new int[]{1});
        ListNode result = t61.rotateRight(head, 1);
        assertArrayEquals(new int[]{1}, linkedListToArray(result));
    }

    /**
     * 测试用例3：两个节点链表，k=1
     * 输入：head = [1,2], k = 1
     * 输出：[2,1]
     */
    @Test
    void testRotateRight_TwoNodes_K1() {
        ListNode head = createLinkedList(new int[]{1, 2});
        ListNode result = t61.rotateRight(head, 1);
        assertArrayEquals(new int[]{2, 1}, linkedListToArray(result));
    }

    /**
     * 测试用例4：三个节点链表，k=2
     * 输入：head = [1,2,3], k = 2
     * 输出：[2,3,1]
     */
    @Test
    void testRotateRight_ThreeNodes_K2() {
        ListNode head = createLinkedList(new int[]{1, 2, 3});
        ListNode result = t61.rotateRight(head, 2);
        assertArrayEquals(new int[]{2, 3, 1}, linkedListToArray(result));
    }

    /**
     * 测试用例5：四个节点链表，k=4（等于链表长度）
     * 输入：head = [1,2,3,4], k = 4
     * 输出：[1,2,3,4] （不变）
     */
    @Test
    void testRotateRight_FourNodes_K4() {
        ListNode head = createLinkedList(new int[]{1, 2, 3, 4});
        ListNode result = t61.rotateRight(head, 4);
        assertArrayEquals(new int[]{1, 2, 3, 4}, linkedListToArray(result));
    }

    /**
     * 测试用例6：五个节点链表，k=7（大于链表长度）
     * 输入：head = [1,2,3,4,5], k = 7
     * 输出：[4,5,1,2,3]
     */
    @Test
    void testRotateRight_FiveNodes_K7() {
        ListNode head = createLinkedList(new int[]{1, 2, 3, 4, 5});
        ListNode result = t61.rotateRight(head, 7); // 7 % 5 = 2
        assertArrayEquals(new int[]{4, 5, 1, 2, 3}, linkedListToArray(result));
    }

    /**
     * 测试用例7：k=0时不发生旋转
     * 输入：head = [1,2,3], k = 0
     * 输出：[1,2,3]
     */
    @Test
    void testRotateRight_KZero() {
        ListNode head = createLinkedList(new int[]{1, 2, 3});
        ListNode result = t61.rotateRight(head, 0);
        assertArrayEquals(new int[]{1, 2, 3}, linkedListToArray(result));
    }
}
