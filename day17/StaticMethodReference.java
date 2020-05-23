package cn.itcast.day17;

public class StaticMethodReference {
    // 定义一个方法，方法的参数传递要经过计算绝对值的整数和函数式接口CalAble
    public static int method(int number, CalAble c){
         return c.absolute(number);
    }

    public static void main(String[] args) {
        // 调用method方法，计算整数的绝对值和lambda表达式
        int res1 = method(-10, num -> Math.abs(num));
        System.out.println(res1);  // 10

        // 使用方法引用对lambda进行优化
        int res2 = method(-90,Math::abs);
        System.out.println(res2);  // 90
    }
}
