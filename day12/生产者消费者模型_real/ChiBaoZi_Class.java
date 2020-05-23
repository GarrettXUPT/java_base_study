package cn.itcast.day12.生产者消费者模型;

/*
* 消费者：也是一个线程类，可以继承Thread类
        设置线程任务：吃包子
            对报纸的状态进行判断，false没有包子，调用wait方法等待 true有包子，吃包子，吃完包子以后修改
            唤醒包子铺线程，让其做包子
* */

public class ChiBaoZi_Class extends Thread{

    // 创建包子变量
    private BaoZi_Class bz;
    // 为包子变量赋值
    public ChiBaoZi_Class(BaoZi_Class bz) {
        this.bz = bz;
    }

    // 设置线程任务，开始吃包子
    @Override
    public void run() {
        // 使用死循环，使吃货一直吃包子
        while (true){
            synchronized (bz){
                if (bz.flag == false){
                    // 吃包子进程进入等待状态
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 吃包子进程被唤醒之后执行的代码，吃包子
                System.out.println("正在吃" + bz.pi + bz.xian + "的包子");
                // 包子被吃完，修改包子状态为false
                bz.flag = false;
                // 唤醒包子铺
                bz.notify();
                System.out.println("已经把" + bz.pi + bz.xian + "的包子吃完了");
                System.out.println("包子铺开始生产包子");
                System.out.println("---------------------------");
            }
        }
    }
}
