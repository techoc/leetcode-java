package cn.techoc.leetcode.medium;

public class T134 {
    /**
     * <a href="https://leetcode.cn/problems/gas-station">134. 加油站</a>
     *
     * @param gas  整数数组
     * @param cost 整数数组
     * @return 编号
     */
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int ans = 0;
        int minS = 0; // 最小油量
        int s = 0;// 当前油量
        for (int i = 0; i < gas.length; i++) {
            s += gas[i] - cost[i];  // 在 i 站加油 从 i 到 i+1 站消耗的油量
            if (s < minS) {
                minS = s;   // 更新最小油量
                ans = i + 1; // 最小油量所在站编号   减去 cost 之后 已经到下一个站点了
            }
        }
        return s < 0 ? -1 : ans;    // 如果 s < 0 表示无法完成
    }
}
