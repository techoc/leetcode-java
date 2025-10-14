package cn.techoc.leetcode.medium;

import java.util.ArrayDeque;
import java.util.Deque;

public class T71 {
    /**
     * 简化给定的Unix路径。
     *
     * @param path 字符串形式的Unix路径
     * @return 简化后的Unix路径字符串
     */
    public String simplifyPath(String path) {
        // 处理null输入
        if (path == null) {
            return "/";
        }

        // 创建一个栈，用于存储路径中的目录
        String[] dirs = path.split("/");
        Deque<String> stack = new ArrayDeque<>();
        for (String dir : dirs) {
            if (dir.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!dir.equals(".") && !dir.isEmpty()) {
                stack.push(dir);
            }
        }

        StringBuilder sb = new StringBuilder();
        // 从栈底到栈顶构建路径（避免在开头插入）
        while (!stack.isEmpty()) {
            sb.append("/").append(stack.pollLast());
        }

        return sb.isEmpty() ? "/" : sb.toString();
    }
}
