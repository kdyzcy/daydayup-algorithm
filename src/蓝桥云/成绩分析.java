package 蓝桥云;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class 成绩分析 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        double avg;
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        Arrays.sort(arr);
        System.out.println(arr[n-1]);
        System.out.println(arr[0]);
        DecimalFormat df=new DecimalFormat("0.00");
        avg=(double) sum/n;
        System.out.println(df.format(avg));
    }
}
