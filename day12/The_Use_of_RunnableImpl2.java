package cn.itcast.day12;

public class The_Use_of_RunnableImpl2 {
    public static void main(String[] args) {
        // 创建Runnable的实现类对象
        RunnableImpl2 run = new RunnableImpl2();
        // 创建Thread类对象，构造方法中传递Runnable接口的实现类对象
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        // 调用start方法开启多线程
        t0.start();
        t1.start();
        t2.start();
    }
}
