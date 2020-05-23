package cn.itcast.day06;

public class Zi extends Fu{

    int num = 20;
    int age = 18;

    @Override
    public void method() {
        System.out.println("这个是子类方法");
    }

    public void methodZi(){
        System.out.println("这是子类特有方法");
    }
}
