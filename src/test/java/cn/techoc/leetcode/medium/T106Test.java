package cn.techoc.leetcode.medium;

import cn.techoc.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 对 T106.buildTree 方法进行单元测试
 */
public class T106Test {

    private final T106 t106 = new T106();

    /**
     * TC01: 正常情况 - 构造完整二叉树
     * inorder = [9,3,15,20,7]
     * postorder = [9,15,7,20,3]
     * 树结构应为：
     * 3
     * / \
     * 9  20
     * /  \
     * 15   7
     */
    @Test
    public void testBuildTree_NormalCase() {
        int[] inorder = {9, 3, 15, 20, 7};
        int[] postorder = {9, 15, 7, 20, 3};

        TreeNode result = t106.buildTree(inorder, postorder);

        assertNotNull(result);
        assertEquals(3, result.val);
        assertEquals(9, result.left.val);
        assertNull(result.left.left);
        assertNull(result.left.right);
        assertEquals(20, result.right.val);
        assertEquals(15, result.right.left.val);
        assertEquals(7, result.right.right.val);
    }

    /**
     * TC02: 边界情况 - 空数组输入
     * inorder = []
     * postorder = []
     * 应该返回 null
     */
    @Test
    public void testBuildTree_EmptyArrays() {
        int[] inorder = {};
        int[] postorder = {};

        TreeNode result = t106.buildTree(inorder, postorder);

        assertNull(result);
    }

    /**
     * TC03: 边界情况 - 单个节点
     * inorder = [1]
     * postorder = [1]
     * 应该返回值为1的单节点树
     */
    @Test
    public void testBuildTree_SingleNode() {
        int[] inorder = {1};
        int[] postorder = {1};

        TreeNode result = t106.buildTree(inorder, postorder);

        assertNotNull(result);
        assertEquals(1, result.val);
        assertNull(result.left);
        assertNull(result.right);
    }

    /**
     * TC04: 特殊情况 - 只有右子树
     * inorder = [1,2]
     * postorder = [2,1]
     * 结构为：
     * 1
     * \
     * 2
     */
    @Test
    public void testBuildTree_RightOnly() {
        int[] inorder = {1, 2};
        int[] postorder = {2, 1};

        TreeNode result = t106.buildTree(inorder, postorder);

        assertNotNull(result);
        assertEquals(1, result.val);
        assertNull(result.left);
        assertNotNull(result.right);
        assertEquals(2, result.right.val);
    }

    /**
     * TC05: 特殊情况 - 只有左子树
     * inorder = [2,1]
     * postorder = [2,1]
     * 结构为：
     * 1
     * /
     * 2
     */
    @Test
    public void testBuildTree_LeftOnly() {
        int[] inorder = {2, 1};
        int[] postorder = {2, 1};

        TreeNode result = t106.buildTree(inorder, postorder);

        assertNotNull(result);
        assertEquals(1, result.val);
        assertNotNull(result.left);
        assertEquals(2, result.left.val);
        assertNull(result.right);
    }
}
