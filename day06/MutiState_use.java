package cn.itcast.day06;

public class MutiState_use {
    public static void main(String[] args) {
        // 左侧父类引用指向了右侧父类的对象
        Fu obj = new Zi();
        // 成员变量，等号左侧是谁，就优先用谁
        System.out.println(obj.num);
        System.out.println(obj.num);
        // System.out.println(obj.age); 错误写法
        // 成员方法：new出来的是谁，就优先用谁，否则就向上找
        obj.method();  // 优先使用的是父类的方法
        obj.methodFu();
        // 若要调用子类特有方法就要向下转型,判断前面对象能不能当做后面类型的实例
        Zi zi = (Zi) obj;
        zi.methodZi();

    }
}
