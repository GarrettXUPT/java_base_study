package cn.itcast.day18.Reflect;

import cn.itcast.day18.ReflectDomain.Person;

public class ReflectDemo1 {
    /*
    * 获取Class对象的方式：
        1、.forName("全类名"):将字节码文件加载进内存，返回Class对象
        2、类名.class:通过类名的属性class来获取
        3、对象.getClass():getClass()方法在Object类中定义
    * */
    public static void main(String[] args) throws ClassNotFoundException {
        // 1、.forName("全类名"):将字节码文件加载进内存，返回Class对象
        Class cls1 = Class.forName("cn.itcast.day18.ReflectDomain.Person");
        System.out.println(cls1);  // class cn.itcast.day18.ReflectDomain.Person

        // 2、类名.class:通过类名的属性class来获取
        Class cls2 = Person.class;
        System.out.println(cls2);  // class cn.itcast.day18.ReflectDomain.Person

        // 3、对象.getClass():getClass()方法在Object类中定义
        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);  // class cn.itcast.day18.ReflectDomain.Person

        // 上述三个是字符串表现形式一样，同一个字节码文件(.class)在程序的一次运行过程中，只会被加载一次，无论通过哪一种方式获取的class
        // 都是同一个class对象
    }
}
