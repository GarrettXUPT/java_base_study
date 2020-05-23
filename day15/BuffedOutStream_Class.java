package cn.itcast.day15;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class BuffedOutStream_Class {
    public static void main(String[] args) throws IOException {
        // 1、创建一个字节输出流FileOutputStream对象中绑定要输出的目的地
        FileOutputStream fos = new FileOutputStream(new File("src/cn/itcast/day15/package/c.txt"), true);
        // 2、创建BuffedOutStream对象，构造方法中传递字节输出流对象
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        // 3、使用BuffedOutStream对象中的方法write，将数据写入内部缓冲区中
        bos.write("你好啊，我想开学".getBytes());
        // 4、使用BuffedOutStream对象中的方法flush，将内部缓冲区中的数据刷新到文件中
        bos.flush();
        // 5、释放资源(先调用flush方法刷新数据，所以第四步是可以省略的)
        bos.close();
        System.out.println("数据写入完毕");
    }
}
