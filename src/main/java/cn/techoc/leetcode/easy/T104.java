package cn.techoc.leetcode.easy;

import cn.techoc.leetcode.utils.TreeNode;

public class T104 {
    /**
     * <a href="https://leetcode.cn/problems/maximum-depth-of-binary-tree">104. 二叉树的最大深度</a>
     * 计算给定二叉树的最大深度。
     *
     * @param root 二叉树的根节点
     * @return 二叉树的最大深度
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
