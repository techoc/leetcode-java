package cn.techoc.leetcode.easy;

public class T86 {

    /**
     * <a href="https://leetcode.cn/problems/partition-list">86. 分隔链表</a>
     *
     * @param head head
     * @param x    x
     * @return ListNode
     */
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) return head;
        // 创建两个虚拟头节点
        // dummy1 存储小于 x 的节点
        ListNode dummy1 = new ListNode(0);
        // dummy2 存储大于等于 x 的节点
        ListNode dummy2 = new ListNode(0);
        // 遍历原链表，将节点插入到 dummy1 或 dummy2 中
        ListNode cur = head;
        ListNode cur1 = dummy1;
        ListNode cur2 = dummy2;
        while (cur != null) {
            if (cur.val < x) { // 小于 x 的节点插入到 dummy1 中
                cur1.next = cur;
                cur1 = cur1.next;
            } else { // 大于等于 x 的节点插入到 dummy2 中
                cur2.next = cur;
                cur2 = cur2.next;
            }

            // 断开原链表中的节点
            ListNode temp = cur.next;
            cur.next = null;
            cur = temp;
        }
        // 将 dummy2 中的节点连接到 dummy1 中
        cur1.next = dummy2.next;
        return dummy1.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
