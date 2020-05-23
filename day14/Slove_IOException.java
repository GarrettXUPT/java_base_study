package cn.itcast.day14;

import java.io.*;

public class Slove_IOException {
    public static void main(String[] args) {

        try(
                FileInputStream fis = new FileInputStream(new File("src/cn/itcast/day14/day14笔记"));
                FileOutputStream fos = new FileOutputStream(new File("src/cn/itcast/day14/testPackage/day14笔记"));
        ){
            int len = 0;
            while ((len = fis.read()) != -1){
                fos.write(len);
            }
        }catch (IOException ioe){
            System.out.println(ioe);
        }
        System.out.println("文件复制完毕");
    }


    // 使用try...catch捕获异常
    public static void show01() throws IOException{

        char[] ch = new char[]{'d', 'e', 'f', 'g', 'h'};
        // 提升变量的作用域
        FileWriter fw = null;
        try {
            fw = new FileWriter(new File("src/cn/itcast/day14/testPackage/g.txt"));
            fw.write(ch,1,3);
            fw.flush();
        }catch (IOException ioe){
            System.out.println(ioe);
        }finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("写入成功");
    }
}
