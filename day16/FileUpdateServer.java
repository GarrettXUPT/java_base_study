package cn.itcast.day16;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class FileUpdateServer {
    // TCP文件上传案例的服务器端
    /*
    * 实现步骤：
    *   1、创建一个服务器ServerSocket对象，和系统要指定的端口号
    *   2、使用服务器的ServerSocket对象方法accept，获取请求的客户端Socket对象
    *   3、使用Socket对象中的方法getInputStream，获取到网络字节输入流对象InputStream
    *   4、判断服务器接收文件的文件夹是否存在，不存在则创建一个
    *   5、创建一个本地的字节输出流对象OutputStream，构造方法中要绑定要输出的目的地
    *   6、使用网络字节输入流InputStream对象中的方法read，读取客户端上传的文件
    *   7、使用本地字节输出流对象，将读取到的数据利用write方法写到数据输出目的地中
    *   8、使用Socket对象中的getOutputStream，获取到网络字节输出流OutputStream对象
    *   9、使用网络字节输出流对象的write方法，将传输结果回写给客户端
    *   10、释放资源
    * */
    public static void main(String[] args) throws IOException {
        // 1、创建一个服务器ServerSocket对象，和系统要指定的端口号
        ServerSocket serverSocket = new ServerSocket(8888);
        // 2、使用服务器的ServerSocket对象方法accept，获取请求的客户端Socket对象
        /*
        *   应该使服务器一直处于监听状态(死循环accept)
        *   有一个客户上传一个文件，那就保存一个文件
        * */
        while (true){
            Socket socket = serverSocket.accept();
            /*
            *   使用多线程，提高程序效率
            *   有客户端上传文件，就可以开启一个线程，完成文件的上传
            * */
            new Thread(new Runnable() {
                @Override
                // 完成文件的上传
                public void run() {
                    try {
                        // 3、使用Socket对象中的方法getInputStream，获取到网络字节输入流对象InputStream
                        InputStream is = socket.getInputStream();
                        // 4、判断服务器接收文件的文件夹是否存在，不存在则创建一个
                        File file = new File("src/cn/itcast/day16/Sever");
                        if(!file.exists()){
                            file.mkdir();
                        }
                        /*
                         *   此处应该自定义文件的上传规则，规则：域名 + 毫秒值 + 随机数
                         * */
                        String filename = "Walker" + System.currentTimeMillis() + new Random().nextInt(999999) + ".txt";

                        // 5、创建一个本地的字节输出流对象OutputStream，构造方法中要绑定要输出的目的地
                        FileOutputStream fos = new FileOutputStream(file  + "//" + filename);
                        // 6、使用网络字节输入流InputStream对象中的方法read，读取客户端上传的文件
                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while ((len = is.read(bytes)) != -1){
                            // 7、使用本地字节输出流对象，将读取到的数据利用write方法写到数据输出目的地中
                            fos.write(bytes);
                        }
                        // 8、使用Socket对象中的getOutputStream，获取到网络字节输出流OutputStream对象
                        OutputStream os = socket.getOutputStream();
                        // 9、使用网络字节输出流对象的write方法，将传输结果回写给客户端
                        os.write("文件上传成功".getBytes());
                        // 10、释放资源(此时服务器不需要关闭)
                        socket.close();
                        fos.close();
                    }catch (IOException ie){
                        System.out.println(ie);
                    }
                }
            }).start();

        }







    }
}
