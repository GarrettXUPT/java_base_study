package cn.itcast.day16;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    // TCP通信服务器端
    public static void main(String[] args) throws IOException {
        // 1、创建ServerSocket对象，构造方法中传递指定的端口号
        ServerSocket serverSocket = new ServerSocket(8888);
        // 2、使用ServerSocket对象中的方法accept，获取到请求的客户端对象Socket
        Socket socket = serverSocket.accept();
        // 3、使用网络字节输出流对象OutputStream方法write向服务器发送数据
        InputStream is = socket.getInputStream();
        // 4、使用网络字节输出流InputStream对象中的方法read，读取客户端发送的数据
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes, 0, len));
        // 5、使用Socket对象中的方法getOutputStream()获取网络字节输出流对象OutputStream
        OutputStream os = socket.getOutputStream();
        // 6、使用网络字节输出流对象OutputStream对象中的方法write，给客户端回写数据
        os.write("收到了，谢谢".getBytes());
        // 7、释放资源
        serverSocket.close();
        socket.close();
    }
}
