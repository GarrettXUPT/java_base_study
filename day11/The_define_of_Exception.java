package cn.itcast.day11;

// 自己创建异常类
public class The_define_of_Exception extends Exception {
    // 添加一个空参数的构造方法
    public The_define_of_Exception(){
        super();
    }
    // 添加一个带异常信息的构造方法
    // 查看源码发现,所有的异常类都有一个带异常信息的构造方法，方法内部会调用父类异常信息的构造方法，让父类来处理这个异常信息
    public The_define_of_Exception(String message){
        super(message);
    }



}
