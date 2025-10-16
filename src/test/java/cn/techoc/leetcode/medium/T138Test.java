package cn.techoc.leetcode.medium;

import cn.techoc.leetcode.utils.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 针对 T138.copyRandomList 方法的单元测试
 *
 * @author Techoc
 */
class T138Test {

    private final T138 t138 = new T138();

    /**
     * TC01: 输入为 null，期望返回 null
     */
    @Test
    void testCopyRandomList_NullInput_ReturnsNull() {
        assertNull(t138.copyRandomList(null));
    }

    /**
     * TC02: 单个节点且 random 为 null
     */
    @Test
    void testCopyRandomList_SingleNodeWithNullRandom_ReturnsCorrectCopy() {
        Node head = new Node(1);
        head.random = null;

        Node result = t138.copyRandomList(head);

        assertNotNull(result);
        assertEquals(1, result.val);
        assertNull(result.random);
        assertNotSame(head, result); // 确保是深拷贝
    }

    /**
     * TC03: 多个节点，random 指向不同节点
     */
    @Test
    void testCopyRandomList_MultipleNodesWithVariousRandomPointers_ReturnsCorrectCopy() {
        // 构造原链表: 1 -> 2 -> 3
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.next = node2;
        node2.next = node3;

        // 设置 random 指针
        node1.random = node3; // 1.random -> 3
        node2.random = node1; // 2.random -> 1
        node3.random = node2; // 3.random -> 2

        Node result = t138.copyRandomList(node1);

        // 验证结果
        assertNotNull(result);
        assertEquals(1, result.val);
        assertNotNull(result.next);
        assertEquals(2, result.next.val);
        assertNotNull(result.next.next);
        assertEquals(3, result.next.next.val);
        assertNull(result.next.next.next);

        // 验证 random 指针是否正确映射
        assertNotSame(node1, result);
        assertNotSame(node2, result.next);
        assertNotSame(node3, result.next.next);

        assertEquals(result.next.next, result.random);       // 1' -> 3'
        assertEquals(result, result.next.random);             // 2' -> 1'
        assertEquals(result.next, result.next.next.random);   // 3' -> 2'
    }

    /**
     * TC04: random 指向自己
     */
    @Test
    void testCopyRandomList_NodeRandomPointsToSelf_ReturnsCorrectCopy() {
        Node node = new Node(1);
        node.random = node;

        Node result = t138.copyRandomList(node);

        assertNotNull(result);
        assertEquals(1, result.val);
        assertNotSame(node, result);
        assertSame(result, result.random); // 新节点的 random 指向它自己
    }

    /**
     * TC05: random 混合指向 null 和有效节点
     */
    @Test
    void testCopyRandomList_MixedRandomPointers_ReturnsCorrectCopy() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.next = node2;
        node2.next = node3;

        node1.random = null;
        node2.random = node2; // 自己指向自己
        node3.random = node1; // 指向第一个节点

        Node result = t138.copyRandomList(node1);

        assertNotNull(result);
        assertNull(result.random);
        assertSame(result.next, result.next.random);         // 2'.random -> 2'
        assertEquals(result, result.next.next.random);        // 3'.random -> 1'
    }
}
