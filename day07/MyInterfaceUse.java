package cn.itcast.day07;

public class MyInterfaceUse {
    public static void main(String[] args) {
        // 使用实现类来用方法
        MyInterface impl = new MyInterfaceImplement();
        impl.method_one();
        impl.method_two();

        // 使用匿名内部类
        MyInterface obj = new MyInterface(){
            @Override
            public void method_one(){
                System.out.println("使用匿名内部类1");
            }

            @Override
            public void method_two() {
                System.out.println("使用匿名方法类2");
            }
        };
        obj.method_one();  // 使用匿名内部类
        obj.method_two();
    }
}
