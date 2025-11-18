package cn.techoc.leetcode.easy;

import cn.techoc.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class T112Test {

    @Test
    void testHasPathSumWithNullRoot() {
        T112 solution = new T112();
        assertFalse(solution.hasPathSum(null, 0));
        assertFalse(solution.hasPathSum(null, 1));
    }

    @Test
    void testHasPathSumWithSingleNode() {
        T112 solution = new T112();
        TreeNode root = new TreeNode(1);
        assertTrue(solution.hasPathSum(root, 1));
        assertFalse(solution.hasPathSum(root, 2));
    }

    @Test
    void testHasPathSumWithPositiveValues() {
        T112 solution = new T112();
        /*
         * 构建如下二叉树:
         *       5
         *      / \
         *     4   8
         *    /   / \
         *   11  13  4
         *  / \      \
         * 7   2      1
         */
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.right.right = new TreeNode(1);

        // 存在路径 5->4->11->2，和为22
        assertTrue(solution.hasPathSum(root, 22));
        // 存在路径 5->8->4->1，和为18
        assertTrue(solution.hasPathSum(root, 18));
        // 存在路径 5->8->13，和为26
        assertTrue(solution.hasPathSum(root, 26));
        // 不存在和为10的路径
        assertFalse(solution.hasPathSum(root, 10));
    }

    @Test
    void testHasPathSumWithNegativeValues() {
        T112 solution = new T112();
        /*
         * 构建如下二叉树:
         *      -3
         *      / \
         *     9   20
         *        /  \
         *       15   7
         */
        TreeNode root = new TreeNode(-3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        // 存在路径 -3->20->15，和为32
        assertTrue(solution.hasPathSum(root, 32));
        // 存在路径 -3->20->7，和为24
        assertTrue(solution.hasPathSum(root, 24));
        // 存在路径 -3->9，和为6
        assertTrue(solution.hasPathSum(root, 6));
        // 不存在和为0的路径
        assertFalse(solution.hasPathSum(root, 0));
    }

    @Test
    void testHasPathSumWithZeroAndNegativeTarget() {
        T112 solution = new T112();
        /*
         * 构建如下二叉树:
         *    1
         *   / \
         *  2  -3
         */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(-3);

        // 存在路径 1->(-3)，和为-2
        assertTrue(solution.hasPathSum(root, -2));
        // 存在路径 1->2，和为3
        assertTrue(solution.hasPathSum(root, 3));
        // 不存在和为0的路径
        assertFalse(solution.hasPathSum(root, 0));
    }

    @Test
    void testHasPathSumOnlyLeftChild() {
        T112 solution = new T112();
        /*
         * 构建只有左孩子的树:
         * 1
         *  \
         *   2
         *    \
         *     3
         */
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);

        // 存在路径 1->2->3，和为6
        assertTrue(solution.hasPathSum(root, 6));
        // 不存在和为5的路径
        assertFalse(solution.hasPathSum(root, 5));
    }

    @Test
    void testHasPathSumOnlyRightChild() {
        T112 solution = new T112();
        /*
         * 构建只有右孩子的树:
         *   1
         *  /
         * 2
         * /
         *3
         */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);

        // 存在路径 1->2->3，和为6
        assertTrue(solution.hasPathSum(root, 6));
        // 不存在和为5的路径
        assertFalse(solution.hasPathSum(root, 5));
    }
}
