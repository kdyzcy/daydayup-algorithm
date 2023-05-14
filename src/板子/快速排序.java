package 板子;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 31082
 */
public class 快速排序 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void quickSort(int q[], int l, int r){
        if(l>=r){
            return;
        }
        int x=q[l],i=l-1,j=r+1;
        while(i<j){
            do {
                i++;
            }
            while (q[i]<x);
            do{
                j--;
            }
            while (q[j]>x);
            if(i<j){
                int temp=q[i];
                q[i]=q[j];
                q[j]=temp;
            }
        }
        quickSort(q,l,r);
        quickSort(q,j+1,r);
    }
}
