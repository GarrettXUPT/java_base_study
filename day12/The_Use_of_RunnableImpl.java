package cn.itcast.day12;

public class The_Use_of_RunnableImpl {
    public static void main(String[] args) {
        // 3、创建一个Runnable接口的实现类对象
        RunnableImpl runnable = new RunnableImpl();
        // 4、创建Thread对象，在它的构造方法中传递Runnable实现类对象
        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable, "1");
        // 5、调用Thread类中的start方法，开启新的线程执行run方法，即在Runnable类中实现类的run方法
        thread.start();
        thread1.start();

        for(int i = 0; i < 20; i++){
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
