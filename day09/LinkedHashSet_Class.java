package cn.itcast.day09;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet_Class {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("abc");
        hashSet.add("abc");
        hashSet.add("Walker");
        hashSet.add("Garrett");
        System.out.println(hashSet); // [abc, Garrett, Walker] 无序且不允许重复

        // 使用多态使用LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("abc");
        linkedHashSet.add("abc");
        linkedHashSet.add("Walker");
        linkedHashSet.add("Garrett");
        System.out.println(linkedHashSet);  // [abc, Walker, Garrett] 有序但不允许重复

    }
}
