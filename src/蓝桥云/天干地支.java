package 蓝桥云;

import java.util.Scanner;

public class 天干地支 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] tian={"jia","yi","bing","ding","wu","ji","geng","xin","ren","gui"};
        String[] di={"zi","chou","yin","mao","chen","si","wu","wei","shen","you","xu","hai"};
        int t=(n%10+6)%10;
        int d=(n%12+8)%12;
        System.out.println(tian[t]+di[d]);
    }
}
