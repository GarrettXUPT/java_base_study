package cn.itcast.day15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader_Class {
    public static void main(String[] args) throws IOException {
        // 1、创建一个字符缓冲输入流对象，构造方法中传递字符输入流
        BufferedReader br = new BufferedReader(new FileReader("src/cn/itcast/day15/package/d.txt"));
        // 2、使用字符缓冲输入流对象中的方法read/readline读取文本
//        int len = 0;
//        while ((len = br.read()) != -1){
//            String line = br.readLine();
//            System.out.println(line);
//        }
        String line;
        while ((line = br.readLine()) != null)
        {
            System.out.println(line);
        }
        // 3、释放资源
        br.close();
    }
}
