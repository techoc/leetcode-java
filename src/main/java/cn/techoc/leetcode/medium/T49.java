package cn.techoc.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class T49 {
    /**
     * <a href="https://leetcode.cn/problems/group-anagrams">49. 字母异位词分组</a>
     *
     * @param strs 字符串数组
     * @return 字符串数组中字母异位词的分组
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        List<List<String>> ans = new ArrayList<>();
        List<String> stringList = new ArrayList<>(List.of(strs));
        while (!stringList.isEmpty()) {
            List<String> temp = new ArrayList<>();
            String s1 = stringList.remove(0);

            // 计算是否为映射
            for (String str : strs) {
                if (isAnagram(s1, str)) {
                    temp.add(str);
                    stringList.remove(str); // 移除已匹配的字符串
                }
            }
            ans.add(temp);
        }
        return ans;
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int j : count) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }
}
