package cn.itcast.day10;

import java.util.List;
import java.util.Map;

public class Set_New_feature {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c");
        System.out.println(list);
        // [a, b, c]
        // 使用该种方式以后，集合中的元素不可以再次发生变化，也不允许有重复的元素

        Map<String, Integer> map = Map.of("Garrett", 12,"Walker",18,"shiYu",22);
        System.out.println(map);
        // {Walker=18, Garrett=12, shiYu=22}
    }
}
