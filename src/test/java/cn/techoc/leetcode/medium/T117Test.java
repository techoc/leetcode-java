package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * 对 T117 类中的 connect 方法进行单元测试
 */
class T117Test {

    private final T117 solution = new T117();

    /**
     * TC01: 测试空树输入
     */
    @Test
    void testConnectWithNullRoot() {
        assertNull(solution.connect(null));
    }

    /**
     * TC02: 测试仅有一个节点的树
     */
    @Test
    void testConnectWithSingleNode() {
        T117.Node root = new T117.Node(1);
        T117.Node result = solution.connect(root);

        assertEquals(1, result.val);
        assertNull(result.next);
        assertNull(result.left);
        assertNull(result.right);
    }

    /**
     * TC03: 测试三层满二叉树
     * 1
     * /   \
     * 2     3
     * / \   / \
     * 4   5 6   7
     */
    @Test
    void testConnectFullBinaryTreeThreeLevels() {
        T117.Node root = new T117.Node(1);
        root.left = new T117.Node(2);
        root.right = new T117.Node(3);
        root.left.left = new T117.Node(4);
        root.left.right = new T117.Node(5);
        root.right.left = new T117.Node(6);
        root.right.right = new T117.Node(7);

        T117.Node result = solution.connect(root);

        // 层级 1: 1 -> null
        assertNull(result.next);

        // 层级 2: 2 -> 3 -> null
        assertEquals(result.left.next, result.right);
        assertNull(result.right.next);

        // 层级 3: 4->5->6->7->null
        assertEquals(result.left.left.next, result.left.right);
        assertEquals(result.left.right.next, result.right.left);
        assertEquals(result.right.left.next, result.right.right);
        assertNull(result.right.right.next);
    }

    /**
     * TC04: 测试非满二叉树
     * 1
     * /   \
     * 2     3
     * /     /
     * 4     5
     */
    @Test
    void testConnectIncompleteBinaryTree() {
        T117.Node root = new T117.Node(1);
        root.left = new T117.Node(2);
        root.right = new T117.Node(3);
        root.left.left = new T117.Node(4);
        root.right.left = new T117.Node(5);

        T117.Node result = solution.connect(root);

        // 层级 1: 1 -> null
        assertNull(result.next);

        // 层级 2: 2 -> 3 -> null
        assertEquals(result.left.next, result.right);
        assertNull(result.right.next);

        // 层级 3: 4 -> 5 -> null
        assertEquals(result.left.left.next, result.right.left);
        assertNull(result.right.left.next);
    }
}
