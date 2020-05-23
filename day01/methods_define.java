package cn.itcast.day01;

public class methods_define {
    public static void main(String[] args) {
        farmer();
        seller();
        cooker();
        me();
    }
    public static void farmer(){
        System.out.println("播种");
        System.out.println("施肥");
        System.out.println("除草");
        System.out.println("收割");
        System.out.println("卖给小商贩");
    }

    public static void seller(){
        System.out.println("买菜");
        System.out.println("拉货");
        System.out.println("抬价");
        System.out.println("吆喝");
        System.out.println("卖菜");
    }

    public static void cooker(){
        System.out.println("买菜");
        System.out.println("洗菜");
        System.out.println("做菜");
        System.out.println("上桌");
    }
    public static void me(){
        System.out.println("吃");
    }
}
