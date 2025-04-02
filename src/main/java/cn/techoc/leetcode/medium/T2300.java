package cn.techoc.leetcode.medium;

import java.util.Arrays;

public class T2300 {
    /**
     * <a href="https://leetcode.cn/problems/successful-pairs-of-spells-and-potions">2300. 咒语和药水的成功对数</a>
     *
     * @param spells  咒语
     * @param potions 药水
     * @param success 成功值
     * @return 成功对数
     */
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        for (int i = 0; i < spells.length; i++) {
            long target = (success - 1) / spells[i];
            if (target < potions[potions.length - 1]) {
                spells[i] = potions.length - upperBound(potions, (int) target);
            } else {
                spells[i] = 0;
            }
        }
        return spells;
    }

    private int upperBound(int[] potions, int target) {
        int left = -1, right = potions.length;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (potions[mid] > target) {
                right = mid;
            } else if (potions[mid] < target) {
                left = mid;
            } else if (potions[mid] == target) {    // 找到第一个大于target的元素
                left = mid;
            }
        }
        return right;
    }
}
