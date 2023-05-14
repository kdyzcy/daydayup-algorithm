package leetcode;
/*
* 2553. 分割数组中数字的数位
* */
public class leetcode_2553 {
    class Solution {
        public int[] separateDigits(int[] nums) {
            String str="";
            for (int i = 0; i < nums.length-1; i++) {
                str=str+nums[i];
            }
            int[] ans=new int[str.length()];
            for (int i = 0; i < str.length()-1; i++) {
                ans[i]=Integer.valueOf(str.charAt(i)-'0');
            }
            return ans;
        }
    }
}
