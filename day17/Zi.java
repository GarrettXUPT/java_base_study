package cn.itcast.day17;

public class Zi extends Fu{
    // 重写父类方法

    @Override
    public void sayHello() {
        System.out.println("啥都不说，你来干啥");
    }

    // 定义一个方法传递GreatAble接口
    public void method(GreatAble greatAble){
        greatAble.great();
    }

    public void show1(){
        // 调用method方法，方法的参数传递的是函数式接口，所以可以传递lambda
        method(() ->{
            // 创建父类
            Fu fu = new Fu();
            // 调用父类的sayHello
            fu.sayHello();
        });
    }

    // 使用一般的lambda表达式
    public void showPala(){
        method(()->super.sayHello());
    }

    // 使用方法引用优化lambda
    public void show2(){
        method(super::sayHello);
    }

    // 使用this引用本类成员方法
    public void show3(){
        method(this::sayHello);
    }

    public static void main(String[] args) {
//        new Zi().show1();  // sayHello
//        new Zi().show2();  // sayHello
          new Zi().show3();  // 啥都不说，你来干啥
    }
}
