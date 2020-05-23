package cn.itcast.day06;

public class Interface_Class_Use {
    public static void main(String[] args) {
        Interface_Class_Implement inter = new Interface_Class_Implement();
        inter.methods_Abs1();
        inter.methods_Abs2();
        inter.methods_Abs3();
        inter.methods_Abs4();
        // 调用默认方法，若实现类没有，则会向上寻找接口的
        inter.methodDefault();
        // 调用静态方法,直接使用接口名称调用即可
        Interface_Class.methodStatic();
        // 该处调用的接口中的成员变量只能进行使用，而不能进行修改
        System.out.println(Interface_Class.str);
    }
}
