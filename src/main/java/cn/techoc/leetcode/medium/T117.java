package cn.techoc.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class T117 {
    private final List<Node> pre = new ArrayList<>();


    /**
     * 连接二叉树的每个节点的next指针，使得每个节点的next指向其右侧相邻的节点。
     * 如果当前节点没有右侧相邻节点，则next应该设置为null。
     *
     * @param root 树的根节点
     * @return 连接后的树的根节点
     */
    Node connect(Node root) {
        dfs(root, 0); // 根节点的深度为 0
        return root;
    }

    /**
     * 使用深度优先搜索遍历二叉树，为每一层的节点建立横向连接
     *
     * @param node  当前访问的节点
     * @param depth 当前节点所在的深度（根节点深度为0）
     */
    private void dfs(Node node, int depth) {
        if (node == null) {
            return;
        }
        // 处理当前节点在该层的连接关系
        if (depth == pre.size()) { // node 是这一层最左边的节点
            pre.add(node);
        } else { // pre[depth] 是 node 左边的节点
            pre.get(depth).next = node; // node 左边的节点指向 node
            pre.set(depth, node);
        }
        // 递归处理左右子树
        dfs(node.left, depth + 1);
        dfs(node.right, depth + 1);
    }


    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node(int _val) {
            val = _val;
        }
    }
}
