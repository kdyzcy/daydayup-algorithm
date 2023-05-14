package 周赛;

import java.util.Scanner;

public class code01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int dp[]=new int[n];
        for (int i = 0; i < n; i++) {
            dp[i]=sc.nextInt();
        }
        int flag=0;
        for (int i = 0; i < n; i++) {
            int temp=dp[i];
            for (int j = 0; j < n; j++) {
                if(j!=i){
                    temp+=dp[j];
                    for (int k = 0; k < n; k++) {
                        if(temp==dp[k]){
                            System.out.println(dp[i]+" "+dp[j]+" "+temp);
                            flag=1;
                        }
                    }
                }
            }
        }
        if(flag==0){
            System.out.println(-1);
        }
    }
}
