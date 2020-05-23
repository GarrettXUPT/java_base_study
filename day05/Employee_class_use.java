package cn.itcast.day05;

public class Employee_class_use {
    public static void main(String[] args) {
        // 创建一个子类对象
        Employee_use ep = new Employee_use();
        // 执行父类方法
        ep.method();
        // 执行子类方法
        ep.method_use();
    }
}
