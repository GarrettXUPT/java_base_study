package cn.itcast.day15;

import java.io.*;
import java.util.HashMap;

public class File_Sort {

    /*
    *  练习：对文本进行排序，按照1、2、3、4排序
    *  分析：
    *   1、创建一个HashMap集合对象，存储每行文本的序号(1,2,3,4);value，存储每行的文本
    *   2、创建字符缓冲输入流对象，在构造方法中传递字符输入流
    *   3、创建字符缓冲输出流对象，在构造方法中传递字符输出流
    *   4、使用字符缓冲输入流中的方法，readline逐行读取文本
    *   5、对读取到的文本进行切割，获取行中的序号和文本内容
    *   6、将切割好的序号和文本内容存储到HashMap集合中，HashMap的key是有序的，会自动地排序
    *   7、遍历HashMap集合，获取每一个键值对
    *   8、把每一个键值对拼接为一个文本行
    *   9、把拼接好的文本行，使用字符缓冲输出流的write方法，写入到文件中
    *   10、释放资源
    * */
    public static void main(String[] args) throws IOException {
        // 1、创建一个HashMap集合对象，存储每行文本的序号(1,2,3,4);value，存储每行的文本
        HashMap<String, String> hashMap = new HashMap<>();
        // 2、创建字符缓冲输入流对象，在构造方法中传递字符输入流
        BufferedReader br = new BufferedReader(new FileReader("src/cn/itcast/day15/package/Test_in.txt"));
        // 3、创建字符缓冲输出流对象，在构造方法中传递字符输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/cn/itcast/day15/package/Test_out.txt"));
        // 4、使用字符缓冲输入流中的方法，readline逐行2读取文本
        String line;
        while ((line = br.readLine()) != null){
            String[] arr = line.split("\\.");
            // 6、将切割好的序号和文本内容存储到HashMap集合中，HashMap的key是有序的，会自动地排序
            hashMap.put(arr[0], arr[1]);
        }
        // 7、遍历HashMap集合，获取每一个键值对
        for (String key : hashMap.keySet()){
            String value = hashMap.get(key);
            // 8、把每一个键值对拼接为一个文本行
            line = key + '.' + value;
            // 9、把拼接好的文本行，使用字符缓冲输出流的write方法，写入到文件中
            bw.write(line);
            bw.newLine();
        }
        // 10、释放资源
        br.close();
        bw.close();
    }
}
