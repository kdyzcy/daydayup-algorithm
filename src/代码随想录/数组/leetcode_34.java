package 代码随想录.数组;

import java.util.Arrays;

/*
* 34. 在排序数组中查找元素的第一个和最后一个位置
* */
public class leetcode_34 {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int[] ans= {-1,-1};
            if (nums==null){
                return ans;
            }
            ans[0]=findMostLeftIndex(nums, target);
            ans[1]=findMostRightIndex(nums, target);
            if(Arrays.binarySearch(nums,target)<0){
               ans[0]=-1;
               ans[1]=-1;
            }
            return ans;
        }
        public int findMostLeftIndex(int[] nums, int target){
            int left=0,right=nums.length-1,mid=0;
            int ans=-1;
            while(left<=right){
                mid=(left+right)/2;
                if(nums[mid]>=target){
                    ans=mid;
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }
            return ans;
        }
        public int findMostRightIndex(int[] nums,int target){
            int left=0,right=nums.length-1,mid=0;
            int ans=-1;
            while(left<=right){
                mid=(left+right)/2;
                if(nums[mid]<=target){
                    ans=mid;
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
            return ans;
        }
    }
}
