package cn.itcast.day17;

public class MyMyfunctionInterfaceUse {
    public static void main(String[] args) {
        // 调用该方法，方法的参数是一个接口，所以可以传递接口的实现类对象
        show01(new MyFunctionInterfaceImpl());

        // 调用该方法，方法的参数是一个接口，所以可以传递接口的匿名内部类
        show01(new MyFunctionInterfance() {
            @Override
            public void method1() {
                System.out.println("这是使用接口匿名内部接口重写接口中的抽象方法");
            }
        });

        // 调用该方法，方法的参数是一个函数式接口，所以我们可以传递lambda表达式
        show01(()->{
            System.out.println("这是lambda表达式型的抽象方法");
        });

        // 简化的lambda表达式
        show01(()-> System.out.println("这是简化的lambda表达式型的抽象"));
    }


    // 定义一个方法，参数使用函数式接口
    public static void show01(MyFunctionInterfance myInter){
        myInter.method1();
    }
}
