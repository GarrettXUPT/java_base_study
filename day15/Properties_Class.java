package cn.itcast.day15;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class Properties_Class {
    public static void main(String[] args) throws IOException {
        show02();
    }

    /*
    * 使用Properties集合存储数据，遍历Properties集合取出数据
    * Properties集合中存在一些操作字符串的特有方法,可做索引取数据
    * */
    public static void show01(){
        // 创建一个Properties对象
        Properties properties = new Properties();
        // Object setProperty(String key, String value) 存储键值对字符串，底层调用的就是Hashtable的方法put
        // 向集合中添加数据
        properties.setProperty("Garrett", "Walker");
        properties.setProperty("Hello", "World");
        properties.setProperty("zhaosi", "nigulasi");
        // 使用stringPropertyNames方法，将集合中的键记进行取出
        Set<String> key = properties.stringPropertyNames();
        // 遍历key取出集合中的值
        for(String k : key){
            String value = properties.getProperty(k);
            System.out.println("key = " + k + " value = " + value);
        }
    }

    /*
    * 可以使用Properties集合中的方法store，可以将集合中的数据持久化写入到硬盘中存储
    * */
    public static void show02() throws IOException {
        // 创建一个Properties对象
        Properties properties = new Properties();
        // Object setProperty(String key, String value) 存储键值对字符串，底层调用的就是Hashtable的方法put
        // 向集合中添加数据
        properties.setProperty("Garrett", "Walker");
        properties.setProperty("Hello", "World");
        properties.setProperty("zhaosi", "nigulasi");
        // 2、创建字节/字符输出流对象，在构造方法中绑定要输出的目的地,字符流可以写中文，但是字节流不可以写中文
//        FileWriter fw = new FileWriter(new File("src/cn/itcast/day15/package/a.txt"));
        FileOutputStream fos = new FileOutputStream(new File("src/cn/itcast/day15/package/b.txt"));
        // 3、使用集合中的方法store，将集合中数据持久化写入硬盘中存储
        properties.store(fos, "save_data");
        // 4、释放资源
        fos.close();
        System.out.println("写入完毕");
    }
    /*
    * 可以使用Properties集合中的方法load，将硬盘中保存的文件(键值对)，读取到集合中使用
    * */
    public static void show03() throws IOException {
        // 1、创建一个Properties集合
        Properties properties = new Properties();
        // 2、使用集合对象中的方法load读取保存键值对的文件
        properties.load(new FileReader("src/cn/itcast/day15/package/b.txt"));
        // 3、遍历Properties，查看是否已经将数据读出
        Set<String> k = properties.stringPropertyNames();
        for(String key : k){
            String value = properties.getProperty(key);
            System.out.println("key = " + key + " value = " + value);
        }


    }


}
