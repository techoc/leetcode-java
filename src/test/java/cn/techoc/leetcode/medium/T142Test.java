package cn.techoc.leetcode.medium;

import cn.techoc.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

/**
 * T142 的单元测试类
 */
class T142Test {

    private final T142 t142 = new T142();

    /**
     * TC1: 输入为 null，期望返回 null
     */
    @Test
    void testDetectCycle_NullInput_ReturnsNull() {
        ListNode result = t142.detectCycle(null);
        assertNull(result);
    }

    /**
     * TC2: 单节点无环链表，期望返回 null
     */
    @Test
    void testDetectCycle_SingleNodeNoCycle_ReturnsNull() {
        ListNode head = new ListNode(1);
        ListNode result = t142.detectCycle(head);
        assertNull(result);
    }

    /**
     * TC3: 多节点无环链表，期望返回 null
     */
    @Test
    void testDetectCycle_MultiNodeNoCycle_ReturnsNull() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        ListNode result = t142.detectCycle(head);
        assertNull(result);
    }

    /**
     * TC4: 单节点自环链表，期望返回该节点
     */
    @Test
    void testDetectCycle_SingleNodeSelfLoop_ReturnsSameNode() {
        ListNode head = new ListNode(1);
        head.next = head; // 自环
        ListNode result = t142.detectCycle(head);
        assertSame(head, result);
    }

    /**
     * TC5: 多节点有环链表，环入口在中间
     * 构造链表：1 -> 2 -> 3 -> 4
     * ^         |
     * |_________|
     * 环入口为节点2
     */
    @Test
    void testDetectCycle_MultiNodeWithCycle_ReturnsCycleStartNode() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // 形成环，入口为 node2

        ListNode result = t142.detectCycle(node1);
        assertSame(node2, result);
    }
}
