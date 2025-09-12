package cn.techoc.leetcode.medium;

public class T3227 {
    /**
     * <a href="https://leetcode.cn/problems/vowels-game-in-a-string">3227. 字符串元音游戏</a>
     *
     * @param s 字符串
     * @return Alice 是否能赢得比赛
     */
    public boolean doesAliceWin(String s) {
        // 判断字符串中元音字母的个数
        int count = s.length() - s.replaceAll("[aeiou]", "").length();
        // 偶数个元音字母，且至少有一个元音字母
        return count != 0;
    }
}
