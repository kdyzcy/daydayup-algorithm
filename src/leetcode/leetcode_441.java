package leetcode;
//441 排列硬币
public class leetcode_441 {
    class Solution {
        public int arrangeCoins(int n) {
            int k=-1;
            while (n>=(k*(k+1))/2){
                k++;
            }
            return k;
        }
    }
}
