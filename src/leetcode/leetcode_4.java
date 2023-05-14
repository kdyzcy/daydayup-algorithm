package leetcode;
//4. 寻找两个正序数组的中位数
public class leetcode_4 {
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            double res=0;
            int m=nums1.length;
            int n=nums2.length;
            if(m==0&&n==0){
                return res;
            } else if (n==0) {
                if(m==1){
                    res=nums1[0];
                    return res;
                }
                if (m%2==0) {
                    res=(double)(nums1[m/2]+nums1[m/2-1])/2;
                }else {
                    res=nums1[(m-1)/2];
                }
            }else if (m==0) {
                if (n == 1) {
                    res = nums2[0];
                    return res;
                }
                if (n % 2 == 0) {
                    res = (double) (nums2[n / 2] + nums2[n / 2 - 1]) / 2;
                } else {
                    res = nums2[(n - 1) / 2];
                }
            }else {
                int[] nums=new int[m+n];
                int index = 0;
                int i = 0;
                int j = 0;
                while (index < nums.length) {
                    if (j > n - 1) {
                        nums[index++] = nums1[i++];
                    } else if (i > m - 1) {
                        nums[index++] = nums2[j++];
                    } else if (nums1[i] > nums2[j]) {
                        nums[index++] = nums2[j++];
                    } else {
                        nums[index++] = nums1[i++];
                    }
                }
                int len = nums.length;
                if (len % 2 == 0) {
                    res = (double) (nums[(len / 2) - 1] + nums[len / 2]) / 2;
                } else {
                    res = nums[(len - 1) / 2];
                }
            }
            return res;
        }
    }
}

