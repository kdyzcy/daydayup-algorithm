package leetcode;
//27. 移除元素
public class leetcode_27 {
    class Solution {
        public int removeElement(int[] nums, int val) {
            int len=nums.length;
            for (int i = 0; i < len; i++) {
                if(nums[i]==val){
                    for (int j = i+1; j <=len-1 ; j++) {
                        nums[j-1]=nums[j];
                    }
                    i--;
                    len--;
                }
            }
            return len;
        }
    }
}
