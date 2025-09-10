package cn.techoc.leetcode.medium;

public class T238 {
    /**
     * <a href="https://leetcode.cn/problems/product-of-array-except-self">238. 除自身以外数组的乘积</a>
     *
     * @param nums 整数数组
     * @return 输出数组
     */
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        int[] pre = new int[nums.length];
        pre[0] = 1; // 创建前缀积数组 初始化为 1 因为 1 乘以任何数都等于本身
        for (int i = 1; i < nums.length; i++) {     // 获取前缀积 即 nums[0] * nums[1] * ... * nums[i-1]
            pre[i] = pre[i - 1] * nums[i - 1];
        }

        int[] suf = new int[nums.length];
        suf[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {     // 获取后缀积 即 nums[i+1] * nums[i+2] * ... * nums[n-1]
            suf[i] = suf[i + 1] * nums[i + 1];
        }

        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {     // 获取结果 即 前缀积 * 后缀积
            ans[i] = pre[i] * suf[i];
        }
        return ans;
    }
}
