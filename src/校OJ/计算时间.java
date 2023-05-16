package 校OJ;

import java.text.DecimalFormat;
import java.util.Scanner;

public class 计算时间 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int h=arr[i]/3600;
            int m=(arr[i]-h*3600)/60;
            int s=arr[i]-h*3600-m*60;
            DecimalFormat df=new DecimalFormat("00");
            System.out.println(df.format(h)+":"+df.format(m)+":"+df.format(s));
        }
    }
}
