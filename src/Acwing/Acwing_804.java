package Acwing;

import java.util.Scanner;

//804. n的阶乘
public class Acwing_804 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long ans=1;
        for (int i = 1; i <=n ; i++) {
            ans*=i;
        }
        System.out.println(ans);
    }
}
