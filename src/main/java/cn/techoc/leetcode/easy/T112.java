package cn.techoc.leetcode.easy;

import cn.techoc.leetcode.utils.TreeNode;

public class T112 {

    /**
     * <a href="https://leetcode.cn/problems/path-sum">112. 路径总和</a>
     * <p>
     * 判断给定的二叉树中是否存在从根节点到叶子节点的路径，该路径上所有节点值相加等于目标和。
     *
     * @param root      二叉树的根节点
     * @param targetSum 目标和
     * @return 如果存在这样的路径则返回true，否则返回false
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // 递归解法
        return dfs(root, targetSum);
    }

    private boolean dfs(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {  // 判断当前节点是否是叶子节点
            return targetSum == root.val;
        }
        return dfs(root.left, targetSum - root.val) || dfs(root.right, targetSum - root.val);   // 递归判断左右子树
    }
}
