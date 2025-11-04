package cn.techoc.leetcode.medium;

import cn.techoc.leetcode.utils.TreeNode;

import java.util.Arrays;

public class T106 {
    /**
     * <a href="https://leetcode.cn/problems/construct-binary-tree-from-inorder-and-postorder-traversal">106. 从中序与后序遍历序列构造二叉树</a>
     * 根据给定的中序遍历和后序遍历数组构建二叉树。
     *
     * @param inorder   中序遍历数组
     * @param postorder 后序遍历数组
     * @return 构建的二叉树的根节点
     */
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        // 如果中序遍历数组为空，则返回空节点
        if (inorder.length == 0) {
            return null;
        }
        // 在中序遍历中找到根节点的位置（后序遍历的最后一个元素即为根节点）
        int rootIndex = Arrays.stream(inorder).boxed().toList().indexOf(postorder[postorder.length - 1]);
        // 分割中序遍历数组为左子树和右子树的中序遍历
        int[] in1 = Arrays.copyOfRange(inorder, 0, rootIndex);
        int[] in2 = Arrays.copyOfRange(inorder, rootIndex + 1, n);
        // 分割后序遍历数组为左子树和右子树的后序遍历
        int[] post1 = Arrays.copyOfRange(postorder, 0, rootIndex);
        int[] post2 = Arrays.copyOfRange(postorder, rootIndex, n - 1);
        // 递归构建左子树和右子树
        TreeNode left = buildTree(in1, post1);
        TreeNode right = buildTree(in2, post2);
        // 创建根节点并返回
        return new TreeNode(postorder[n - 1], left, right);
    }

}
