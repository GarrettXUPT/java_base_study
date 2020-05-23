package cn.itcast.day07;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat_Class {
    public static void main(String[] args) throws ParseException {
        // 将DateFormat中的format方法，将日期格式化为文本
        // 使用步骤：
        // 1、创建SimpleDateFormat对象，构造方法中传递指定的模式
        // 2、调用SimpleDateFormat对象中的format，按照构造方法中的模式，将Date日期格式化为复合模式的字符串
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = new Date();
        String d = sdf.format(date);

        System.out.println(d);  // 2020年02月18日 21时41分822秒
        System.out.println(date);   // Tue Feb 18 21:41:49 CST 2020

        // 将DateFormat中的parse方法，将文本转化为日期
        // 使用步骤：
        // 1、创建SimpleDateFormat对象，构造方法中传递指定的模式
        // 2、调用SimpleDateFormat对象中的parse，将勾走方法中的字符串转化为日期
        // 注意：public Date parse(String source) throws ParseException
        //      parse方法声明了一个异常，解析失败，若构造方法的模式和字符串不一致，就会抛出此异常，可以通过try catch进行自己处理
        Date date1 = sdf.parse("2020年02月18日 21时48分11秒");
        System.out.println(date1);  // Tue Feb 18 21:48:11 CST 2020
    }

}
