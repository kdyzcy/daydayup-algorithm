package leetcode;
/*
* 剑指 Offer II 088. 爬楼梯的最少成本
* */
public class jianzhi088 {
    class Solution {
        public int minCostClimbingStairs(int[] cost) {
            int[] dp=new int[cost.length];
            dp[0]=0;
            dp[1]=0;
            for (int i = 2; i <=cost.length ; i++) {
                dp[i]=Math.min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]);
            }
            return dp[cost.length-1];
        }
    }
}
