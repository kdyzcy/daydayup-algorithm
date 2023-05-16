package 校OJ;

import java.util.Scanner;

public class gxcpc_1001 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i]; j++) {
                if(j==arr[i]-1){
                    System.out.print("AC");
                }else{
                    System.out.print("AC"+" ");
                }
            }
            System.out.println();
        }
    }
}
