package 代码随想录.动态规划;
/*
* 剑指 Offer 10- I. 斐波那契数列
* */
public class jianzhi10 {
    class Solution {
        public int fib(int n) {
            int arr[] =new int[n+1];
            if(n==0||n==1){
                return n;
            }
            for (int i = 2; i <= n; i++) {
                arr[0]=0;
                arr[1]=1;
                arr[i]=(arr[i-1]+arr[i-2])%1000000007;
            }
            return arr[n];
        }
    }
}
