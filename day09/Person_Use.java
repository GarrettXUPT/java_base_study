package cn.itcast.day09;

import java.util.HashSet;

public class Person_Use {
    public static void main(String[] args) {
        // 创建一个hashSet集合存储Person
        HashSet<Person> personHashSet = new HashSet<>();

        // 创建Person对象
        Person p1 = new Person("小米", 5);
        Person p2 = new Person("锤子", 6);
        Person p3 = new Person("锤子", 6);


        // 添加到HashSet中,同名同年龄的的人只存一次
        personHashSet.add(p1);
        personHashSet.add(p2);
        personHashSet.add(p3);
        System.out.println(personHashSet);
        // 未重写 hashCode和equals[Person{name='小米', age=5}, Person{name='锤子', age=6}, Person{name='锤子', age=6}]
        // 重写后 [Person{name='锤子', age=6}, Person{name='小米', age=5}]


    }
}
