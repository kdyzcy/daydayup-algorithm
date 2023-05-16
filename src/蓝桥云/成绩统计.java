package 蓝桥云;

import java.text.DecimalFormat;
import java.util.Scanner;

public class 成绩统计 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int jige=0,youxiu=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]>=60){
                jige++;
            }
            if(arr[i]>=85){
                youxiu++;
            }
        }
        double ans1=(double) jige/n;
        double ans2=(double) youxiu/n;
        DecimalFormat format=new DecimalFormat("0%");
        System.out.println(format.format(ans1));
        System.out.println(format.format(ans2));
    }
}
