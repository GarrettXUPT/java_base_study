package cn.itcast.day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Iterator_Use {
    public static void main1(String[] args) {
        // 创建集合，使用集合的方法，创建迭代器对象
        Collection<String> collection = new ArrayList<>();
        // 向集合中添加元素
        collection.add("张三");
        collection.add("李四");
        collection.add("王五");
        collection.add("候六");
        collection.add("田七");

        // 获取Iterator的实现类，是有泛型的，集合是什么类型，迭代器就是什么类型
        Iterator<String> it = collection.iterator();
        // 使用hasNext()判断是否有元素
        boolean bool = it.hasNext();
        System.out.println(bool);  // true

        // 获取集合中的元素,若在没有元素的情况下，还要取出元素，则会产生没有元素异常
        String s = it.next();

        // System.out.println(s);

        // 迭代器遍历集合
        // 若要使用迭代器遍历集合中元素，则使用while循环，循环结束的条件就是hasNext()方法返回值为false
        while (it.hasNext()){
            String e = it.next();
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        // demo01();
        demo02();
    }

    // 增强for循环
    private static void demo01(){
        int[] arr = {1, 2, 3, 4, 5};
        for(int i: arr){
            System.out.println(i);
        }
    }

    // 增强for循环的使用
    private static void demo02(){
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        for(String s : list){
            System.out.println(s);
        }
    }
}
