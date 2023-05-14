package java_40;
/*
* 题目：判断101-200之间有多少个素数，并输出所有素数。
* */
public class exp2 {
    public static void main(String[] args) {
        int count=0;
        for (int i = 101; i <=200 ; i++) {
            if(sushuJudge(i)==true){
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
    }

    public static boolean sushuJudge(int i){
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if(i%j==0){
                return false;
            }
        }
        System.out.print(i+" ");
        return true;
    }
}
