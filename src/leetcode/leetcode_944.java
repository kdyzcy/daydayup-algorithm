package leetcode;


public class leetcode_944 {
    class Solution {
        public int totalFruit(int[] fruits) {
           int n=fruits.length,ans=0;
           int[] cou=new int[n+10];
            for (int i = 0,j=0,tot=0; i <n; i++) {
                if(--cou[fruits[j]]==1){
                    tot++;
                }
                while(tot>2){
                    if(--cou[fruits[j++]]==0){
                        tot--;
                    }
                }
                ans=Math.max(ans,i-j+1);
            }
            return ans;
        }
    }
}