package cn.itcast.day17;

public class PeintAble_Class {

    public static void printstring(PrintAble printAble){
        printAble.print("Hello world");
    }

    public static void main(String[] args) {
        // 调用printString方法，方法参数是一个函数式接口，可以传递lambda表达式
        printstring(s -> System.out.println(s));  // Hello world
        /*
        * 分析：
        *   lambda表达式的目的就是打印参数传递的字符串
        *   将字符串传递给System.out对象，调用out中的方法peintln对字符串进行输出
        *   注意：
        *       1、System.out已经是存在的了
        *       2、println方法也是已经存在的
        *   所以我们可以使用方法引用来优化lambda表达式，可以使用System.out方法直接引用(调用)println方法
        * */
        printstring(System.out::println);  // 双冒号表示引用对象的方法
        /*
        * 第一种语义：拿到参数之后经过lambda之后，继而传递给System.out.println来处理
        * 第二种语义：直接让System.out中println方法取代lambda
        * 注意：lambda中传递的参数一定是方法引用中的那个方法可以接受的类型，否则会抛出异常
        * */

    }
}
