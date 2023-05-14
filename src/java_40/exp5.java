package java_40;

import java.util.Scanner;

/*
* 题目：利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
 * */
public class exp5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String grade=n>90?"A":(n>60?"B":"C");
        System.out.println(grade);
    }
}
