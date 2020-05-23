package cn.itcast.day12;

public class InnerClassThread {
    public static void main(String[] args) {
        show02();
    }

    public static void show01(){
        // 线程的父类是Thread
        new Thread(){
            // 重写run方法

            @Override
            public void run() {
                for(int i = 0; i < 20; i++){
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        }.start();
    }

    public static void show02(){
        // 线程的接口Runnable
        // Runnable r = new RunnableImple() 使用的是多态
        Runnable r = new Runnable(){
            // 重写run方法，设置线程任务
            @Override
            public void run() {
                for(int i = 0; i < 20; i++){
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        };
        new Thread(r).start();
    }
}
