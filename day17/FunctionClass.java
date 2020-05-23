package cn.itcast.day17;

import java.util.function.Function;

public class FunctionClass {

    public static void main(String[] args) {
        // 将字符串型数据转化为整型数据
        int integer = translate("1234", str-> Integer.parseInt(str));
        System.out.println(integer);  // 1234


        String string = andThenMethod("5678", str ->{
            int int1 = Integer.parseInt(str);
            System.out.println(int1);
            return int1;
        }, (Integer i) -> {
            return i + "";
        });
        System.out.println(string);

        together();
    }

    // 定义一个方法，将字符串转化为整型
    public static Integer translate(String str, Function<String, Integer> function){
        return function.apply(str);
    }

    // 使用默认方法andThen进行组合，先将字符串转化为整型，再将整形转化为字符串
    public static String andThenMethod(String str, Function<String, Integer> fun1, Function<Integer, String> fun2){
        return fun1.andThen(fun2).apply(str);
    }

    // 练习：自定义模板类型的拼接
    // str = "Garrett20"
    // 1、将字符串截取数字年龄部分，得到字符串 2、将上面字符串转化为int类型，3、然后将int类型数字加一
    public static void together() {
        String strr = "Garrett, 20";
        int integer = translate(strr, str -> Integer.parseInt(strr.split(",")[1].strip()) + 10);
        System.out.println(integer);
    }
}
