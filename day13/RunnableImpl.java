package cn.itcast.day13;

/*
* 实现Runnable接口的方式，实现多线程程序
* 创建Runnable接口的实现类，重写run方法，设置线程任务
* */

public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "新的线程被创建");
    }
}
