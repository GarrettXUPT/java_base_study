package cn.itcast.day15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

// 使用序列化时会抛出NotSerializableException没有序列化异常
// 类通过实现java.io.Serializable接口启动序列化功能，未实现此接口的，不能使用任何状态的序列化和反序列化
// Serializable接口为标记型接口，要进行序列化和反序列化的类必须实现Serializable接口，就会给类添加一个标记
// 当进行序列化和反序列化时候，就会检测是否有这个标记，如果有，就可以序列化和反序列化，若没有，就会抛出异常
public class ObjectOutputStream_Class {
    public static void main(String[] args) throws IOException {
        // 1、创建一个ObjectOutputStream对象，构造方法中传递字节输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/cn/itcast/day15/package/Person"));
        // 2、使用ObjectOutputStream对象中的方法writeObject将对象写入到文件中
        oos.writeObject(new Person("Garrett",13));
        oos.writeObject(new Person("Garrett",14));
        // 3、资源释放
        oos.close();
    }
}

