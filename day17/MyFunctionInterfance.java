package cn.itcast.day17;

@FunctionalInterface  // 用来标注为函数式接口，也可以检查接口是否为函数式接口，若是，则编译成功，若否，则编译失败
public interface MyFunctionInterfance {
    // 定义一个抽象方法
    public abstract void method1();

}
