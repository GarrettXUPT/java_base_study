package cn.itcast.day17;

public class MyFunctionInterfaceImpl implements MyFunctionInterfance{
    @Override // 检查是否为函数重写，若是重写，则会编译成功，若否，就编译失败
    public void method1() {
        System.out.println("这是一个抽象方法");
    }
}
