package cn.itcast.day17;

@FunctionalInterface
public interface CalAble {
    // 定义一个方法，传递一个整数，对该整数进行绝对值计算
    int absolute(int num);
}
