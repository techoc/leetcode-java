package cn.techoc.leetcode.easy;

import cn.techoc.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * 对 T141 类中的 hasCycle 方法进行单元测试
 */
class T141Test {

    private final T141 t141 = new T141();

    /**
     * 测试输入为空链表时，应返回 false
     */
    @Test
    void testHasCycle_EmptyList_ReturnsFalse() {
        assertFalse(t141.hasCycle(null));
    }

    /**
     * 测试只有一个节点且无环的情况，应返回 false
     */
    @Test
    void testHasCycle_SingleNodeNoCycle_ReturnsFalse() {
        ListNode head = new ListNode(1);
        assertFalse(t141.hasCycle(head));
    }

    /**
     * 测试多节点但无环的情况，应返回 false
     */
    @Test
    void testHasCycle_MultipleNodesNoCycle_ReturnsFalse() {
        ListNode head = new ListNode(new int[]{1, 2, 3});
        assertFalse(t141.hasCycle(head));
    }

    /**
     * 测试存在环的情况，应返回 true
     * 示例链表结构如下：
     * 1 -> 2 -> 3
     * ^    |
     * |____|
     */
    @Test
    void testHasCycle_WithCycle_ReturnsTrue() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;
        node3.next = node2; // 形成环：node3 -> node2

        assertTrue(t141.hasCycle(node1));
    }
}
