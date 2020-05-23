package cn.itcast.day12.生产者消费者模型;

public class Test {
    public static void main(String[] args) {
        // 创建包子对象
        BaoZi_Class baozi = new BaoZi_Class();
        // 开始生产包子
        new BaoZiPu_Class(baozi).start();
        // 吃包子线程
        new ChiBaoZi_Class(baozi).start();
    }
}
