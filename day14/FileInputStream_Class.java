package cn.itcast.day14;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStream_Class {
    public static void main(String[] args) throws IOException {
       show01();
    }

    /*
    * 读取一个字节
    * */
    public static void show01() throws IOException{
        // 1、创建FileInputStream对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream(new File("src/cn/itcast/day14/testPackage/a.txt"));
        // 2、使用FileInputStream对象的read读取文件
        int len = fis.read();
        System.out.println("读到的第一个字节 " + len);
        // 读取一个文件之后，会将指针向后移动，读取第二个数据
        len = fis.read();
        System.out.println("读到的第二个字节 " + len);
        len = fis.read();
        System.out.println("读到的第三个字节 " + len);
        len = fis.read();
        System.out.println("读到的第四个字节 " + len);  // 读取到-1就说明读取已经结束了
        // 3、释放流的资源
        fis.close();
    }

    /*
    * 循环读取字节
    * */
    public static void show02() throws IOException{
        FileInputStream fis = new FileInputStream(new File("src/cn/itcast/day14/testPackage/a.txt"));
        int len = 0;
        int i = 0;
        while ((len = fis.read()) != -1){
            i++;
            System.out.println("读取到第" + i + "个字节为：" + len);
        }
        fis.close();
    }

    /*
    * 字节输入流，一次读取多个字节的方法
    * */
    public static void show03() throws IOException{
        FileInputStream fis = new FileInputStream(new File("src/cn/itcast/day14/testPackage/b.txt"));
        byte[] bytes = new byte[2];
        int len = fis.read(bytes);
        System.out.println(len);
        System.out.println(new String(bytes));  // He
        fis.close();
    }

    /*
    * 使用循环使字节流读取多个字节
    * */
    public static void show04() throws IOException{
        FileInputStream fis = new FileInputStream(new File("src/cn/itcast/day14/testPackage/b.txt"));
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }
        // Hello WorldGarrett Wallker
    }
}
