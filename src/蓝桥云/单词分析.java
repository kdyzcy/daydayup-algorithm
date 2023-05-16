package 蓝桥云;

import java.util.Arrays;
import java.util.Scanner;

public class 单词分析 {
    public static void main(String[] args) {
        int[] arr=new int[26];
        int max=arr[0];
        int max_index=0;
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        for (int i = 0; i < str.length(); i++) {
            int temp=str.charAt(i);
            arr[temp-'a']++;
        }
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
                max_index=i;
            }
        }
        char ans=(char)(max_index+97);
        System.out.println(ans);
        System.out.println(max);
    }
}
