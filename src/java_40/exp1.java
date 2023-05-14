package java_40;

import java.util.Scanner;

/*
* 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第四个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
* */
public class exp1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        arr[0]=1;
        arr[1]=1;
        for (int i = 2; i < n; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println(arr[n-1]);
    }
}
