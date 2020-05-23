package cn.itcast.day15;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStream_Class {

    // ClassNotFoundClassException Class文件找不到异常
    // 当不存在Class文件时，抛出异常
    // 反序列化的前提：
    //  1、类必须实现Serializable接口
    //  2、类必须存在对应的Class文件
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 1、创建一个ObjectInputStream对象，构造方法中传递字节输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/cn/itcast/day15/package/Person"));
        // 2、使用ObjectInputStream对象的方法readObject方法，读取保存对象的文件
        Object obj = ois.readObject();
        // 3、释放资源
        ois.close();
        // 4、使用读取出来的对象，可以直接打印
        System.out.println(obj);  // Person{name='Garrett', age=13}
        Person person = (Person)obj;
        System.out.println(person.getName() + "  " + person.getAge());
    }
}
