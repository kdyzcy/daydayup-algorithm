package leetcode;

public class leetcode_242 {
    class Solution {
        public boolean isAnagram(String s, String t) {
            if(s.length()!=t.length()){
                return false;
            }
            int[] arr=new int[26];
            for (int i = 0; i < s.length(); i++) {
                arr[s.charAt(i)-'a']++;
            }
            for (int i=s.length()-1;i>=0;i--){
                arr[t.charAt(i)-'a']--;
            }
            for (int a:arr) {
                if(a!=0){
                    return false;
                }
            }
            return true;
        }
    }
}
