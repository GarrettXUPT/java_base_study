package cn.itcast.day10;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Garrett", "Walker");
        hashMap.put("Hello", "World");
        hashMap.put("hou","saiLei");
        hashMap.put(null, null);
        System.out.println(hashMap);
        // {null=null, Hello=World, Garrett=Walker, hou=saiLei} 允许使用空

        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("Garrett", "Walker");
        hashtable.put("Hello", "World");
        hashtable.put("hou","saiLei");
        hashtable.put(null, null);
        System.out.println(hashtable);  // 会报错，因为不允许键值对为空
    }
}
