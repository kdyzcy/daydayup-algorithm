package java_40;

/*
* 题目：打印出100-999所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。
* 例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。
* */
public class exp3 {
    public static void main(String[] args) {
        int gw,sw,bw;
        for (int i = 100; i <=999 ; i++) {
            bw=i/100;
            sw=i%100/10;
            gw=i%10;
            if(gw*gw*gw+sw*sw*sw+bw*bw*bw==i){
                System.out.print(i+" ");
            }
        }
    }
}
