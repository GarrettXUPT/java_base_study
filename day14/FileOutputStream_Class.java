package cn.itcast.day14;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_Class {
    public static void main(String[] args) throws IOException {
        show04();
    }

    /*
    *  一次写入一个字节举例
    * */
    public static void show01() throws IOException{
        // 1、创建一个FileOutputStream对象，构造方法中传递使用方法的目的地
        FileOutputStream fos = new FileOutputStream("src/cn/itcast/day14/a.txt");
        // 2、调用FileOutputStream对象中的write方法，将数据写入文件中
        fos.write(97);  // 在写入时，会将十进制整数转化为二进制整数，因盘中存储的数据都是字节(1字节 = 8比特位)
        // 任意的记事本，再打开文件时，都会查询编码表，将字节转换为字符表示，这里文件存储的是a
        // 0-127:查询的是ASCII码表，其他的查询的都是GBK编码表
        System.out.println("写入完毕");
        // 3、释放资源(流会占用内存，清空流会提高程序的效率)
        fos.close();
    }
    /*
    * 一次写入多个字节
    * */
    public static void show02() throws IOException{
        // 1、创建一个FileOutputStream对象，构造方法中传递使用方法的目的地
         FileOutputStream fos = new FileOutputStream(new File("src/cn/itcast/day14/testPackage/b.txt"));
        // 2、调用FileOutputStream对象中的write方法，将数据写入文件中，写入文件时，将这些int型数字转化为对应的ASCII码
        // public void write(byte[] b) 将b.length字节从指定字节数组写入该输出流
        byte[] b = new byte[]{65, 66, 67, 68, 69};  // ABCDE
        byte[] c = new byte[]{-65, -66, -67, 68, 69};  // ABCDE
        fos.write(b,0,3);
        // 3、释放资源(流会占用内存，清空流会提高程序的效率)
        fos.close();
        System.out.println("写入成功");
    }
    /*
     * 一次写入多个字节，使用String的getBytes方法
     * */
    public static void show03() throws IOException{
        // 1、创建一个FileOutputStream对象，构造方法中传递使用方法的目的地
        FileOutputStream fos = new FileOutputStream(new File("src/cn/itcast/day14/testPackage/b.txt"));
        // 2、调用String类中的getBytes方法
        byte[] bytes = "Hello World".getBytes();  // 将字符串先转化为字节，然后写入文件
        fos.write(bytes);
        // 3、释放资源(流会占用内存，清空流会提高程序的效率)
        fos.close();
        System.out.println("写入成功");
    }

    /*
    * 追加写入
    * */
    public static void show04() throws IOException{
        FileOutputStream fos = new FileOutputStream(new File("src/cn/itcast/day14/testPackage/b.txt"),true);
        String str = "Garrett Wallker";
        byte[] bytes = str.getBytes();
        fos.write(bytes);
        fos.close();
        System.out.println("写入成功");
    }

    /*
    *换行写入/
     */
    public static void show05() throws IOException{
        FileOutputStream fos = new FileOutputStream(new File("src/cn/itcast/day14/testPackage/c.txt"),true);
        for(int i = 0; i < 10; i++){
            fos.write("快开学\r\n".getBytes());
        }
        System.out.println("写入成功");
        fos.close();
    }
}
