package cn.itcast.day15;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReader_Class {
    public static void main(String[] args) throws IOException {
        // read_utf_8();
        read_gbk();
    }


    /*
    * 使用utf-8编码读取文件数据，以指定的编码方式读写文件
    * */
    public static void read_utf_8() throws IOException {
        //  1、创建一个InputStreamReader对象，构造方法中传递字节输入流和指定的字节编码表名称
        InputStreamReader isr = new InputStreamReader(new FileInputStream("src/cn/itcast/day15/package/utf-8.txt"), "utf-8");
        //  2、使用InputStreamReader对象中的方法read读取文件
        int len = 0;
        while ((len = isr.read()) != -1){
            System.out.println((char)len);
        }
        //  3、释放资源
        isr.close();
    }

    /*
     * 使用utf-8编码读取文件数据
     * */
    public static void read_gbk() throws IOException {
        //  1、创建一个InputStreamReader对象，构造方法中传递字节输入流和指定的字节编码表名称
        InputStreamReader isr = new InputStreamReader(new FileInputStream("src/cn/itcast/day15/package/utf-8.txt"), "gbk");
        //  2、使用InputStreamReader对象中的方法read读取文件
        int len = 0;
        while ((len = isr.read()) != -1){
            System.out.println((char)len);
        }
        //  3、释放资源
        isr.close();
    }
}
