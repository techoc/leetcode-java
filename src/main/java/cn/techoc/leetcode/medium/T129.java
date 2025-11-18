package cn.techoc.leetcode.medium;

import cn.techoc.leetcode.utils.TreeNode;

public class T129 {
    /**
     * <a href="https://leetcode.cn/problems/sum-root-to-leaf-numbers">129. 求根到叶子节点数字之和</a>
     * <p>
     * 计算二叉树所有从根到叶子路径数字之和。
     *
     * @param root 二叉树的根节点
     * @return 所有从根到叶子路径数字之和
     */
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    /**
     * 使用深度优先搜索计算从根到叶节点生成的所有数字之和
     *
     * @param root 当前处理的树节点
     * @param sum  从根节点到当前节点路径表示的数字
     * @return 从当前节点向下遍历到所有叶节点组成的数字之和
     */
    private int dfs(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        sum = sum * 10 + root.val;
        if (root.left == null && root.right == null) {
            return sum;
        }
        return dfs(root.left, sum) + dfs(root.right, sum);
    }
}
