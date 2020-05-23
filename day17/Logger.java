package cn.itcast.day17;


/*
*   日志案例
*   发现以下代码存在一些性能问题
*   调用showLogger方法，第二个参数传递的是拼接后的字符串，先把字符串拼接好，再调用showLogger方法
*   若showLogger传递的等级不是一级，那么就不会输出拼接后的字符串，字符串操作就变得没有意义，所以存在浪费
* */
public class Logger {

    public static void main(String[] args) {
        String msg1 = "Hello";
        String msg2 = "Walker";
        String msg3 = "Garrett";
        // showLogger1(1, msg1 + msg2 +msg3);
        showLogger2(1, ()->msg1 + msg2 + msg3);

    }

    // 根据日志的级别，显示日志信息的方法
    public static void showLogger1(int level, String message){
        // 对日志信息进行判断，若级别为1，则输出对应的信息
        if(level == 1){
            System.out.println(message);
        }

    }

    /*
    * 使用lambda进行优化，使用lambda特点，延迟加载，lambda的适用前提，必须存在函数式接口
    * 定义一个显示日志的方法，方法传递的是日志的等级和MessageBuilder接口
    * 使用lambda的优点：
    * 1、使用lambda表达式作为参数传递，仅仅是将参数传递到showLogger方法中，只有满足等级为一级，才会调用接口中的字符串拼接方法
    * 2、若不满足等级为一级，那么接口中的方法也不会执行，所以不会存在性能的浪费
    * */
    public static void showLogger2(int level, MessageBuilder mb){
        // 对日志的等级进行判断，若是1级，则调用MessageBuilder接口中的字符串拼接方法
        if(level == 1){
            System.out.println(mb.builderMessage());
        }
    }

}
