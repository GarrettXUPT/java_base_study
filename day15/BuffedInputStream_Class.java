package cn.itcast.day15;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BuffedInputStream_Class {
    public static void main(String[] args) throws IOException {
        //  1、创建一个FileInputStream对象，构造方法中绑定读取的数据源
        FileInputStream fis = new FileInputStream(new File("src/cn/itcast/day15/package/c.txt"));
        //  2、创建一个BufferedInputStream对象，构造方法中传递FileInputStream对象，提高BuffedInputStream对象的读取效率
        BufferedInputStream bis = new BufferedInputStream(fis);
        //  3、使用BuffedInputStream对象中的方法read读取文件
        byte[] bytes = new byte[1024];
        int len = 0;  // 记录每次读取到的字节
        while ((len = fis.read(bytes)) != -1){
            System.out.println(new String(bytes, 0, len));
        }
        //  4、释放资源
        fis.close();
    }
}
