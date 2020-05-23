package cn.itcast.day07;
import java.util.Date;

public class Date_Class {
    public static void main(String[] args) {
        // 获取当前系统的毫秒值，即从1970.01.01 00:00:00经历了多少毫秒
        System.out.println(System.currentTimeMillis());// 1584493706621

        // 打印当前日期
        Date date1 = new Date();
        System.out.println(date1);  //  Wed Mar 18 09:11:54 CST 2020
        // 将毫秒值，转化为对应日期
        Date date2 = new Date(1582031931949L);
        System.out.println(date2);  // Wed Mar 18 09:08:26 CST 2020
        // 将日期转化为毫秒
        System.out.println(date2.getTime());
    }
}
