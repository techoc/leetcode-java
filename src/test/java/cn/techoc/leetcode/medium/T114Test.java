package cn.techoc.leetcode.medium;

import cn.techoc.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T114Test {

    @Test
    void testFlattenNullRoot() {
        T114 solution = new T114();
        solution.flatten(null);
        // 测试空树不会报错
    }

    @Test
    void testFlattenSingleNode() {
        T114 solution = new T114();
        TreeNode root = new TreeNode(1);
        solution.flatten(root);

        assertNotNull(root);
        assertEquals(1, root.val);
        assertNull(root.left);
        assertNull(root.right);
    }

    @Test
    void testFlattenCompleteBinaryTree() {
        T114 solution = new T114();
        /*
         * 构建如下二叉树:
         *     1
         *    / \
         *   2   5
         *  / \   \
         * 3   4   6
         */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);

        solution.flatten(root);

        // 验证展开后的链表是否符合前序遍历顺序: 1->2->3->4->5->6
        TreeNode current = root;
        int[] expectedValues = {1, 2, 3, 4, 5, 6};
        for (int expectedValue : expectedValues) {
            assertNotNull(current);
            assertEquals(expectedValue, current.val);
            assertNull(current.left);
            current = current.right;
        }
        assertNull(current); // 最后应该是null
    }

    @Test
    void testFlattenLeftSkewedTree() {
        T114 solution = new T114();
        /*
         * 构建左偏树:
         * 1
         *  \
         *   2
         *    \
         *     3
         */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);

        solution.flatten(root);

        // 验证展开后的链表: 1->2->3
        TreeNode current = root;
        int[] expectedValues = {1, 2, 3};
        for (int expectedValue : expectedValues) {
            assertNotNull(current);
            assertEquals(expectedValue, current.val);
            assertNull(current.left);
            current = current.right;
        }
        assertNull(current);
    }

    @Test
    void testFlattenRightSkewedTree() {
        T114 solution = new T114();
        /*
         * 构建右偏树:
         * 1
         *  \
         *   2
         *    \
         *     3
         */
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);

        solution.flatten(root);

        // 验证展开后的链表: 1->2->3
        TreeNode current = root;
        int[] expectedValues = {1, 2, 3};
        for (int expectedValue : expectedValues) {
            assertNotNull(current);
            assertEquals(expectedValue, current.val);
            assertNull(current.left);
            current = current.right;
        }
        assertNull(current);
    }

    @Test
    void testFlattenComplexTree() {
        T114 solution = new T114();
        /*
         * 构建复杂二叉树:
         *       1
         *      / \
         *     2   3
         *    /   / \
         *   4   5   6
         *      /
         *     7
         */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(7);

        solution.flatten(root);

        // 验证展开后的链表是否符合前序遍历顺序: 1->2->4->3->5->7->6
        TreeNode current = root;
        int[] expectedValues = {1, 2, 4, 3, 5, 7, 6};
        for (int expectedValue : expectedValues) {
            assertNotNull(current);
            assertEquals(expectedValue, current.val);
            assertNull(current.left);
            current = current.right;
        }
        assertNull(current);
    }
}
