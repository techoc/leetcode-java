package cn.techoc.leetcode.easy;

import cn.techoc.leetcode.utils.TreeNode;

public class T100 {
    /**
     * <a href="https://leetcode.cn/problems/same-tree">100. 相同的树</a>
     * 判断两个二叉树是否相同。
     *
     * @param p 第一个二叉树的根节点
     * @param q 第二个二叉树的根节点
     * @return 如果两棵树完全相同则返回true，否则返回false
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 两个节点都为空，认为相同
        if (p == null && q == null) {
            return true;
        }
        // 其中一个节点为空，另一个不为空，则不相同
        if (p == null || q == null) {
            return false;
        }
        // 节点值不相等，则不相同
        if (p.val != q.val) {
            return false;
        }
        // 递归比较左子树和右子树是否都相同
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

}
