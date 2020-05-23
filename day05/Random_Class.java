package cn.itcast.day05;
import java.util.Random;
import java.util.Scanner;

public class Random_Class {
    public static void main(String[] args) {
        Random r = new Random();
        int m = r.nextInt();
        System.out.println("随机数字" + m);
        int m1 = r.nextInt(10);
        System.out.println("随机数字" + m1);

//        // 获取一个1-n的整数
//        System.out.println("请输入n的值");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m2 = r.nextInt(n) + 1;
//        System.out.println("产生的随机数字" + m2);

        // 猜数字游戏  0 - 99 的随机数字
        int real_num = r.nextInt(100);
        while (true){
            System.out.println("请输入猜测的数字：");
            Scanner sc = new Scanner(System.in);
            int guess_num = sc.nextInt();
            if(guess_num == real_num){
                System.out.println("猜测正确");
                break;
            }else if(guess_num > real_num){
                System.out.println("猜大了");
            }else if(guess_num < real_num){
                System.out.println("猜小了");
            }
        }


    }
}
