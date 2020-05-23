package cn.itcast.day14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer_Class {
    public static void main(String[] args) throws IOException {
        show03();
    }

    // 使用字符数组写入
    public static void show01() throws IOException{
        // 1、创建FileWriter对象，构造方法中要绑定写入数据的目的地
        FileWriter fw = new FileWriter(new File("src/cn/itcast/day14/testPackage/d.txt"));
        // 2、使用FileWriter对象中的方法write,将数据写入到内存缓冲区中(字符转换为字节的过程)
        char[] ch = new char[]{97, 98, 99};
        fw.write(ch);
        // 3、使用FileWriter对象中的方法flush，将内存缓冲区中的数据刷新到文件中
        fw.flush();
        // 4、释放资源(会将内存缓冲区中的内容刷新到文件中)
        fw.close();
        System.out.println("写入成功");
    }

    // 数组部分写入
    public static void show02() throws IOException{
        FileWriter fw = new FileWriter(new File("src/cn/itcast/day14/testPackage/e.txt"));
        char[] ch = new char[]{'d', 'e', 'f', 'g', 'h'};
        fw.write(ch,1,3);
        fw.flush();
        fw.close();
        System.out.println("写入成功");
    }

    // 以字符串形式写入，并进行续写和换行
    public static void show03() throws IOException{
        FileWriter fw = new FileWriter(new File("src/cn/itcast/day14/testPackage/f.txt"),true);
        fw.write("我觉得你可以\r\n");
        fw.write("你真的这么想吗");
        fw.flush();
        fw.close();
        System.out.println("写入成功");
    }
}
