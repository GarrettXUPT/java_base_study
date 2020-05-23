package cn.itcast.day17;

import java.util.function.Predicate;

public class PredicateClass {

    public static void main(String[] args) {
        // 对字符串长度进行判断，然后将结果返回
        boolean b = checkString("Garrett", str -> str.length() > 5);
        System.out.println(b);  // true

        boolean bool1 = andMethod("Walker", str -> str.length() > 5, str -> str.contains("a"));
        System.out.println(bool1);  // true

        boolean bool2 = orMethod("Walker", str -> str.length() < 5, str -> str.contains("al"));
        System.out.println(bool2);  // true

        boolean bool3 = negateMethod("abc", str -> str.length() > 5);
        System.out.println(bool3); // true 需要注意的是，这里测试的是取反
    }

    // 定义一个方法，参数传递一个String类型的字符串，传递一个Predicate，泛型使用String
    // 使用Predicate方法中的test方法对字符串进行判断，并将判断的结构返回
    public static boolean checkString(String name, Predicate<String> predicate){
        return predicate.test(name);
    }

    // 使用默认方法and 1、字符串中是否包含a 2、字符串长度是否大于五
    public static boolean andMethod(String str, Predicate<String> predicate1, Predicate<String> predicate2){
        return predicate1.and(predicate2).test(str);
    }

    // 使用默认方法or 1、字符串是否小于5 2、字符串中是否包含al
    public static boolean orMethod(String str, Predicate<String> pre1, Predicate<String> pre2){
        return pre1.or(pre2).test(str);
    }

    // 使用默认方法negate 给判断条件取反
    public static boolean negateMethod(String str, Predicate<String> pre){
        return pre.negate().test(str);
    }
}
