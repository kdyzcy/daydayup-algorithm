package leetcode;

import java.util.HashSet;
import java.util.Set;

public class leetcode_349 {
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            if(nums1==null||nums1.length==0||nums2==null|| nums2.length==0){
                return new int[0];
            }
            Set<Integer>set1=new HashSet<>();
            Set<Integer>set2=new HashSet<>();
            for (int a:nums1
                 ) {
                set1.add(a);
            }
            for (int a:nums2
                 ) {
                if(set1.contains(a)){
                    set2.add(a);
                }
            }
            return set2.stream().mapToInt(x->x).toArray();
        }
    }
}
