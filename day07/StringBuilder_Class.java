package cn.itcast.day07;

public class StringBuilder_Class {
    public static void main(String[] args) {
        // 空参数方法
        StringBuilder s1 = new StringBuilder();
        System.out.println("s1 = " + s1);  // s1 =

        // 带字符串的构造方法
        StringBuilder s2 = new StringBuilder("abc");
        System.out.println("s2 = " + s2);  // s2 = abc

        demo01();
        demo02();
    }

    private static void demo01(){
        // 创建对象
        StringBuilder s1 = new StringBuilder();
        // 使用append方法，向对象中添加元素，方法返回的是this，调用s1.this = s1
        // StringBuilder s2 = s1.append("abc"); s1 与 s2 地址是相同的
        // 常用的是不接受返回值的方式，此时可创建一个可变数组
        s1.append("cbd");
        s1.append(2);
        // 可进行链式编程，即返回的是一个对象，可以就此在调用方法
        System.out.println(s1.append(1).append(2).append(3));
        System.out.println(s1);
    }

    private static void demo02(){
        // 使用toString方法将StringBuilder对象转化为字符串
        String str1 = "Garrett Walker";
        StringBuilder strsb = new StringBuilder();
        strsb.append("shiyu");

        String str2 = strsb.toString();

        System.out.println(str1 + str2);  // Garrett Walkershiyu

    }
}
