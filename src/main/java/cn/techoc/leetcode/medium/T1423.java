package cn.techoc.leetcode.medium;

public class T1423 {
    /**
     * <a href="https://leetcode.cn/problems/maximum-points-you-can-obtain-from-cards">1423. 可获得的最大点数</a>
     *
     * @param cardPoints - 整数数组 cardPoints
     * @param k          - 整数 k
     * @return - 你可以获得的最大点数
     */
    public int maxScore(int[] cardPoints, int k) {  // 转换为求长度为 cardPoints.length - k 的最小子数组和
        int left = 0, right = 0, sum = 0, min = 0;
        int total = 0;
        for (int cardPoint : cardPoints) {
            total += cardPoint;
        }
        if (k == cardPoints.length) {   // 要考虑窗口为 0 的情况
            return total;
        }
        min = total;
        while (right < cardPoints.length) {
            sum += cardPoints[right++];
            while (right - left >= cardPoints.length - k) {    // 窗口大小为 cardPoints.length - k 时，计算最大值
                min = Math.min(min, sum);
                sum -= cardPoints[left++];
            }
        }
        return total - min;
    }
}
