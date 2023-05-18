package leetcode;

public class jianzhi05 {
    class Solution {
        public String replaceSpace(String s) {
            char[] arrs=s.toCharArray();
            String ans="";
            for (int i = 0; i < s.length(); i++) {
                if(arrs[i]==' '){
                    ans+="%20";
                }else {
                    ans+=arrs[i];
                }
            }
            return ans;
        }
    }
}
