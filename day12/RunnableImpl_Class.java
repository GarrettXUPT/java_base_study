package cn.itcast.day12;

 // 2、创建一个类，实现类Runnable，重写run方法，设置线程任务
public class RunnableImpl_Class implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "创建了新的线程执行");
    }
}
