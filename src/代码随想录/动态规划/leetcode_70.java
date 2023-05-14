package 代码随想录.动态规划;
/*
* 爬楼梯
* */
public class leetcode_70 {
    class Solution {
        public int climbStairs(int n) {
            if(n==1||n==2){
                return n;
            }
            int arr[]=new int[n+1];
            if(n>2){
                for (int i = 2; i <= n; i++) {
                    arr[0]=1;
                    arr[1]=2;
                    arr[i]=arr[i-1]+arr[i-2];
                }
            }
            return arr[n-1];
        }
    }
}
