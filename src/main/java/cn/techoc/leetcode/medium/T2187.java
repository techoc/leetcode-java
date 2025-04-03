package cn.techoc.leetcode.medium;

public class T2187 {
    /**
     * <a href="https://leetcode.cn/problems/minimum-time-to-complete-trips">2187. 完成旅途的最少时间</a>
     *
     * @param time       int[]
     * @param totalTrips int
     * @return long
     */
    public long minimumTime(int[] time, int totalTrips) {
        long left = 0;
        long right = 0;
        for (int t : time) {
            right = Math.max(right, t);
        }
        right *= totalTrips;
        while (left + 1 < right) {
            long mid = left + (right - left) / 2;
            if (check(mid, time, totalTrips)) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return right;
    }

    private boolean check(long mid, int[] time, int totalTrips) {
        long cnt = 0;
        for (int t : time) {
            cnt += mid / t;
            if (cnt >= totalTrips) {
                return true;
            }
        }
        return false;
    }
}
