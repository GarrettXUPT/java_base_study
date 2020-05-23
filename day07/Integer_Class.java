package cn.itcast.day07;

public class Integer_Class {
    public static void main(String[] args) {

        // 使用构造方法装箱
        Integer integer1 = new Integer(1);  // 方法上有横线，说明该方法已经过时了
        System.out.println(integer1);  // 重写了toString方法

        Integer integer2 = new Integer("1");
        System.out.println(integer2);

        // 使用静态方法装箱
        Integer integer3 = Integer.valueOf(1);
        System.out.println(integer3);

        Integer integer4 = Integer.valueOf("1");  // 若放入的不是基本数据类型会出现数据格式化异常
        System.out.println(integer4);

        // 使用成员方法进行拆箱，将包装类还原为整数类型
        int i = integer1.intValue();
        System.out.println(i);

        Integer j = 1;  // 自动装箱:将基本数据类型的数据直接赋值给包装类

        int sum = j + 1;  // 自动拆箱:包装类无法直接进行计算，但是它可以转换为基本数据类型进行参与运算

    }
}
