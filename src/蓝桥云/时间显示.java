package 蓝桥云;

import java.text.DecimalFormat;
import java.util.Scanner;

public class 时间显示 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long num=sc.nextLong();
        long ms=num/1000;
        long s=ms%60;
        long m=(ms/60)%60;
        long h=(ms/3600)%24;
        DecimalFormat df=new DecimalFormat("00");
        System.out.println(df.format(h)+":"+df.format(m)+":"+df.format(s));
    }
}
