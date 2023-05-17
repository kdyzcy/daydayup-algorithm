package leetcode;

import java.util.HashSet;
import java.util.Set;

public class leetcode_202 {
    class Solution {
        public boolean isHappy(int n) {
            Set<Integer> set1=new HashSet<>();
            while (n!=1&&!set1.contains(n)){
                set1.add(n);
                n=getnextnum(n);
            }
            return n==1;
        }
        public int getnextnum(int n){
            int ans=0;
            while (n>0){
                int temp=n%10;
                ans+=temp*temp;
                n=n/10;
            }
            return n;
        }
    }
}
