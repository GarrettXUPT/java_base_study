package cn.itcast.day09;

import java.util.LinkedList;

public class LinkedList_Class {
    public static void main(String[] args) {
        // demo01();
        // demo02();
        demo03();
    }


    // LinkedList添加方法
    private static void demo01(){
        // 创建LinkedList集合对象
        LinkedList<String> linkedList = new LinkedList<>();
        // 使用add方法向集合中添加元素
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        System.out.println(linkedList);  // [a, b, c]

        // 向集合开头添加元素 addFirst push，push也是向集合开头添加元素
        linkedList.addFirst("www");
        System.out.println(linkedList);  // [www, a, b, c]
        linkedList.push("Walker");
        System.out.println(linkedList);  // [Walker, www, a, b, c]

        // 将元素添加到集合的末尾,等效于add方法
        linkedList.addLast("Garrett");
        System.out.println(linkedList);  // [Walker, www, a, b, c, Garrett]

    }

    // LinkedList获取方法
    private static void demo02(){
        // 创建LinkedList集合对象
        LinkedList<String> linkedList = new LinkedList<>();
        // 使用add方法向集合中添加元素
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");

        // 获取返回第一个元素
        String element1 = linkedList.getFirst();
        System.out.println(element1);  // a

        // 获取并返回最后一个元素
        String element2 = linkedList.getLast();
        System.out.println(element2);  // c

        // 清空结合中的元素
        linkedList.clear();
        System.out.println(linkedList);  // []

        // 判断非空有才会进行以下操作
        if(! linkedList.isEmpty()){
            String first = linkedList.getFirst();
            System.out.println(first);

            String last = linkedList.getLast();
            System.out.println(last);
        }
    }

    // LinkedList移除的方法
    private static void demo03(){
        // 创建LinkedList集合对象
        LinkedList<String> linkedList = new LinkedList<>();
        // 使用add方法向集合中添加元素
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");

        // 移除并返回集合的最后一个元素
        String last = linkedList.removeLast();
        System.out.println(last);  // c

        // 移除并返回结合中的第一个元素
        String first = linkedList.removeFirst();
        System.out.println(first);  // a

        // pop 方法，移除第一个元素，相当于removeFirst
        String last2 = linkedList.pop();
        System.out.println(last2);  // b

    }
}
