package 蓝桥云;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class 排序 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if(i==n-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        for (int i = n-1; i >=0; i--) {
            if(i==0){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+" ");
            }
        }
    }
}
