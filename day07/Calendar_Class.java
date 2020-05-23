package cn.itcast.day07;
import java.util.Calendar;
import java.util.Date;

public class Calendar_Class {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance(); // 多态方法，创建该类对象
        demo01();
        demo02();
        demo03();
        demo04();
    }

    /*
    * public int get(int field)  返回日历字段的值
    * 参数：传递指定的日历字段(YEAR, MOUTH)
    * 返回值：日历字段代表的具体的值
    * */
    private static void demo01(){
        // 获取Calendar对象
        Calendar c = Calendar.getInstance();  // 使用的是多态
        int year = c.get(Calendar.YEAR);
        int mouth = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DAY_OF_MONTH);
        System.out.println("当前" + year + "年" + mouth + "月" + date + "日");
    }

    /*
    * public void set(int field, int value)
    * 参数：int field: 传递指定的日历字段(YEAR,MOUTH)
    *      int value: 给指定字段设定值
    *  将给定的日历字段，返回为给定值
     * */
    private static void demo02(){
        // 获取Calendar对象
        Calendar c = Calendar.getInstance();
        // 设置为2015年12月23日，此处需要注意的是，西方12月为0月
        c.set(Calendar.YEAR, 2015);
        int year = c.get(Calendar.YEAR);
        c.set(Calendar.MONTH, 12);
        int mouth = c.get(Calendar.MONTH);
        c.set(Calendar.DAY_OF_MONTH, 23);
        int date = c.get(Calendar.DATE);
        System.out.println("当前" + year + "年" + mouth + "月" + date + "日");
    }

    /*
    *  public abstract void add(int field, int amount)  根据日历的规则，将指定的时间量添加或减去给定的日历字段。
    *   参数：int field: 传递指定的日历字段(YEAR,MOUTH)
    *        int amount: 增加减少指定的值(正数：增加， 负数：减少)
     * */
    private static void demo03(){
        // 获取Calendar对象
        Calendar c = Calendar.getInstance();
        // 设置为2015年12月23日
        c.set(Calendar.YEAR, 2015);
        // 年增加5
        c.add(Calendar.YEAR, 5);
        int year = c.get(Calendar.YEAR);
        c.set(Calendar.MONTH, 12);
        // 月减去2
        c.add(Calendar.MONTH, -2);
        int mouth = c.get(Calendar.MONTH);
        c.set(Calendar.DAY_OF_MONTH, 23);
        int date = c.get(Calendar.DATE);
        System.out.println("当前" + year + "年" + mouth + "月" + date + "日");
    }
    /*
    * public Date getTime() 将日历转化为日期
    * */
    private static void demo04(){
        Calendar c = Calendar.getInstance();
        Date data = c.getTime();
        System.out.println(data);

    }

}
