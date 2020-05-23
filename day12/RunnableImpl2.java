package cn.itcast.day12;

import java.util.Objects;

/*
* 实现买票案例
* */
public class RunnableImpl2 implements Runnable{
    // 定义一个多线程共享的票源
    private static int ticket = 100;
    // 是用静态同步方法时，因为方法是静态的，所以变量也就是静态的

    // 创建一个锁对象
    Object obj = new Object();

    // 线程的任务就是买票
    @Override
    public void run() {
        while (true){
            // 创建同步代码块，创建的线程抢夺锁对象obj
            synchronized (obj){
                if(ticket > 0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    // 票存在，才可以卖票
                    System.out.println(Thread.currentThread().getName() + ":正在卖第" + ticket + "张票");
                    ticket--;
                }
                else if(ticket == 0){
                    System.out.println("票卖完了");
                    break;
                }
            }
        }
    }




    /*******************************************************/

//    // 使用同步方法解决线程安全问题
//    @Override
//    public void run() {
//        while (true){
//            payTicket_Static();
//        }
//    }
    // 定义一个同步方法
    public synchronized void payTicket(){
        if(ticket > 0){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 票存在，才可以卖票
            System.out.println(Thread.currentThread().getName() + ":正在卖第" + ticket + "张票");
            ticket--;
        }
    }

    /*******************************************************/
    // 是用静态同步方法解决线程安全问题
    // 定义一个静态同步方法
    public static synchronized void payTicket_Static(){
        if(ticket > 0){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 票存在，才可以卖票
            System.out.println(Thread.currentThread().getName() + ":正在卖第" + ticket + "张票");
            ticket--;
        }
    }

}
