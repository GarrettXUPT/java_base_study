package cn.itcast.day04;
import java.util.Scanner;

public class Scanner_Class_Use {
    public static void main(String[] args) {
        System.out.println("请输入第一个数字：");
        Scanner sc = new Scanner(System.in);
        // 将键盘上输入的字符串转化为整形数字
        int num = sc.nextInt();
        System.out.println("键盘上输入的数字为：" + num);
        System.out.println("请输入内容");
        // 由键盘上输入的本身就是字符串
        String str = sc.next();
        System.out.println("键盘上输入的内容为：" + str);
    }
}
