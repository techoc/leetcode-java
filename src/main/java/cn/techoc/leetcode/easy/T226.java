package cn.techoc.leetcode.easy;

import cn.techoc.leetcode.utils.TreeNode;

public class T226 {
    /**
     * <a href="https://leetcode.cn/problems/invert-binary-tree">226. 翻转二叉树</a>
     * 翻转二叉树。
     *
     * @param root 待翻转的二叉树的根节点
     * @return 翻转后的二叉树的根节点
     */
    public TreeNode invertTree(TreeNode root) {
        // 递归终止条件：如果当前节点为空，直接返回null
        if (root == null) {
            return null;
        }

        // 交换当前节点的左右子树
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);

        // 返回翻转后的根节点
        return root;
    }

}
