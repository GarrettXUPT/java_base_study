package cn.itcast.day16;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
*   TCP通信的客户端，向服务器发送连接请求，给服务器发送数据，读取服务器回写的数据
*   表示客户端的类：
*       java.net.Socket
* */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        // 1、创建一个客户端对象Socket，构造方法绑定服务器的IP地址和端口号
        Socket socket = new Socket("192.168.3.2",8888);
        // 2、使用Socket对象中的方法getOutputStream()获取网络字节输出流对象OutputStream
        OutputStream outputStream = socket.getOutputStream();
        // 3、使用网络字节输出流对象OutputStream方法write向服务器发送数据
        outputStream.write("你好服务器".getBytes());
        // 4、使用Socket对象中的方法getInputStream()获取网络字节输入流对象InputStream
        InputStream is = socket.getInputStream();
        // 5、网络字节输入流对象InputStream的方法read读取服务器回写的数据
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes, 0, len));
        // 6、释放资源
        socket.close();
    }
}
