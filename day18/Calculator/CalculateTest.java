package cn.itcast.day18.Calculator;

import org.junit.Test;

public class CalculateTest {
    public static void main(String[] args) {
        // 创建对象
        Calculate cal = new Calculate();
        // 测试加法
        System.out.println(cal.add(2, 3));
        // 测试减法
        System.out.println(cal.sub(2,5));
    }
}
