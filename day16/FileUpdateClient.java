package cn.itcast.day16;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class FileUpdateClient {
    /*
    *   TCP通信的文件上传：
    *       原理：客户端读取本地的文件，将文件上传到服务器，然后将上传的文件保存在服务器的硬盘上
    *       1、客户端要使用本地的字节输入流，读取要上传的文件
    *       2、客户端使用网络字节输出流，将上传的文件读取到服务器
    *       3、服务器使用网络字节输入流，读取客户端上传的文件
    *       4、服务器使用本地的字节输出流，将读取到的文件保存到服务器的硬盘上
    *       5、服务器使用网络字节输出流，给客户端回写上传成功提示
    *       6、客户端使用网络字节输入流，读取服务器回写的数据
    *       7、释放资源
    *   注意事项：
    *       客户端和服务器与本地硬盘进行读写，使用自己创建的字节流对象(本地流)
    *       客户端与服务器进行读写，必须使用Socket中使用的字节流对象(网络流)
    *   文件上传的原理就是文件的复制，需要明确数据源和数据的目的地
    * */
    public static void main(String[] args) throws IOException {
        // 1、创建一个本地字节输入流FIleInputStream对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("src/cn/itcast/day16/Client/day16笔记");
        // 2、创建一个客户端Socket对象，构造方法中绑定服务器的IP地址和端口
        Socket socket = new Socket("192.168.3.2", 8888);
        // 3、使用Socket中的方法getOutputStream, 获取网络字节输出流对象
        OutputStream os = socket.getOutputStream();
        // 4、使用网络字节输出流FileInputStream对象中的read方法,读取本地文件
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1){
            // 5、使用网络输出字节流OutputStream方法write将数据传输到服务器
            os.write(bytes, 0, len);
        }
        socket.shutdownOutput();
        // 6、使用Socket对象中的getInputStream，获取网络输入字节流InputStream对象
        InputStream is = socket.getInputStream();
        while ((len = is.read(bytes)) != -1){
            // 7、使用网络字节输入流InputStream对象中的方法read读取服务器回写的数据
            System.out.println(new String(bytes, 0, len));
        }
        // 8、释放资源
        socket.close();
        fis.close();



    }
}
