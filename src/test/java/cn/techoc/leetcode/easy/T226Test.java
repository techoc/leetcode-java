package cn.techoc.leetcode.easy;

import cn.techoc.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 对 invertTree 函数进行单元测试
 */
class T226Test {

    private final T226 t226 = new T226();

    /**
     * TC01: 测试空树的情况
     */
    @Test
    void testInvertTree_NullRoot_ReturnsNull() {
        TreeNode root = null;
        TreeNode result = t226.invertTree(root);
        assertNull(result);
    }

    /**
     * TC02: 测试只有一个节点的情况
     */
    @Test
    void testInvertTree_SingleNode_ReturnsSameNode() {
        TreeNode root = new TreeNode(1);
        TreeNode result = t226.invertTree(root);
        assertNotNull(result);
        assertEquals(1, result.val);
        assertNull(result.left);
        assertNull(result.right);
    }

    /**
     * TC03: 测试完全二叉树的情况
     * 原始结构:       翻转后结构:
     * 4              4
     * / \            / \
     * 2   7          7   2
     * / \ / \        / \ / \
     * 1  3 6  9      9  6 3  1
     */
    @Test
    void testInvertTree_CompleteBinaryTree_ReturnsInvertedTree() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        TreeNode result = t226.invertTree(root);

        assertEquals(4, result.val);
        assertEquals(7, result.left.val);
        assertEquals(2, result.right.val);
        assertEquals(9, result.left.left.val);
        assertEquals(6, result.left.right.val);
        assertEquals(3, result.right.left.val);
        assertEquals(1, result.right.right.val);
    }

    /**
     * TC04: 测试只有右子树的情况
     * 原始结构:       翻转后结构:
     * 1              1
     * \            /
     * 2          2
     */
    @Test
    void testInvertTree_OnlyRightChild_ReturnsInvertedTree() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);

        TreeNode result = t226.invertTree(root);

        assertEquals(1, result.val);
        assertEquals(2, result.left.val);
        assertNull(result.right);
    }

    /**
     * TC05: 测试只有左子树的情况
     * 原始结构:       翻转后结构:
     * 1              1
     * /                \
     * 2                  2
     */
    @Test
    void testInvertTree_OnlyLeftChild_ReturnsInvertedTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);

        TreeNode result = t226.invertTree(root);

        assertEquals(1, result.val);
        assertNull(result.left);
        assertEquals(2, result.right.val);
    }
}
