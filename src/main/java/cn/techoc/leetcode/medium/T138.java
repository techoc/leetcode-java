package cn.techoc.leetcode.medium;

import cn.techoc.leetcode.utils.Node;

import java.util.HashMap;
import java.util.Map;

public class T138 {
    /**
     * <a href="https://leetcode.cn/problems/copy-list-with-random-pointer">138. 随机链表的复制</a>
     * 复制给定的链表，并保持每个节点的随机指针指向正确的复制节点。
     *
     * @param head 给定链表的头节点
     * @return 复制后的新链表的头节点
     */
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        Node cur = head;
        Map<Node, Node> map = new HashMap<>();
        // 3. 复制各节点，并建立 “原节点 -> 新节点” 的 Map 映射
        while (cur != null) {
            map.put(cur, new Node(cur.val));
            cur = cur.next;
        }
        cur = head;
        // 4. 构建新链表的 next 和 random 指向
        while (cur != null) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        // 5. 返回新链表的头节点
        return map.get(head);
    }
}
