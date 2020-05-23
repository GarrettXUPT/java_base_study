package cn.itcast.day12;

//线程名称：
//  主线程：main
//  新线程：Thread-0 Thread-1 Thread-2


public class The_Use_of_MyThread {
    public static void main(String[] args) {
//        for(int i = 0; i < 1000; i++){
//            System.out.println(i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
////                e.printStackTrace();
//                e.getMessage();
//            }
//        }
        show01();
    }

    public static void show01(){
        // 3、创建Tread类的子类对象
        My_Thread mt = new My_Thread();
        // 4、调用Tread类子类中的方法start()开启新的线程，执行run方法
        mt.start();

        new My_Thread().start();
        new My_Thread().start();  // 使用匿名内部类直接调用
        //  for(int i = 0; i < 20; i++){
        //       System.out.println("main" + "+" + i);
        //    }

        My_Thread mit = new My_Thread();
        mit.setName("你猜猜");  // 将线程名称设置为你猜猜
        mit.start();
    }
}
