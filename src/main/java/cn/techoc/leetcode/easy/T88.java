package cn.techoc.leetcode.easy;

public class T88 {
    /**
     * <a href="https://leetcode.cn/problems/merge-sorted-array">88. 合并两个有序数组</a>
     *
     * @param nums1 数组1
     * @param m     m
     * @param nums2 数组2
     * @param n     n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 双指针尾遍历法
        int p1 = m - 1, p2 = n - 1;
        int p = nums1.length - 1;
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p--;
            p2--;
        }
    }
}
