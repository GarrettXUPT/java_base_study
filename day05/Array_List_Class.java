package cn.itcast.day05;
import java.util.ArrayList;

public class Array_List_Class {
    public static void main(String[] args) {
        // 创建一个类型为String的ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Walker");
        list.add("Garrett");
        // 直接打印出来的是元素值而不是地址，若是数组，那么打印出来的就是地址，这里重写了toString方法
        System.out.println(list);  // [Walker, Garrett]
        // get中输入的是索引值
        String ele1 = list.get(1);
        System.out.println(ele1);  // Garrett
        String ele2 = list.remove(0);
        System.out.println(ele2);  // Walker
        System.out.println(list.size()); // 1

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(5);
        list1.add(8);
        System.out.println(list1);
        System.out.println(list1.size());
    }
}
