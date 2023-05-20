package leetcode;

public class leetcode_58 {
    class Solution {
        public int lengthOfLastWord(String s) {
            String[] strs=s.split(" ");
            int len=strs[strs.length-1].length();
            return len;
        }
    }
}
