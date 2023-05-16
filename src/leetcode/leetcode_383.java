package leetcode;

public class leetcode_383 {
    class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            int[] arr=new int[26];
            for (int i = 0; i < ransomNote.length(); i++) {
                arr[ransomNote.charAt(i)-'a']++;
            }
            for(int i=magazine.length()-1;i>=0;i--){
                arr[magazine.charAt(i)-'a']--;
            }
            for (int a:arr
                 ) {
                if(a>0){
                    return false;
                }
            }
            return true;
        }
    }
}
