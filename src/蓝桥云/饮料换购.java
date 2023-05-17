package 蓝桥云;

import java.util.Scanner;

public class 饮料换购 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=n;
        int c=n;//剩余瓶盖数
        while (c>=3){
            sum+=c/3;
            c=(c/3)+c%3;
        }
        System.out.println(sum);
    }
}
