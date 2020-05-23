package cn.itcast.day15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriter_Class {
    public static void main(String[] args) throws IOException {
        // write_utf_8();
        write_gbk();
    }

    // 使用OutputStreamWriter写utf-8的文件
    public static void write_utf_8() throws IOException {
        // 1、创建一个OutputStreamWriter对象，它的构造方法中传递字节输出流和指定的编码表名称
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("src/cn/itcast/day15/Package/utf-8.txt"),"utf-8");
        // 2、使用OutputStreamWriter对象中的方法write，将字符转换为字节存储到缓冲区中
        osw.write("我想开学");
        // 3、使用OutputStreamWriter对象中的方法flush，将内存缓冲区中的字节刷新到文件中(使用字节流写字节的过程)
        osw.flush();
        // 4、释放资源
        osw.close();
        System.out.println("写入成功");
    }

    // 使用OutputStreamWriter写utf-8的文件
    public static void write_gbk() throws IOException {
        // 1、创建一个OutputStreamWriter对象，它的构造方法中传递字节输出流和指定的编码表名称
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("src/cn/itcast/day15/Package/gbk.txt"),"gbk");
        // 2、使用OutputStreamWriter对象中的方法write，将字符转换为字节存储到缓冲区中
        osw.write("我真的想开学");
        // 3、使用OutputStreamWriter对象中的方法flush，将内存缓冲区中的字节刷新到文件中(使用字节流写字节的过程)
        osw.flush();
        // 4、释放资源
        osw.close();
        System.out.println("写入成功");
    }
}
