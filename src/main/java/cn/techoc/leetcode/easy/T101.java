package cn.techoc.leetcode.easy;

import cn.techoc.leetcode.utils.TreeNode;

public class T101 {
    /**
     * <a href="https://leetcode.cn/problems/symmetric-tree">101. 对称二叉树</a>
     * 检查给定的二叉树是否是对称的。
     *
     * @param root 二叉树的根节点
     * @return 如果二叉树是对称的则返回true，否则返回false
     */
    public boolean isSymmetric(TreeNode root) {
        // 通过比较根节点与自身的镜像来判断是否对称
        return isSymmetric(root, root);
    }


    /**
     * 判断两个二叉树是否互为镜像
     *
     * @param p 第一个二叉树的根节点
     * @param q 第二个二叉树的根节点
     * @return 如果两个二叉树互为镜像则返回true，否则返回false
     */
    private boolean isSymmetric(TreeNode p, TreeNode q) {
        // 递归终止条件：两个节点都为空，说明对称
        if (p == null && q == null) {
            return true;
        }
        // 递归终止条件：其中一个节点为空，另一个不为空，说明不对称
        if (p == null || q == null) {
            return false;
        }
        // 递归判断：当前节点值相等，且p的左子树与q的右子树对称，p的右子树与q的左子树对称
        return p.val == q.val && isSymmetric(p.left, q.right) && isSymmetric(p.right, q.left);
    }


}
