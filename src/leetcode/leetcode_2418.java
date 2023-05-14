package leetcode;

import java.util.Arrays;

//2418. 按身高排序
public class leetcode_2418 {
    class Solution {
        public String[] sortPeople(String[] names, int[] heights) {
            Integer[] integers=new Integer[names.length];
            for (int i = 0; i < names.length; i++) {
                integers[i]=i;
            }
            Arrays.sort(integers,(a,b)->heights[b]-heights[a]);
            String[] res = new String[names.length];
            for (int i = 0; i < names.length; i++) {
                res[i] = names[integers[i]];
            }
            return res;
        }
    }
}
