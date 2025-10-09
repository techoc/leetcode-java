package cn.techoc.leetcode.easy;

public class T383 {
    /**
     * <a href="https://leetcode.cn/problems/ransom-note">383. 赎金信</a>
     *
     * @param ransomNote 赎金信字符串
     * @param magazine   杂志字符串
     * @return 是否可以构造赎金信
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] cnt = new int[26];
        for (char c : magazine.toCharArray()) {
            cnt[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (--cnt[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
