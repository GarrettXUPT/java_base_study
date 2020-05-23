package cn.itcast.day01;

public class Variable {
    public static void main(String[] args) {
        // 创建一个变量
        int num1 = 3;
        System.out.println(num1);
        byte num2 = 30;  // 右侧数据不能超过该类型数据范围
        int num3 = (int)100L;
        System.out.println(num3);
        String a = "Hello world ";
        String b = "Garrett";
        String c = a + b;
        System.out.println(c);
        int num4 = num1 > num2 ? num1 : num2;
        System.out.println("最大值为" + num4);

        int num5 = 6;

        if(num5 != 2)
        {
            System.out.println("这就是单语句");
        }

    }
}
