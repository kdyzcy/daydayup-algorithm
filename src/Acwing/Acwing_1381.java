package Acwing;

import java.util.Scanner;

//1381. 阶乘
public class Acwing_1381 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long ans=1;
        for (int i = 1; i <=n ; i++) {
            ans*=i;
        }
        String str=ans+"";
        char[] arr=str.toCharArray();
        for (int i = arr.length-1; i <arr.length; i--) {
            String temp=String.valueOf(arr[i]);
            if(Integer.parseInt(temp)!=0){
                System.out.println(Integer.parseInt(temp));
                return;
            }
        }
    }
}
