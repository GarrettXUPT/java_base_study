package cn.itcast.day13;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Di_Gui_Class {
    public static void main(String[] args) {
        int a = sum(5);
        System.out.println(a);  // 15

        int b = multiply(5);
        System.out.println(b);  // 120

        File f1 = new File("C:\\Users\\13546\\Desktop\\java_study\\src\\cn\\itcast\\day13");
        // printDir(f1);
        // printDirs(f1);
        // Expore(f1);
        printdirsAll(f1);
    }

    // 使用递归计算累加求和
    public static int sum(int n){
        if(n == 0){
            return 0;
        }
        return sum(n - 1) + n;
    }

    // 使用递归来求阶乘
    public static int multiply(int n){
        if(n == 1){
            return 1;
        }
        return multiply(n - 1) * n;
    }

    // 递归打印多及目录:打印不完全,对子目录中等内容没有进行打印
    public static void printDir(File dir){
         File[] files = dir.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
    // 递归打印多及目录:打印完全
    /*
    *   对遍历得到的File进行判断，若是文件夹，则继续向下遍历
    * */
    public static void printDirs(File dir){
        File[] files = dir.listFiles();
        for (File file : files) {
            if(file.isDirectory()){
                printDirs(file);
            }else {
                System.out.println(file);
            }
        }
    }

    // 文件搜索，只要java结尾的文件
    public static void Expore(File dir){
        File[] files = dir.listFiles();
        for (File file : files) {
            if(file.isDirectory()){
                printDirs(file);
            }else {
                // file的内容不是字符串，需要先将其转化为字符串
                String fileStr = file.toString();
                // 使用endwith方法，判断是否以java结尾
                if(fileStr.endsWith(".java")){
                    System.out.println(file);
                }
            }
        }
        // C:\Users\13546\Desktop\java_study\src\cn\itcast\day13\Calculate.java
        //C:\Users\13546\Desktop\java_study\src\cn\itcast\day13\Di_Gui_Class.java
        //C:\Users\13546\Desktop\java_study\src\cn\itcast\day13\File_Class.java
        //C:\Users\13546\Desktop\java_study\src\cn\itcast\day13\Lambda_example.java
        //C:\Users\13546\Desktop\java_study\src\cn\itcast\day13\Lambda_Exmaple_interface.java
        //C:\Users\13546\Desktop\java_study\src\cn\itcast\day13\Person.java
        //C:\Users\13546\Desktop\java_study\src\cn\itcast\day13\RunnableImpl.java
        //C:\Users\13546\Desktop\java_study\src\cn\itcast\day13\RunnbaleImpl_test.java
        //C:\Users\13546\Desktop\java_study\src\cn\itcast\day13\test\test.java
        //C:\Users\13546\Desktop\java_study\src\cn\itcast\day13\test\test2.java
    }

    // 使用文件过滤器实现文件搜索
    // 使用过滤器要明确的事：
    //  1、过滤器中的accept方法是谁调用的
    //  2、accept方法中接受的参数是什么？
    public static void printAll(File dir){
        File[] files = dir.listFiles(new FileFilterImpl());  // 传递的是过滤器对象
        // listFiles方法做的事情：
        // 1、listFiles方法可以对构造方法中传递的目录进行遍历，获取目录中的每一个文件/文件夹-->将其封装为File对象
        // 2、listFiles方法会调用参数传递的过滤器中的accept方法
        // 3、listFiles方法会将遍历的每一个File对象传递给accept方法的参数pathname

        for (File file : files) {
            if(file.isDirectory()){
                printAll(file);
            }else {
                System.out.println(file);
            }
        }
    }


    /*
    * 使用匿名类实现文件搜索以.java结尾的文件
    * */
    public static void printDirAll(File filename){
        File[] files = filename.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.getName().toLowerCase().endsWith(".java") || file.isDirectory();
            }
        });
        for (File file : files) {
            if(file.isDirectory()){
                printDirAll(file);
            }else {
                System.out.println(file);
            }
        }
    }

    // 使用另一个文件过滤器进行文件搜索
    public static void printdirsAll(File dir){
        File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File filepath, String s) {  // 这里的字符串指的是每个文件的名称
                return new File(filepath, s).isDirectory() || s.toLowerCase().endsWith(".java");
            }
        });
        for (File f : files) {
            if(f.isDirectory()){
                printdirsAll(f);
            }else {
                System.out.println(f);
            }
        }
    }
}
