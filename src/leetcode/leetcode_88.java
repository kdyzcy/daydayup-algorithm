package leetcode;

import java.util.Arrays;

/*
* 88. 合并两个有序数组
* */
public class leetcode_88 {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            if(m==0||n==0){
                System.out.println(m!=0?nums1.toString():nums2.toString());
            }
            for (int i = m,j=0; i <nums1.length ; i++,j++) {
                nums1[i]=nums2[j];
            }
            Arrays.sort(nums1);
            System.out.println(nums1.toString());
        }
    }
}
