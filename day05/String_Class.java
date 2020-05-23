package cn.itcast.day05;

public class String_Class {
    public static void main(String[] args) {
        // 将字符型数组转化为字符串类型
        char[] charArray = {'A', 'B', 'C'};
        String str = new String(charArray);
        System.out.println(str);  // ABC
    }
}
