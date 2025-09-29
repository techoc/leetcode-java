package cn.techoc.leetcode.medium;


import java.util.Arrays;

public class T6 {
    /**
     * <a href="https://leetcode.cn/problems/zigzag-conversion">6. Z 字形变换</a>
     *
     * @param s       字符串
     * @param numRows 行数
     * @return 转换后的字符串
     */
    public String convert(String s, int numRows) {
        // 特殊情况处理：行数小于等于1时直接返回原字符串
        if (numRows <= 1) {
            return s;
        }

        // 初始化每行字符串数组
        int len = Math.min(s.length(), numRows);
        String[] rows = new String[len];
        Arrays.fill(rows, "");

        // loc表示当前字符应该放置的行号，down表示移动方向
        int loc = 0;
        boolean down = false;

        // 遍历字符串中的每个字符，按Z字形规律分配到对应行
        for (int i = 0; i < s.length(); i++) {
            rows[loc] += s.substring(i, i + 1);
            // 当到达顶部或底部时，改变移动方向
            if (loc == 0 || loc == numRows - 1)
                down = !down;
            // 根据方向更新当前位置
            loc += down ? 1 : -1;
        }

        // 将所有行的字符串拼接成最终结果
        StringBuilder ans = new StringBuilder();
        for (String row : rows) {
            ans.append(row);
        }
        return ans.toString();
    }


}
