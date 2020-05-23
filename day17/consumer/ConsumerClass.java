package cn.itcast.day17.consumer;

import java.util.function.Consumer;

public class ConsumerClass {

    public static void main(String[] args) {
        // 调用method方法，传递字符串姓名，方法的另一参数就是Consumer接口
        method("Garrett", (String name) -> System.out.println(name));
        method("Walker", (String name) -> {
            // 将字符串进行反转
            String str = new StringBuilder(name).reverse().toString();
            System.out.println(str);
        });

        andThenMethod("Walker", (String name) -> System.out.println(name), (String name) -> {
            String rename = new StringBuilder(name).reverse().toString();
            System.out.println(rename);
        });

        String[] strArray = new String[]{"Garrett, 男", "Lina, 女", "Walker, 男"};
        printStrad(strArray, (String name) -> {
            String[] str = name.split(",");
            System.out.println("姓名：" + str[0] + " 性别：" + str[1]);
        }, (String name) ->{
            String[] str = name.split(",");
            System.out.println("姓名：" + str[0] + " 性别：" + str[1]);
        });
    }

    // 定义一个方法，方法的参数传递一个字符串的姓名，方法传递Consumer接口，泛型使用字符串
    public static void method(String name, Consumer<String> consumer){
        consumer.accept(name);
    }

    // Consumer接口的andThen方法
    // 作用：需要两个consumer接口，可以将其组合在一起，再对数据进行处理
    /*
    *   Consumer<String> con1
    *   Consumer<String> con2
    *   String s = "hello"
    *   con1.accept(s)
    *   con2.accept(s)
    *   上述作用与con1.andThen(con2).accept(s) 作用一样，谁写前面，谁先处理
    * */
    public static void andThenMethod(String s, Consumer<String> con1, Consumer<String> con2){
        con1.andThen(con2).accept(s);
    }

    // 使用Consumer进行格式化打印
    public static void printStrad(String[] array, Consumer<String> con1, Consumer<String> con2){
        for(String str : array){
            con1.andThen(con2).accept(str);
        }
    }
}
