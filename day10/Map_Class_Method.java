package cn.itcast.day10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_Class_Method {
    public static void main(String[] args) {
        // show01();
        // show02();
        // show03();
        // show04();
        // show05();
        show06();
    }

    public static void show01(){
        // 把指定的键和指定的值添加到Map集合中
        // public V put(K key, V value) 将特定的键值对添加到Map中
        // 存储键值对时，key不重复，返回值v是null，若重复，则会使用新的value替换Map中key对应的旧value
        // 若key重复，则返回的是替换前的value

        //使用多态创建Map对象
        Map<String, String> map = new HashMap<>();
        String v1 = map.put("Garrett","Walker");
        System.out.println("v1:" + v1);  // v1:null
        System.out.println(map);  // {Garrett=Walker}

        String v2 = map.put("Garrett","shiyu");
        System.out.println("v2:" + v2); // v2:Walker
        System.out.println(map);  // {Garrett=shiyu}
    }

    public static void show02(){
        // 将指定的键值对进行删除，返回对应的value的值
        // public V remove(Object key)
        // 若key存在，则返回对应的value，若不存在，则返回null,
        // 多使用包装类，少使用基本类型
        //使用多态创建Map对象
        Map<String, String> map = new HashMap<>();
        String v1 = map.put("Garrett","Walker");
        String v2 = map.put("Stiven","song");

        String str1 = map.remove("Garrett");
        System.out.println(str1);  // Walker

        String str2 = map.remove("杨过");
        System.out.println(str2);  // null
    }

    public static void show03(){
        // 根据key值返回对应的value
        // public V get(K key)
        // 若key存在则返回对应的value 若不存在，则返回的是null
        Map<String, String> map = new HashMap<>();
        String v1 = map.put("Garrett","Walker");  // 向map中添加键值对
        String v2 = map.put("Stiven","song");
        String str1 = map.get("Garrett");  // 根据key值获得value
        String str2 = map.get("aaa");
        System.out.println(str1);  // Walker
        System.out.println(str2);  // null
    }

    public static void show04(){
        // 判断Map中是否存在key
        // public boolean containKey(Object key)
        Map<String, String> map = new HashMap<>();
        map.put("Garrett","Walker");
        map.put("Hello", "World");
        boolean bool1 = map.containsKey("Hello");
        boolean bool2 = map.containsKey("World");
        System.out.println(bool1);  // true
        System.out.println(bool2);  // false
    }

    public static void show05(){
        // Map集合的第一种遍历方式，通过键找值的方法
        // 1、使用keySet方法，将Map集合中，所有的键取出
        // 2、遍历set集合，获取Map集合中每一个key值
        // 3、通过getKey来遍历Map集合中的value
        Map<String, String> map = new HashMap<>();
        String v1 = map.put("Garrett","Walker");
        String v2 = map.put("Stiven","song");

        Set<String> set = map.keySet();
        for(String s : set){
            String value = map.get(s);
            System.out.println(s + "=" + value);
        }
    }

    public static void show06(){
        // 使用键值对方法遍历Map，使用Entry对象
        // 实现步骤：1、使用Map中的方法EntrySet，将Map中多个Entry对象取出，存储到集合中
        //         2、遍历Set集合，获取每一个Entry对象
        //         3、使用Entry对象的方法getKey()和getValue()进行对键值对的获取
        Map<String, String> map = new HashMap<>();
        String v1 = map.put("Garrett","Walker");
        String v2 = map.put("Stiven","song");

        Set<Map.Entry<String, String>> set = map.entrySet();
        Iterator<Map.Entry<String, String>> it = set.iterator();
        while (it.hasNext()){
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        for(Map.Entry<String, String> s : set){
            System.out.println(s.getKey() + "=" + s.getValue());
        }

    }
}
