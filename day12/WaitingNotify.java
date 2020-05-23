package cn.itcast.day12;

public class WaitingNotify {
    /*
    *等待唤醒案例(进程之间的通信)
    *   创建一个顾客线程(消费者)，告诉老板要的包子种类和数量，调用wait方法，放弃CPU的执行，进入到waiting状态(无限等待状态)
    *   创建一个老板状态，花5s做一个包子，调用Notify方法唤醒顾客吃包子
    * 注意事项：
    *   顾客线程和老板线程要使用同步代码块包裹起来，保证等待和唤醒只能有一个执行
    *   同步使用的锁对象是唯一的
    *   只有锁对象才能调用wait和Notify方法
    * Object类中的方法：
    * void wait()
    *   在其他线程中调用此对象的notify方法或者是notifyAll方法，导致当前线程等待
    * void notify()
    *   唤醒在此对象监视器上的单个线程，继续执行wait之后的代码
    * /
     */
    public static void main(String[] args) {
        // 创建锁对象，保证唯一
        Object obj = new Object();
        // 创建一个顾客线程(消费者)
        new Thread(){
            @Override
            public void run() {
                while (true){
                    // 保证等待和唤醒线程只有一个在执行，使用同步技术
                    synchronized (obj){
                        System.out.println("告知老板的包子的种类和数量");
                        // 调用wait方法，放弃CPU的执行，进入到waiting状态进行无线等待
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        // 唤醒之后，执行的代码
                        System.out.println("包子做好了，准备吃");
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
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj){
                        System.out.println("包子已做好，告知顾客");
                        // 做好包子以后，使用notify方法，唤醒顾客吃包子
                        obj.notify();
                    }
                }
            }
        }.start();


    }

}
