package 代码随想录.数组;

/*
 * 35. 搜索插入位置
 * */
public class leetcode_35 {
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int left = 0, right = nums.length, mid = 0;
            while (left <= right) {
                mid = (left + right) / 2;
                if (target > nums[nums.length - 1]) {
                    return nums.length;
                } else if (target < nums[0]) {
                    return 0;
                } else if (nums[mid] > target) {
                    right = mid - 1;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    return mid;
                }
            }
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < target && nums[i + 1] > target) {
                    return i + 1;
                }
            }
            return -1;
        }
    }
}
