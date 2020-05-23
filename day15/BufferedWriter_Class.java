package cn.itcast.day15;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_Class {
    public static void main(String[] args) throws IOException {
        // 1、创建一个字符缓冲输出流对象，构造方法中传递字符输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/cn/itcast/day15/package/d.txt"));
        // 2、调用字符缓冲输出流中的方法write，将数据写入到内存缓冲区中
        for(int i = 0; i < 10; i++){
            bw.write("我只想开个学");
            bw.newLine();
        }
        // 3、调用字符缓冲输出流中的方法flush将内存缓冲区中的数据，刷新到文件中
        bw.flush();
        // 4、释放资源
        bw.close();
        System.out.println("写入完毕");
    }
}
