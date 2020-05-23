package cn.itcast.day12;

public class WitingNotify2 {
    /*
    * 进入到TimeNotify有两种方式：
    *   1、使用sleep(long m)
    *   2、使用wait(long m)方法，wait方法如果在毫秒值结束以后，还没有进行notify唤醒，就会自动醒来，线程醒来以后，进入到
    *      可运行，或者是阻塞状态
    * 唤醒的方法：
    *
    * */
    public static void main(String[] args) {
        // 创建锁对象，保证唯一，两个消费者进程抢夺一个同步锁
        Object obj = new Object();
        // 创建一个顾客线程(消费者)
        new Thread(){
            @Override
            public void run() {
                while (true){
                    // 保证等待和唤醒线程只有一个在执行，使用同步技术
                    synchronized (obj){
                        System.out.println("顾客一,告知老板的包子的种类和数量");
                        // 调用wait方法，放弃CPU的执行，进入到waiting状态进行无线等待
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        // 唤醒之后，执行的代码
                        System.out.println("顾客一，包子做好了，准备吃");
                        System.out.println("----------------------");
                    }
                }

            }
        }.start();

        // 创建一个顾客线程(消费者)
        new Thread(){
            @Override
            public void run() {
                while (true){
                    // 保证等待和唤醒线程只有一个在执行，使用同步技术
                    synchronized (obj){
                        System.out.println("顾客二,告知老板的包子的种类和数量");
                        // 调用wait方法，放弃CPU的执行，进入到waiting状态进行无线等待
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        // 唤醒之后，执行的代码
                        System.out.println("顾客二，包子做好了，准备吃");
                        System.out.println("----------------------");
                    }
                }

            }
        }.start();

        // 创建一个老板线程(生产者)
        new Thread(){
            @Override
            public void run() {
                while (true){
                    // 保证等待和唤醒线程只有一个在执行，使用同步技术
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj){
                        System.out.println("包子已做好，告知顾客");
                        // 做好包子以后，使用notify方法，唤醒顾客吃包子
                        obj.notifyAll(); // 将顾客一、二都唤醒
                    }
                }
            }
        }.start();

    }
}
