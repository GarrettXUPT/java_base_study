package cn.itcast.day12;

public class Person_Use {
    public static void main(String[] args) {

        show01();
    }

    // 单线程执行程序
    /*
    * JVM执行main方法，main方法会进入到栈内存
    * JVM会从操作系统开辟一条main方法到达CPU的执行路径
    * CPU就可以通过这个路径来执行main方法，该路径就叫做主线程
    * */
    public static void show01(){
        Person p1 = new Person("李雷");
        p1.run();

        Person p2 = new Person("韩梅梅");
        p2.run();
    }
}
