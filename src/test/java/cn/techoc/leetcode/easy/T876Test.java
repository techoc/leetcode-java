package cn.techoc.leetcode.easy;

import cn.techoc.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 876. 链表的中间结点 单元测试
 */
class T876Test {

    private final T876 t876 = new T876();

    /**
     * 创建链表辅助方法
     *
     * @param values 节点值数组
     * @return 链表头节点
     */
    private ListNode createLinkedList(int[] values) {
        if (values == null || values.length == 0) {
            return null;
        }
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    /**
     * 获取链表第index个节点（从0开始）
     */
    private ListNode getNodeAt(ListNode head, int index) {
        ListNode current = head;
        for (int i = 0; i < index; i++) {
            if (current == null) {
                return null;
            }
            current = current.next;
        }
        return current;
    }

    /**
     * 测试用例：单节点链表
     * 输入: [1]
     * 期望输出: 节点值为1的节点
     */
    @Test
    void testMiddleNodeWithOneNode() {
        ListNode head = createLinkedList(new int[]{1});
        ListNode result = t876.middleNode(head);
        assertNotNull(result);
        assertEquals(1, result.val);
        assertNull(result.next);
    }

    /**
     * 测试用例：两个节点的链表
     * 输入: [1,2]
     * 期望输出: 节点值为2的节点
     */
    @Test
    void testMiddleNodeWithTwoNodes() {
        ListNode head = createLinkedList(new int[]{1, 2});
        ListNode expectedMiddle = getNodeAt(head, 1);
        ListNode result = t876.middleNode(head);
        assertSame(expectedMiddle, result);
    }

    /**
     * 测试用例：三个节点的链表
     * 输入: [1,2,3]
     * 期望输出: 节点值为2的节点
     */
    @Test
    void testMiddleNodeWithThreeNodes() {
        ListNode head = createLinkedList(new int[]{1, 2, 3});
        ListNode expectedMiddle = getNodeAt(head, 1);
        ListNode result = t876.middleNode(head);
        assertSame(expectedMiddle, result);
    }

    /**
     * 测试用例：四个节点的链表
     * 输入: [1,2,3,4]
     * 期望输出: 节点值为3的节点 (第二个中间节点)
     */
    @Test
    void testMiddleNodeWithFourNodes() {
        ListNode head = createLinkedList(new int[]{1, 2, 3, 4});
        ListNode expectedMiddle = getNodeAt(head, 2);
        ListNode result = t876.middleNode(head);
        assertSame(expectedMiddle, result);
    }

    /**
     * 测试用例：五个节点的链表
     * 输入: [1,2,3,4,5]
     * 期望输出: 节点值为3的节点
     */
    @Test
    void testMiddleNodeWithFiveNodes() {
        ListNode head = createLinkedList(new int[]{1, 2, 3, 4, 5});
        ListNode expectedMiddle = getNodeAt(head, 2);
        ListNode result = t876.middleNode(head);
        assertSame(expectedMiddle, result);
    }

    /**
     * 测试用例：空链表
     * 输入: []
     * 期望输出: null
     */
    @Test
    void testMiddleNodeWithEmptyList() {
        ListNode head = null;
        ListNode result = t876.middleNode(head);
        assertNull(result);
    }
}
