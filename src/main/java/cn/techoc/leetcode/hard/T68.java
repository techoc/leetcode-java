package cn.techoc.leetcode.hard;

import java.util.ArrayList;
import java.util.List;

public class T68 {
    /**
     * <a href="https://leetcode.cn/problems/text-justification">68. 文本左右对齐</a>
     *
     * @param words    单词数组
     * @param maxWidth 每行最大字符宽度
     * @return 对齐后的文本行列表
     */
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        int n = words.length;
        int i = 0;

        // 逐行处理所有单词
        while (i < n) {
            int begin = i;  // 当前行第一个单词的索引
            int totalChars = 0; // 当前行单词总长度（不含空格）

            // 贪心地选择尽可能多的单词放入当前行
            while (i < n && totalChars + words[i].length() + (i - begin) <= maxWidth) {
                totalChars += words[i].length();
                i++;
            }

            // 特殊情况：最后一行或仅有一个单词的行，左对齐
            if (i == n || i - begin == 1) {
                StringBuilder line = new StringBuilder(words[begin]);
                for (int j = begin + 1; j < i; j++) {
                    line.append(" ").append(words[j]);
                }
                // 补足末尾空格至 maxWidth
                line.append(" ".repeat(maxWidth - line.length()));
                res.add(line.toString());
            } else {
                // 多个单词且非最后一行：左右对齐
                // 计算需要填充的空格分布
                int space = (maxWidth - totalChars) / (i - begin - 1); // 平均每个间隔的基础空格数
                int extra = (maxWidth - totalChars) % (i - begin - 1); // 多余的空格数，优先分配给左边

                StringBuilder line = new StringBuilder(words[begin]);
                for (int j = begin + 1; j < i; j++) {
                    // 根据是否在前extra个间隔决定是否多加一个空格
                    int spacesToAdd = space + (j - begin <= extra ? 1 : 0);
                    line.append(" ".repeat(Math.max(0, spacesToAdd)));
                    line.append(words[j]);
                }
                res.add(line.toString());
            }
        }

        return res;
    }

}
