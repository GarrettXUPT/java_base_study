package cn.itcast.day14;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reader_Class {
    public static void main(String[] args) throws IOException {
        // 1、创建一个FileReader对象，构造方法中绑定要读取的数据源
        FileReader fr = new FileReader(new File("src/cn/itcast/day14/testPackage/f.txt"));
        // 2、使用FileReader对象的read方法，使其读取文件

        int len = 0;
        char[] ch = new char[1024];
        while ((len = fr.read(ch)) != -1){
            System.out.println(new String(ch, 0, len));
        }  // Hello WorldGarrett Wallker你好啊米娜桑
        // 释放资源
        fr.close();
    }
}
