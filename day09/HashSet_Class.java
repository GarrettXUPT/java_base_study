package cn.itcast.day09;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_Class {
    public static void main(String[] args) {
        demo02();
    }

    // HashSet的基本方法
    private static void demo01(){
        Set<String> set = new HashSet<>();  // 使用多态
        // 使用add方法向集合中添加元素
        set.add("a");
        set.add("b");
        set.add("c");

        // set中不存在索引方法，所以不可使用传统for循环解决
        // 使用迭代器遍历
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());  // a b c
        }
        System.out.println("------------------");
        // 使用增强for循环遍历
        for(String s : set){
            System.out.println(s);  // a b c
        }
    }

    // Set中元素不重复的原理
    private static void demo02(){
        Set<String> set = new HashSet<>();
        String str1 = new String("abc");
        String str2 = new String("abc");

        // 使用add方法向集合中添加元素
        set.add("a");
        set.add("b");
        set.add("c");
        set.add(str1);
        set.add(str2);
        set.add("重地");
        set.add("通话");
        System.out.println(set);  // [a, b, 重地, 通话, c, abc] 因为set是无序的，所以输出顺序和输入顺序可能会不一致
    }
}
