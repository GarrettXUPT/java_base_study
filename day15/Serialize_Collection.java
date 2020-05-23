package cn.itcast.day15;

import java.io.*;
import java.util.ArrayList;

public class Serialize_Collection {

    /*
    *   序列化集合：
    *       当我们想要在文件中保存多个对象时候，可以将对象存储到集合中，然后对集合进行序列化和反序列化
    *   分析：
    *       1、定义一个存储Person对象的ArrayList集合
    *       2、向ArrayList集合中存储Person对象
    *       3、创建一个序列化流ObjectOutputStream对象
    *       4、使用ObjectOutputStream中的方法writeObject(),对集合进行序列化
    *       5、创建一个反序列化ObjectInputStream对象
    *       6、使用ObjectInputStream对象中的方法readObject()读取文件中保存的集合
    *       7、将Object类型的集合转化为ArrayList类型
    *       8、遍历ArrayList集合
    *       9、释放资源
    * */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 1、定义一个存储Person对象的ArrayList集合
        Person person1 = new Person("张三", 28);
        Person person2 = new Person("李四", 33);
        Person person3 = new Person("王五", 16);
        // 2、向ArrayList集合中存储Person对象
        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(person1);
        arrayList.add(person2);
        arrayList.add(person3);
        // 3、创建一个序列化流ObjectOutputStream对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/cn/itcast/day15/package/personArr.txt"));
        // 4、使用ObjectOutputStream中的方法writeObject(),对集合进行序列化
        oos.writeObject(arrayList);
        // 5、创建一个反序列化ObjectInputStream对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/cn/itcast/day15/package/personArr.txt"));
        // 6、使用ObjectInputStream对象中的方法readObject()读取文件中保存的集合
        Object obj = ois.readObject();
        // 7、将Object类型的集合转化为ArrayList类型
        ArrayList<Person> personArrayList = (ArrayList<Person>)obj;
        // 8、遍历ArrayList集合
        for(Object person : personArrayList){
            System.out.println(person);
        }







    }
}
