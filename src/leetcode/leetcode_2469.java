package leetcode;

/*
* 2469. 温度转换
* */
public class leetcode_2469 {
    class Solution {
        public double[] convertTemperature(double celsius) {
            double[] ans=new double[2];
            ans[0]=celsius+273.15;
            ans[1]=celsius*1.80+32.00;
            return ans;
        }
    }
}
