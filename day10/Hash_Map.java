package cn.itcast.day10;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Hash_Map {
    public static void main(String[] args) {
        show02();
    }

    private static void show01(){
        Map<String, Person> hashMap = new HashMap();
        // 向集合中添加元素
        hashMap.put("北京", new Person("张三",18));
        hashMap.put("上海", new Person("李四",20));
        hashMap.put("广州", new Person("王五",22));

        // 有keySet加上增强for循环来遍历Map
        Set<String> set = hashMap.keySet();
        for(String key : set){
            Person person = hashMap.get(key);
            System.out.println(key + "=" + person);
        }
    }

    private static void show02(){
        HashMap<Person, String> hashMap = new HashMap<>();
        // 向集合中添加元素
        hashMap.put(new Person("张三",18), "北京");
        hashMap.put(new Person("李四",20), "上海");
        hashMap.put(new Person("王五",22), "广州");
        hashMap.put(new Person("张三", 18), "深圳");
        // 使用EntrySet和增强for循环
        Set<HashMap.Entry<Person, String>> set = hashMap.entrySet();

        for(Map.Entry<Person, String> k : set){
            System.out.println(k.getKey() + "=" + k.getValue());
        }

        Set<Person> set1 = hashMap.keySet();
        for(Person per : set1){
            System.out.println("key = " + per + " value = " + hashMap.get(per));
        }
    }

    private static void show03(){
        LinkedHashMap<Person, String> map = new LinkedHashMap<>();
        // 向集合中添加元素
        map.put(new Person("张三",18), "北京");
        map.put(new Person("李四",20), "上海");
        map.put(new Person("王五",22), "广州");

        Set<Person> set = map.keySet();
        for(Person key : set){
            System.out.println(key + "=" + map.get(key));
        }
    }
}
