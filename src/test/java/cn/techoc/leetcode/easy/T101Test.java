package cn.techoc.leetcode.easy;

import cn.techoc.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * 对 T101 类中 isSymmetric(TreeNode root) 方法进行单元测试
 */
class T101Test {

    private final T101 solution = new T101();

    /**
     * 构造一个TreeNode树结构用于测试
     * 示例格式：[1,2,2,3,4,4,3]
     */
    private TreeNode buildTree(Integer[] values) {
        if (values.length == 0 || values[0] == null) return null;

        TreeNode root = new TreeNode(values[0]);
        java.util.Queue<TreeNode> queue = new java.util.LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (!queue.isEmpty() && i < values.length) {
            TreeNode node = queue.poll();

            if (values[i] != null) {
                node.left = new TreeNode(values[i]);
                queue.offer(node.left);
            }
            i++;

            if (i < values.length && values[i] != null) {
                node.right = new TreeNode(values[i]);
                queue.offer(node.right);
            }
            i++;
        }

        return root;
    }

    @Test
    void testNullRoot_shouldReturnTrue() {
        // 测试输入为 null 的情况
        assertTrue(solution.isSymmetric(null));
    }

    @Test
    void testSingleNode_shouldReturnTrue() {
        // 测试仅有一个节点的情况 [1]
        TreeNode root = new TreeNode(1);
        assertTrue(solution.isSymmetric(root));
    }

    @Test
    void testSymmetricTree_shouldReturnTrue() {
        // 测试完全对称的树 [1,2,2,3,4,4,3]
        Integer[] input = {1, 2, 2, 3, 4, 4, 3};
        TreeNode root = buildTree(input);
        assertTrue(solution.isSymmetric(root));
    }

    @Test
    void testAsymmetricStructure_shouldReturnFalse() {
        // 结构不对称 [1,2,2,null,3,null,3]
        Integer[] input = {1, 2, 2, null, 3, null, 3};
        TreeNode root = buildTree(input);
        assertFalse(solution.isSymmetric(root));
    }

    @Test
    void testDifferentValues_shouldReturnFalse() {
        // 值不同导致不对称 [1,2,3]
        Integer[] input = {1, 2, 3};
        TreeNode root = buildTree(input);
        assertFalse(solution.isSymmetric(root));
    }
}
