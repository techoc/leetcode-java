package cn.techoc.leetcode.medium;

import cn.techoc.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T129Test {

    @Test
    void testSumNumbersWithNullRoot() {
        T129 solution = new T129();
        assertEquals(0, solution.sumNumbers(null));
    }

    @Test
    void testSumNumbersWithSingleNode() {
        T129 solution = new T129();
        TreeNode root = new TreeNode(1);
        assertEquals(1, solution.sumNumbers(root));
    }

    @Test
    void testSumNumbersWithCompleteBinaryTree() {
        T129 solution = new T129();
        /*
         * 构建如下二叉树:
         *   1
         *  / \
         * 2   3
         *
         * 路径: 1->2 (12), 1->3 (13)
         * 总和: 12 + 13 = 25
         */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        assertEquals(25, solution.sumNumbers(root));
    }

    @Test
    void testSumNumbersWithLeftSkewedTree() {
        T129 solution = new T129();
        /*
         * 构建如下二叉树:
         * 1
         *  \
         *   2
         *    \
         *     3
         *
         * 路径: 1->2->3 (123)
         * 总和: 123
         */
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);

        assertEquals(123, solution.sumNumbers(root));
    }

    @Test
    void testSumNumbersWithRightSkewedTree() {
        T129 solution = new T129();
        /*
         * 构建如下二叉树:
         *   1
         *  /
         * 2
         * /
         *3
         *
         * 路径: 1->2->3 (123)
         * 总和: 123
         */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);

        assertEquals(123, solution.sumNumbers(root));
    }

    @Test
    void testSumNumbersComplexTree() {
        T129 solution = new T129();
        /*
         * 构建如下二叉树:
         *     4
         *    / \
         *   9   0
         *  / \
         * 5   1
         *
         * 路径: 4->9->5 (495), 4->9->1 (491), 4->0 (40)
         * 总和: 495 + 491 + 40 = 1026
         */
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(9);
        root.right = new TreeNode(0);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(1);

        assertEquals(1026, solution.sumNumbers(root));
    }

    @Test
    void testSumNumbersWithZeroRoot() {
        T129 solution = new T129();
        /*
         * 构建如下二叉树:
         *   0
         *  / \
         * 1   2
         *
         * 路径: 0->1 (1), 0->2 (2)
         * 总和: 1 + 2 = 3
         */
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);

        assertEquals(3, solution.sumNumbers(root));
    }

    @Test
    void testSumNumbersWithMultipleLevels() {
        T129 solution = new T129();
        /*
         * 构建如下二叉树:
         *      1
         *     / \
         *    2   3
         *   / \   \
         *  4   5   6
         *
         * 路径: 1->2->4 (124), 1->2->5 (125), 1->3->6 (136)
         * 总和: 124 + 125 + 136 = 385
         */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        assertEquals(385, solution.sumNumbers(root));
    }
}
