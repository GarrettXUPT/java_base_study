package cn.itcast.day06;

public interface Interface_Class {
    // 抽象方法
    public abstract void methods_Abs1();
    // 抽象方法
    abstract void methods_Abs2();
    // 抽象方法
    public void methods_Abs3();
    // 抽象方法
    void methods_Abs4();

    // 将新添加的方法改为默认方法就可以解决接口升级的问题
    public default void methodDefault(){
        System.out.println("这是一个默认方法");
        methodPrivate();
    }
    // 新添加方法为静态方法
    public static void methodStatic(){
        System.out.println("这是一个静态方法");
        methodPrivateStatic();
    }

    // 这些私有方法只能在该类中被调用，外界是不可以直接使用的，可以解决代码重复使用问题
    private void methodPrivate(){
        System.out.println("这是私有普通方法");
    }

    private static void methodPrivateStatic(){
        System.out.println("这是私有静态方法");
    }

    // 该种成员变量只能在此处修改，其他地方只能使用，不能修改
    public static final String str = "成员变量";
}
