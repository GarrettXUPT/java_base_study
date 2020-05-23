package cn.itcast.day14;

/*
* 文件复制的原理
*   所有的文件都是以字节来存储的，所以都可以使用文件读取来完成，然后再写到指定的文件中
* */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy_Class  {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new File("src/cn/itcast/day14/day14笔记"));
        FileOutputStream fos = new FileOutputStream(new File("src/cn/itcast/day14/testPackage/day14笔记"));
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read()) != -1){
            fos.write(bytes,0,len);
        }
        // 在读写同时使用时，释放资源，要先释放写，再释放读
        fos.close();
        fis.close();
        System.out.println("文件复制完毕");
    }
}
