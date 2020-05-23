package cn.itcast.day12;

// 1、创建一个Tread类的子类,继承Thread
public class My_Thread extends Thread{

    // 2、在Tread类的子类中重写Tread类中的run方法，设置线程任务(指明开启线程需要做的任务)
    @Override
    public void run() {
    //   for(int i = 0; i < 20; i++){
    //       System.out.println("run" + "+" + i);
    //   }
         // 获取线程的名称
        //   String name = getName();
        //   System.out.println(name);

        Thread t = Thread.currentThread();
        System.out.println(t.getName());

        // 打印当前线程名称
        // System.out.println(Thread.currentThread().getName());

    }


}
