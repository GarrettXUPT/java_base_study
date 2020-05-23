package cn.itcast.day05;

public class Son_Class extends Father_class{
    public Son_Class(){
        // 调用父类有参构造函数
        // super(10);

        // 调用父类无参构造函数
        super();
        System.out.println("这是子类构造方法");
    }
}
