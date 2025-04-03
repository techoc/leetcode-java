package cn.techoc.leetcode.medium;

public class T275 {
    /**
     * <a href="https://leetcode.cn/problems/h-index-ii">275. H 指数 II</a>
     *
     * @param citations 升序排列的整数数组
     * @return H 指数
     */
    public int hIndex(int[] citations) {
        // 在区间 (left, right) 内询问
        int n = citations.length;
        int left = 0;
        int right = n + 1;
        while (left + 1 < right) { // 区间不为空
            // 循环不变量：
            // left 的回答一定为「是」
            // right 的回答一定为「否」
            int mid = left + (right - left) / 2;
            // 引用次数最多的 mid 篇论文，引用次数均 >= mid
            if (citations[n - mid] >= mid) {
                left = mid; // 询问范围缩小到 (mid, right)
            } else {
                right = mid; // 询问范围缩小到 (left, mid)
            }
        }
        // 根据循环不变量，left 现在是最大的回答为「是」的数
        return left;
    }
}
