package leetcode;

import java.util.Scanner;

//面试题 16.05. 阶乘尾数
public class mainshi1605 {

}
class Solution {
    public int trailingZeroes(int n) {
        int count=0;
        while (n>=5){
            n/=5;
            count+=n;
        }
        return count;
    }
}