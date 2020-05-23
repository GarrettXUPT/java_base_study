package cn.itcast.day13;

public class RunnbaleImpl_test {
    public static void main(String[] args) {
        // 创建Runnable接口的实现类对象
        RunnableImpl run = new RunnableImpl();
        // 创建Thread对象，构造方法中传递Runnable的实现类
        Thread t = new Thread(run);
        // 调用start方法，开启新线程，执行run方法
        t.start();  // Thread-0新的线程被创建

        // 简化以后的代码，使用匿名内部类实现多线程程序
        Runnable r = new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "线程被创建");
            }
        };
        new Thread(r).start();  // Thread-1线程被创建


        // 使用lambda表达式来实现多线程
        new Thread(()->{
            System.out.println(Thread.currentThread().getName() + "线程被创建");
        }
        ).start();  // Thread-1线程被创建

        // 优化省略版
        new Thread(()-> System.out.println(Thread.currentThread().getName() + "线程被创建")).start();  // Thread-1线程被创建
    }
}
