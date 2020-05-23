package cn.itcast.day15;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStream_Class {
    /*
    *  可以改变打印输出语句的目的地(打印流的语句)
    *  输出语句：默认在控制台输出
    *  使用System.setOut方法，改变输出语句的目的地参数传递输出的地址
    *  static void setOut(PrintStream out)
    * */
    public static void main(String[] args) throws IOException {
        System.out.println("我在控制台输出");

        // 以下为打印到目的文件的全套操作
        PrintStream ps = new PrintStream("src/cn/itcast/day15/package/打印流目的地.txt");
        System.setOut(ps);  // 将内容打印至目的地中的文件中
        System.out.println("我在打印的目的地中输出");
        ps.close();
    }
}
