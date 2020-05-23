package cn.itcast.day07;

public class MyInterfaceImplement implements MyInterface {

    @Override
    public void method_one() {
        System.out.println("实现类覆盖重写方法1");

    }

    @Override
    public void method_two() {
        System.out.println("实现类覆盖重写方法2");
    }
}
