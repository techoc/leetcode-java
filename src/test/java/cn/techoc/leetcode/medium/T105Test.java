package cn.techoc.leetcode.medium;

import cn.techoc.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 对T105.buildTree方法进行JUnit 5单元测试
 */
public class T105Test {

    private final T105 t105 = new T105();

    /**
     * 测试用例TC1: 空数组输入应返回null
     */
    @Test
    public void testBuildTreeWithEmptyArrays() {
        int[] preorder = {};
        int[] inorder = {};
        TreeNode result = t105.buildTree(preorder, inorder);
        assertNull(result);
    }

    /**
     * 测试用例TC2: 单个节点的树
     */
    @Test
    public void testBuildTreeWithSingleNode() {
        int[] preorder = {1};
        int[] inorder = {1};
        TreeNode result = t105.buildTree(preorder, inorder);

        assertNotNull(result);
        assertEquals(1, result.val);
        assertNull(result.left);
        assertNull(result.right);
    }

    /**
     * 测试用例TC3: 完整二叉树结构 [3,9,20,null,null,15,7]
     * 前序: [3,9,20,15,7]
     * 中序: [9,3,15,20,7]
     */
    @Test
    public void testBuildTreeFullBinaryTree() {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        TreeNode result = t105.buildTree(preorder, inorder);

        assertNotNull(result);
        assertEquals(3, result.val);
        assertEquals(9, result.left.val);
        assertEquals(20, result.right.val);
        assertEquals(15, result.right.left.val);
        assertEquals(7, result.right.right.val);
    }

    /**
     * 测试用例TC4: 只有左子树的情况
     * 前序: [1,2,3]
     * 中序: [3,2,1]
     */
    @Test
    public void testBuildTreeOnlyLeftSubtree() {
        int[] preorder = {1, 2, 3};
        int[] inorder = {3, 2, 1};

        TreeNode result = t105.buildTree(preorder, inorder);

        assertNotNull(result);
        assertEquals(1, result.val);
        assertEquals(2, result.left.val);
        assertEquals(3, result.left.left.val);
        assertNull(result.right);
    }

    /**
     * 测试用例TC5: 只有右子树的情况
     * 前序: [1,2,3]
     * 中序: [1,2,3]
     */
    @Test
    public void testBuildTreeOnlyRightSubtree() {
        int[] preorder = {1, 2, 3};
        int[] inorder = {1, 2, 3};

        TreeNode result = t105.buildTree(preorder, inorder);

        assertNotNull(result);
        assertEquals(1, result.val);
        assertEquals(2, result.right.val);
        assertEquals(3, result.right.right.val);
        assertNull(result.left);
    }
}
