package cn.itcast.day13;

import java.io.File;

public class File_Class {
    public static void main(String[] args) {

        show07();
    }

    public static void show01(){
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);  // ; 表示路径分隔符 windows 分号 Linux 冒号

        String separator = File.separator;
        System.out.println(separator);  // \ 表示文件名称分隔符 windows 反斜杠 \ , Linux  正斜杠 /

        // 在以后工作中的路径，不能写死了，要区分windows和Linux系统
        // 以后的路径写法
        // " D:" + File.separator + " anaconda "
    }

    /*
    *   File(String pathname)
    *   通过将给定的路径名称字符串转换为抽象路径来创建一个File类实例
    *   参数：pathname 路径名称，路径可以是以文件结尾也可以使用文件夹结尾
    *        路径既可以是相对路径，也可以是绝对路径，路径可以是存在的也可以是不存在的
    *        创建File对象，只是将字符串路径封装为File类对象，不考虑路径的真假情况
    * */
    public static void show02(){
        File f1 = new File("C:\\Users\\13546\\Desktop\\java_study\\src\\cn\\itcast\\day13\\a.txt");
        System.out.println(f1);  // C:\Users\13546\Desktop\java_study\src\cn\itcast\day13\a.txt
        // 重写了Object类的toString方法
    }

    /*
    *   File(String parent, String child) 根据父类路径字符串和子类路径字符串创建一个新的File实例
    *   参数：将路径分为两部分 String parent 父路径 String child 子路径
    *   好处：父路径和子路径可以单独的书写，使用起来较为灵活，而且父路径和子路径都可以变化
    * */
    public static void show03(String parent, String child){
        File file = new File(parent, child);
        System.out.println(file);  // c:\\a.txt  show03("c:\\","a.txt");
    }
    /*
    *    File(File parent, String child) 根据父类路径字符串和子类路径字符串创建一个新的File实例
    *    好处：1、父路径和子路径可以单独的书写，使用起来较为灵活
    *         2、父路径是File类型，可以使用File类的方法对路径进行一些操作，再使用路径创建对象
    *
    * */
    public static void show04(){
        File parent = new File("c:\\");
        File file = new File(parent, "a.txt");
        System.out.println(file);  // c:\a.txt
    }

    public static void show05(){
        // public String getAbsolutePath()  // 返回File类的绝对路径字符串,
        //  获取的是构造方法中传递的路径，无论路径是绝对的还是相对的，该方法返回的都是绝对路径
        // public String getPath()  将File类转化为路径字符串
        //  获取的是构造方法中传递的路径
        // public String getName()  返回由File表示的文件或者目录文件夹名称
        //  获取的是构造方法传递路径的结尾部分(文件/文件夹)
        // public long length()  返回由File表示的文件的长度，获取的是文件的大小
        //  获取的是构造方法指向文件的大小，以字节为单位
        //  文件夹是没有大小概念的，不能获取文件夹大小,强行获取的大小是0
        // 若构造方法中的路径不存在，那么该方法返回的是0
        File f1 = new File("C:\\Users\\13546\\Desktop\\java_study\\src\\cn\\itcast\\day13\\a.txt");
        String absolutePath1 = f1.getAbsolutePath();
        System.out.println(absolutePath1);  // C:\Users\13546\Desktop\java_study\src\cn\itcast\day13\a.txt

        File f2 = new File("a.txt");
        String absolutePath2 = f2.getAbsolutePath();
        System.out.println(absolutePath2);  // C:\Users\13546\Desktop\java_study\a.txt

        File f3 = new File("C:\\Users\\13546\\Desktop\\java_study\\src\\cn\\itcast\\day13\\a.txt");
        File f4 = new File("a.txt");

        String path1 = f3.getPath(); // f3.toString 效果与该效果相同，即证明在File类中toString方法，掉的就是getPath方法
        String path2 = f4.getPath();

        System.out.println(path1);  // C:\Users\13546\Desktop\java_study\src\cn\itcast\day13\a.txt
        System.out.println(path2);  // a.txt

        String pack = f3.getName();
        System.out.println(pack);  // a.txt

        File f5 = new File("C:\\Users\\13546\\Desktop\\java_study\\src\\cn\\itcast\\day13");
        String name = f5.getName();
        System.out.println(name);  // day13

        File f6 = new File("C:\\Users\\13546\\Desktop\\java_study\\src\\cn\\itcast\\day13\\day13笔记");
        long length1 = f6.length();
        System.out.println(length1);  // 2895
    }

    public static void show06(){
        // public boolean exits()  // 判断构造方法中的路径是否存在
        // 下面两个方法使用的前提是构造方法中的文件路径必须存在
        // public boolean isDirectory()  // 判断File表示的是否为目录
        // public boolean isFile()  // 判断File表示的是否为文件

        File f1 = new File("C:\\Users\\13546\\Desktop\\java_study\\src\\cn\\itcast\\day13\\day13笔记");
        boolean judge1 = f1.exists();
        System.out.println(judge1);  // true

        boolean judge2 = f1.isDirectory();
        System.out.println(judge2); // false

        boolean judge3 = f1.isFile();
        System.out.println(judge3);  // true
    }

    public static void show07(){
        // public String[] list() 返回一个String的数组，表示File目录中所有的子文件或者是目录
        //  若构造方法中的路径或者目录不存在，则会抛出空指针异常
        //  若构造方法中文件给出的路径不是一个目录，也会抛出空指针异常
        // public File[] listFiles() 返回一个File类数组，表示File目录下所有的子文件或者是目录
        //  遍历构造方法中给出的目录，会获取目录中所有的文件/文件夹，将文件或者是文件夹封装为File对象
        File f1 = new File("C:\\Users\\13546\\Desktop\\java_study\\src\\cn\\itcast\\day13");
        String[] strArr = f1.list();
        for(String s : strArr){
            System.out.println(s);
        }
        // Calculate.java
        //day13笔记
        //File_Class.java
        //Lambda_example.java
        //Lambda_Exmaple_interface.java
        //Person.java
        //RunnableImpl.java
        //RunnbaleImpl_test.java

        File[] fileArr = f1.listFiles();
        for (File file : fileArr) {
            System.out.println(file.toString());
        }

        // C:\Users\13546\Desktop\java_study\src\cn\itcast\day13\Calculate.java
        //C:\Users\13546\Desktop\java_study\src\cn\itcast\day13\day13笔记
        //C:\Users\13546\Desktop\java_study\src\cn\itcast\day13\File_Class.java
        //C:\Users\13546\Desktop\java_study\src\cn\itcast\day13\Lambda_example.java
        //C:\Users\13546\Desktop\java_study\src\cn\itcast\day13\Lambda_Exmaple_interface.java
        //C:\Users\13546\Desktop\java_study\src\cn\itcast\day13\Person.java
        //C:\Users\13546\Desktop\java_study\src\cn\itcast\day13\RunnableImpl.java
        //C:\Users\13546\Desktop\java_study\src\cn\itcast\day13\RunnbaleImpl_test.java
    }
}
