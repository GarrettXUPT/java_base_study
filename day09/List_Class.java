package cn.itcast.day09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_Class {
    public static void main(String[] args) {
        // 创建List集合对象，可使用多态
        List<String> list = new ArrayList<>();

        // 使用add方法，向集合中添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        // 打印集合
        System.out.println(list);  // [a, b, c, d, a]

        // public void add(int index, E element)
        // 在c和d之间添加元素Walker
        list.add(3, "Walker");  // 向索引为3的位置添加元素，原有元素向后移动
        System.out.println(list);  // [a, b, c, Walker, d, a]

        // public E remove(int index) 移除指定位置的元素，并返回被移除的元素
        String element = list.remove(3);
        System.out.println(element);  // Walker
        System.out.println(list);  // [a, b, c, d, a]

        // public E set(int index, E element) 用指定的元素替换集合中指定位置的元素，返回被替换的元素
        String element1 = list.set(2, "Garrett");
        System.out.println(element1);  // c
        System.out.println(list);  // [a, b, Garrett, d, a]

        // public E get(int index)  返回指定位置的元素，获取指定位置的元素
        String element2 = list.get(2);
        System.out.println(element2);

        // List的遍历
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("--------------------");
        // 使用迭代器
        Iterator<String> it = list.iterator();  // 也可以使用集合子类进行迭代器的创建
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("--------------------");
        // 使用增强for循环
        for (String s : list){
            System.out.println(s);
        }


    }
}
