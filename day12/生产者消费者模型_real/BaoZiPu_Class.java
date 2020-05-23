package cn.itcast.day12.生产者消费者模型;

/*
* 生产者：包子铺，这是一个线程类，可以继承Thread
        设置线程任务：生产包子
            对包子的状态进行判断：true有包子，包子铺调用wait方法进入等待状态 false没有包子，生产包子
            交替生产两种包子(i % 2)
            包子铺生产好包子，修改报纸的状态为true，唤醒吃包子(消费者)线程吃包子
    注意事项：吃包子线程和包子铺线程属于互斥关系，必须使用同步技术，使两个线程只能有一个在执行，锁对象必须唯一
    *        可以使用包子对象作为锁对象，包子对象需要作为参数传递给包子铺对象和吃包子对象
    *          1、需要在成员类，创建包子变量
    *          2、使用带参数构造方法，为这个包子变量赋值
* */
public class BaoZiPu_Class extends Thread{
    // 创建包子变量
    private BaoZi_Class bz;
    // 为包子变量赋值
    public BaoZiPu_Class(BaoZi_Class bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        // 定义变量
        int count = 0;
        while (true){
            synchronized (bz){
                // 对包子的状态进行判断
                if (bz.flag == true){
                    // 包子铺调用wait方法，进入等待状态
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 被唤醒之后执行，包子铺生产包子，交替生产两种包子
                if(count % 2 == 0){
                    // 生产薄皮，三鲜包子
                    bz.pi = "薄皮";
                    bz.xian = "三鲜";
                }else{
                    bz.pi = "冰皮";
                    bz.xian = "牛肉大葱";
                }
                count++;
                System.out.println("包子铺正在生产" + bz.pi + bz.xian + "包子");

                // 生产包子需要三秒钟
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // 生产好包子以后，修改包子的状态为有
                bz.flag = true;
                // 唤醒吃包子线程
                System.out.println("包子铺已经生产好了" + bz.pi + bz.xian + "包子");
                System.out.println("可以开始吃包子了");
                bz.notify();
            }
        }
    }
}
