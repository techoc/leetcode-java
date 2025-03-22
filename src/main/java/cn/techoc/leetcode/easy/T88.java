package cn.techoc.easy;

public class T88 {
    /**
     * <a href="https://leetcode.cn/problems/merge-sorted-array">88. 合并两个有序数组</a>
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 双指针
        int pre = m - 1, prv = n - 1;
        int p = nums1.length - 1;
        while (pre >= 0 && prv >= 0) {
            if (nums1[pre] > nums2[prv]) {
                nums1[p] = nums1[prv];
                pre--;
            } else {
                nums1[p] = nums2[prv];
                prv--;
            }
            p--;
        }
        while (prv >= 0) {
            nums1[p] = nums2[prv];
            prv--;
        }
    }
}
