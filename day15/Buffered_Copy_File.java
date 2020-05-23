package cn.itcast.day15;

import java.io.*;

public class Buffered_Copy_File {
    public static void main(String[] args)throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/cn/itcast/day15/day15笔记"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/cn/itcast/day15/package/day15笔记"));
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes)) != -1){
            bos.write(bytes, 0, len);
        }
        bis.close();
        bos.close();
        System.out.println("文件复制完毕");
    }
}
