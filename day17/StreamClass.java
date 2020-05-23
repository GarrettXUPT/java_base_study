package cn.itcast.day17;

import java.util.*;
import java.util.stream.Stream;

public class StreamClass {

    /*
    * 获取流的方式演示
    * */
    public static void main(String[] args) {
        show09();
    }

    /*
     * 使用stream流的方式，遍历集合，对集合中的元素进行过滤
     * */
    public static void show01(){
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("张大炮");
        list.add("周芷若");
        list.add("sneak");
        list.add("Walker");

        // 过滤出名字以张开头的,长度为3并对这个集合进行遍历
        list.stream().filter(name->name.startsWith("张")).filter(name -> name.length() == 3).
                forEach(name -> System.out.println(name));
    }

    /*
     * 获取流的方式演示
     * */
    public static void show02(){
        List<String> list = new ArrayList<>();
        // 将集合转化为Stream流对象
        Stream<String> stream = list.stream();
        Set<String> set = new HashSet<>();
        Stream<String> stringStream = set.stream();

        Map<String, String> map = new HashMap<>();
        // 获取map集合中的键，存储到集合中
        Set<String> keySet = map.keySet();

        // 将Set集合转化为Stream流
        Stream<String> stringStream1 = keySet.stream();
        // 获取map集合中的值，存储到Collection集合中
        Collection<String> values = map.values();
        Stream<String> stringStream2 = values.stream();

        // 获取map集合的键值对
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        Stream<Map.Entry<String, String>> entryStream = entrySet.stream();

        // 将数组转化为Stream流
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6);
        // 可变参数可以传递数组
        Integer[] integers = new Integer[]{1, 2, 3, 4, 5, 6};
        Stream<Integer> integerStream1 = Stream.of(integers);

        String[] string = new String[]{"Garrett", "Walker", "Hello", "World"};
        Stream<String> stringStream3 = Stream.of(string);
    }

    /*
    * 逐一处理 forEach void forEach(Consumer<? supper T> action)
    *         接收Consumer接口，会将每一个流元素交给函数处理
     * */
    public static void show03(){
        // 获取Stream流
        Stream<String> stringStream = Stream.of("Garrett", "Walker", "Hello", "World");
        // 使用Stream方法forEach，对Stream中的数据进行遍历
        stringStream.forEach(name -> System.out.println(name));
    }

    /*
    * 过滤：filter Stream<T> filter(Predicate<? super T> predicate) 接收Predicate接口作为筛选条件
     * */
    public static void show04(){
        // 建立一个stream流
        Stream<String> stringStream = Stream.of("Garrett", "Walker", "Hello", "World");
        // 对流中元素进行过滤，只留下姓张的人
        Stream<String> strArr = stringStream.filter(name->name.startsWith("W"));
        strArr.forEach(name-> System.out.println(name));
    }

    /*
    * 映射Map：<R> Stream<R> map(Function<? supper T, ? extends R> mapper) 将流中的一种类型数据转化为另一种类型的数据
    * */
    public static void show05(){
        // 获取一个String类型的Stream流
        Stream<String> stringStream = Stream.of("1", "2", "3", "4");
        // 使用map方法，将字符串类型的数据转化为整型数据
        Stream<Integer> integerStream = stringStream.map(str -> Integer.parseInt(str));
        integerStream.forEach(integer -> System.out.println(integer));
    }

    /*
    *   统计个数的方法：count long count() 返回值为元素的个数
    * */
    public static void show06(){
        Stream<String> stringStream = Stream.of("Garrett", "Walker", "Hello", "World");
        long num = stringStream.count();
        System.out.println("元素个数为：" + num);
    }

    /*
    * 对流进行截取：Stream<T> limit(lon maxsize)  若当前流长度大于截取值时，就自动对流进行截取
     * */
    public static void show07(){
        Stream<String> stringStream = Stream.of("Garrett", "Walker", "Hello", "World");
        Stream<String> strRes = stringStream.limit(3);
        strRes.forEach(ele -> System.out.println("经过截取后的流" + ele));
    }

    /*
    * 跳过前几个元素：Stream<T> skip(long n)  若流的长度大于n，则将跳过前n个元素，否则就会得到一个长度为0的空流
     * */
    public static void show08(){
        Stream<String> stringStream = Stream.of("Garrett", "Walker", "Hello", "World");
        Stream<String> str = stringStream.skip(3);
        // str.forEach(mse -> System.out.println(mse));  // World
        Stream<String> strTmp = str.skip(5);
        strTmp.forEach(string -> System.out.println(string));  // 空流

    }

    /*
    * 组合方法concat：若有两个流，要被组合成一个流
    * static <T> Stream<T> concat(Stream <? extends T> a, Stream<? extends T> b)
     * */
    public static void show09(){
        Stream<String> stringStream1 = Stream.of("Garrett", "Walker", "Hello", "World");
        Stream<String> stringStream2 = Stream.of("school", "I", "miss", "you");
        Stream<String> strArr = Stream.concat(stringStream1, stringStream2);
        strArr.forEach(ele -> System.out.println(ele));

    }
}
