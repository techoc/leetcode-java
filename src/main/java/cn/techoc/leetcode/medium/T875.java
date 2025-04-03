package cn.techoc.leetcode.medium;

public class T875 {
    /**
     * <a href="https://leetcode.cn/problems/koko-eating-bananas">875. 爱吃香蕉的珂珂</a>
     *
     * @param piles 香蕉堆
     * @param h     小时
     * @return 最小速度
     */
    public int minEatingSpeed(int[] piles, int h) {
        int left = 0, right = 0;
        for (int pile : piles) {    // 找到最大堆 则为右边界
            right = Math.max(right, pile);
        }
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (check(mid, piles, h)) { // 如果速度足够吃完，则缩小右边界
                right = mid;
            } else {
                left = mid;
            }
        }
        return right;
    }

    private boolean check(int mid, int[] piles, int h) {
        int sum = piles.length;
        for (int pile : piles) {
            sum += (pile - 1) / mid;
            if (sum > h) { // 如果时间不够 则返回false
                return false;
            }
        }
        return true;
    }
}
