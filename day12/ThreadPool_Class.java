package cn.itcast.day12;

/*
* 线程池
* java.util.concurrent.Executors,线程池的工厂类，用来生产线程池
*   Executors中存在静态方法
*   static ExecutorService newFixedThreadPool(int nThread)
*       参数：创建线程池中包含的线程数量
*       返回值：返回的是Executors接口的实现类，饿哦们可以使用ExecutorService接口接收(面向接口的编程)
* java.util.concurrent.ExecutorService：线程池接口
*   用来获取线程，调用start方法，执行线程任务
*       submit(Runnable r) 提交一个Runnable任务用于执行
*   关闭/销毁线程池的方法：
*       void shutdown()
*   线程池的使用步骤：
*       1、使用线程池的工厂类里面的静态方法neFixedThreadPool生产一个指定的线程池
*       2、创建一个类，实现类Runnable，重写run方法，设置线程任务
*       3、调用ExecutorService方法的submit，传递线程任务(实现类)，并开启线程执行run方法
*       4、可以调用ExecutorService中的shutdown方法销毁线程，不建议执行
* */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool_Class {
    public static void main(String[] args) {
        // 1、使用线程池的工厂类里面的静态方法neFixedThreadPool生产一个指定的线程池
        ExecutorService es = Executors.newFixedThreadPool(2);
        // 3、调用ExecutorService方法的submit，传递线程任务(实现类)，并开启线程执行run方法
        es.submit(new RunnableImpl_Class()); // pool-1-thread-1创建了新的线程执行
        // 线程池会一直开启，使用完了线程，会自动把线程归还给线程池，该线程可以继续使用
        // 当使用强制关闭线程时，该线程便不能再次被使用了
        es.submit(new RunnableImpl_Class());
        es.submit(new RunnableImpl_Class());
        es.shutdown();

    }
}
