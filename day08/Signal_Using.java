package cn.itcast.day08;

import java.util.ArrayList;
import java.util.Iterator;

public class Signal_Using {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);
        list01.add(3);
        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("b");
        list02.add("c");
        printArray(list01);
        printArray(list02);
    }

    // 定义一个方法，能够遍历所有类型的ArrayList集合，使用泛型通配符
    private static void printArray(ArrayList<?> list){
        Iterator<?> it = list.iterator();
        while (it.hasNext()){
            // 取出的类型时Object类型
            Object e = it.next();
            System.out.println(e);
        }
    }

}
