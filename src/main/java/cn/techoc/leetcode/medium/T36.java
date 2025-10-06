package cn.techoc.leetcode.medium;

import java.util.HashMap;

public class T36 {
    /**
     * <a href="https://leetcode.cn/problems/valid-sudoku">36. 有效的数独</a>
     *
     * @param board 数独
     * @return 是否有效的数独
     */
    public boolean isValidSudoku(char[][] board) {
        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();

        // 1. 数字 1-9 在每一行只能出现一次。
        for (int i = 0; i < 9; i++) { // 遍历行
            characterIntegerHashMap.clear();
            for (int j = 0; j < 9; j++) {   // 遍历列
                char c = board[i][j];
                if (c != '.') {
                    if (characterIntegerHashMap.containsKey(c)) {
                        return false;
                    } else {
                        characterIntegerHashMap.put(c, 1);
                    }
                }
            }
        }
        // 2. 数字 1-9 在每一列只能出现一次。
        for (int i = 0; i < 9; i++) {
            characterIntegerHashMap.clear();
            for (int j = 0; j < 9; j++) {
                char c = board[j][i];
                if (c != '.') {
                    if (characterIntegerHashMap.containsKey(c)) {
                        return false;
                    } else {
                        characterIntegerHashMap.put(c, 1);
                    }
                }
            }
            characterIntegerHashMap.clear();
        }
        // 3. 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                characterIntegerHashMap.clear();
                // 检查每个3x3宫格
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        char c = board[i + k][j + l];
                        if (c != '.') {
                            if (characterIntegerHashMap.containsKey(c)) {
                                return false;
                            } else {
                                characterIntegerHashMap.put(c, 1);
                            }
                        }
                    }
                }
            }
        }

        return true;
    }
}
