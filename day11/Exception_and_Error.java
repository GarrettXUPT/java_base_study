package cn.itcast.day11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exception_and_Error {
    public static void main(String[] args){
        show03();
    }

    private static void show01() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        Date date = sdf.parse("1999.09.09"); // 将字符串格式的日期格式化为Date格式的日期,这里通过Throws将异常进行了抛出，但是影响后续代码的执行
        System.out.println(date);
    }

    private static void show02(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        Date date = null;
        try {
            date = sdf.parse("1999.0909"); // 将字符串格式的日期格式化为Date格式的日期,这里将异常进行了捕获，使其不影响后续代码的执行
        }catch (ParseException e){
            e.getStackTrace();
        }
        System.out.println(date);
        System.out.println("后续代码");
    }

    private static void show03(){
        int[] arr = new int[]{1, 2, 3};
        try {
            // 可能会出现异常的代码
            System.out.println(arr[3]);  // 会有索引越界异常,对运行期异常进行捕获
        }catch (RuntimeException r){
             // r.getStackTrace();
            // System.out.println(r.getMessage());  // Index 3 out of bounds for length 3
            // System.out.println(r.toString());  // java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
            r.printStackTrace();
        }
        System.out.println("后续代码");
    }

    private static void show04(){
        // Error
        int[] arr = new int[1024 * 1024 * 1024];
        // 会出现内存超出错误OutOfMemoryError，该处错误必须通过修改源代码来解决，否则错误永远存在
    }
}


















