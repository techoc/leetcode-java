package cn.techoc.leetcode.medium;

public class T12 {
    private static final String[] ROMAN = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private static final int[] NUM = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    /**
     * <a href="https://leetcode.cn/problems/integer-to-roman">12. 整数转罗马数字</a>
     *
     * @param num 整数
     * @return 罗马数字
     */
    public String intToRoman(int num) {
        StringBuilder ans = new StringBuilder();
        while (num > 0) {
            for (int i = 0; i < NUM.length; i++) {
                if (num >= NUM[i]) {
                    ans.append(ROMAN[i]);
                    num -= NUM[i];
                    break;
                }
            }
        }
        return ans.toString();
    }
}
