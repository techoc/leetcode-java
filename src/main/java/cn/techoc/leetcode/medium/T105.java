package cn.techoc.leetcode.medium;

import cn.techoc.leetcode.utils.TreeNode;

import java.util.Arrays;

public class T105 {
    /**
     * 根据前序遍历和中序遍历构建二叉树
     *
     * @param preorder 前序遍历数组
     * @param inorder  中序遍历数组
     * @return 构建好的二叉树根节点
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }
        // 找到根节点在中序遍历中的索引
        int rootIndex = Arrays.stream(inorder).boxed().toList().indexOf(preorder[0]);// 左子树的大小
        // 分割前序遍历数组为左子树和右子树部分
        int[] pre1 = Arrays.copyOfRange(preorder, 1, 1 + rootIndex);
        int[] pre2 = Arrays.copyOfRange(preorder, 1 + rootIndex, preorder.length);
        // 分割中序遍历数组为左子树和右子树部分
        int[] in1 = Arrays.copyOfRange(inorder, 0, rootIndex);
        int[] in2 = Arrays.copyOfRange(inorder, 1 + rootIndex, preorder.length);
        // 递归构建左子树和右子树
        TreeNode left = buildTree(pre1, in1);
        TreeNode right = buildTree(pre2, in2);
        return new TreeNode(preorder[0], left, right);
    }

}
