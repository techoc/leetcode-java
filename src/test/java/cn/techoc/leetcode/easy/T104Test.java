package cn.techoc.leetcode.easy;

import cn.techoc.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 对 T104 类中的 maxDepth 方法进行单元测试
 */
class T104Test {

    private final T104 t104 = new T104();

    /**
     * 测试空树的情况
     */
    @Test
    void testMaxDepth_NullRoot_ReturnsZero() {
        // Given
        TreeNode root = null;

        // When
        int result = t104.maxDepth(root);

        // Then
        assertEquals(0, result, "空树的最大深度应为 0");
    }

    /**
     * 测试只有一个节点的树
     */
    @Test
    void testMaxDepth_SingleNode_ReturnsOne() {
        // Given
        TreeNode root = new TreeNode();
        root.val = 1;

        // When
        int result = t104.maxDepth(root);

        // Then
        assertEquals(1, result, "单节点树的最大深度应为 1");
    }

    /**
     * 测试三层完全二叉树
     * 1
     * / \
     * 2   3
     * / \
     * 4   5
     */
    @Test
    void testMaxDepth_CompleteBinaryTree_ReturnsThree() {
        // Given
        TreeNode root = new TreeNode();
        root.val = 1;
        root.left = new TreeNode();
        root.left.val = 2;
        root.right = new TreeNode();
        root.right.val = 3;
        root.left.left = new TreeNode();
        root.left.left.val = 4;
        root.left.right = new TreeNode();
        root.left.right.val = 5;

        // When
        int result = t104.maxDepth(root);

        // Then
        assertEquals(3, result, "三层完全二叉树的最大深度应为 3");
    }

    /**
     * 测试左侧更深的树
     * 1
     * /
     * 2
     * /
     * 3
     */
    @Test
    void testMaxDepth_LeftDeeper_ReturnsThree() {
        // Given
        TreeNode root = new TreeNode();
        root.val = 1;
        root.left = new TreeNode();
        root.left.val = 2;
        root.left.left = new TreeNode();
        root.left.left.val = 3;

        // When
        int result = t104.maxDepth(root);

        // Then
        assertEquals(3, result, "左侧深度为3的树最大深度应为3");
    }

    /**
     * 测试右侧更深的树
     * 1
     * \
     * 2
     * \
     * 3
     */
    @Test
    void testMaxDepth_RightDeeper_ReturnsThree() {
        // Given
        TreeNode root = new TreeNode();
        root.val = 1;
        root.right = new TreeNode();
        root.right.val = 2;
        root.right.right = new TreeNode();
        root.right.right.val = 3;

        // When
        int result = t104.maxDepth(root);

        // Then
        assertEquals(3, result, "右侧深度为3的树最大深度应为3");
    }
}
