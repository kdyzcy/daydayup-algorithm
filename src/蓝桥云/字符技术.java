package 蓝桥云;

import java.util.Scanner;

public class 字符技术 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] arrs=str.toCharArray();
        int cou=0;
        for (int i = 0; i < arrs.length; i++) {
            if(arrs[i]=='a'||arrs[i]=='e'||arrs[i]=='i'||arrs[i]=='o'||arrs[i]=='u'){
                cou++;
            }
        }
        System.out.println(cou);
        System.out.println(str.length()-cou);
    }
}
