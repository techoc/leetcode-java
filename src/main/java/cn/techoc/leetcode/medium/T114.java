package cn.techoc.leetcode.medium;

import cn.techoc.leetcode.utils.TreeNode;

public class T114 {


    /**
     * <a href="https://leetcode.cn/problems/flatten-binary-tree-to-linked-list">114. 二叉树展开为链表</a>
     * <p>
     * 将给定的二叉树原地展平为链表，使得每个节点都只有右孩子，且保持从根节点到叶子节点的前序遍历顺序。
     *
     * @param root 二叉树的根节点
     */
    public void flatten(TreeNode root) {
        dfs(root);

    }

    /**
     * 将二叉树原地展开为单链表（按先序遍历顺序）
     * 展开后所有左子指针为null，右子指针指向链表中的下一个节点
     *
     * @param root 二叉树的根节点
     * @return 展开后的链表的尾节点
     */
    private TreeNode dfs(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode leftTail = dfs(root.left);
        TreeNode rightTail = dfs(root.right);
        if (leftTail != null) {
            leftTail.right = root.right; // 左子树链表 -> 右子树链表
            root.right = root.left; // 当前节点 -> 左右子树合并后的链表
            root.left = null;
        }
        // 返回当前子树展开成链表后的尾节点
        return rightTail != null ? rightTail : leftTail != null ? leftTail : root;
    }
}
