package cn.techoc.leetcode.easy;

public class T2379 {
    /**
     * <a href="https://leetcode.cn/problems/minimum-recolors-to-get-k-consecutive-black-blocks">2379. 得到 K 个黑块的最少涂色次数.</a>
     *
     * @param blocks "WBWBBBW"
     * @param k      2
     * @return 3
     */
    public int minimumRecolors(String blocks, int k) {
        int left = 0, right = 0, count = 0, ans = Integer.MAX_VALUE;
        while (right < blocks.length()) {
            int a = blocks.charAt(right);
            right++;
            if (a == 'W') {
                count++;
            }
            while (right - left >= k) { // 窗口内数据的个数大于等于 k 时，缩小窗口
                ans = Math.min(ans, count);
                int b = blocks.charAt(left);
                left++;
                if (b == 'W') {
                    count--;
                }
            }
        }
        return ans;
    }
}
