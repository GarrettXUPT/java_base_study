package cn.itcast.day15;

import java.io.*;

public class The_Code_Translation {
    /*
    * 将GBK编码的文件转化为UTF-8的文件
    * 分析：
    *   1、使用InputStreamReader对象构造方法中传递字节输入流和指定的编码表名称
    *   2、创建OutputStreamWriter对象构造方法中传递字节输出流和指定的编码表名称
    *   3、使用InputStreamReader对象方法read读取GBK文件
    *   4、使用OutputStreamWriter对象方法write将读取的文件写入到UTF-8的新文件中
    *   5、释放资源
    * */
    public static void main(String[] args) throws IOException {
        // 1、使用InputStreamReader对象构造方法中传递字节输入流和指定的编码表名称
        InputStreamReader isr = new InputStreamReader(new FileInputStream("F:\\C_updata\\day03\\the_arr_of_point.c"),"gbk");
        // 2、创建OutputStreamWriter对象构造方法中传递字节输出流和指定的编码表名称
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("F:\\C_updata\\day03//arrPoint.c"), "utf-8");
        // 3、使用InputStreamReader对象方法read读取文件
        int len = 0;
        while ((len = isr.read()) != -1){
            // 4、使用OutputStreamWriter对象方法write将读取的文件写入到新文件中
            osw.write((char)len);
        }
        isr.close();
        osw.close();
        System.out.println("转换完毕");
    }
}
