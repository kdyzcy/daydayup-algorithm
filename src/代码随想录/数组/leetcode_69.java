package 代码随想录.数组;
/*
* 69. x 的平方根
*
* 二分查找法：
* 对一个非负数n,它的平方根不会大于n/2+1;
* mid=(left+right)/2;可以被等效替换成mid=(left+right)>>1
 * */
public class leetcode_69 {
    class Solution {
        public int mySqrt(int x) {
            if(x==0||x==1){
                return x;
            }
            int left=0,right=x/2+1,mid=0,ans=0;
            while (left<=right){
                mid=(left+right)/2;
                if(mid<=x/mid){
                    left=mid+1;
                    ans=mid;
                }else{
                    right=mid-1;
                }
            }
            return ans;
        }
    }
}
